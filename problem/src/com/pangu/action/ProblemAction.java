package com.pangu.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pangu.po.TAnswer;
import com.pangu.po.TAnswerExample;
import com.pangu.po.TAnswerExample.Criteria;
import com.pangu.po.TProblem;
import com.pangu.po.TProblemExample;
import com.pangu.po.TUserProAnswer;
import com.pangu.po.TUserProAnswerExample;
import com.pangu.po.basePo.ReturnObj;
import com.pangu.service.IAnswerService;
import com.pangu.service.IProblemService;
import com.pangu.service.IUserProAnswerService;

@Controller
@RequestMapping("/problemAction")
public class ProblemAction {

	@Resource
	private IProblemService problemService;
	@Resource
	private IAnswerService answerService;
	@Resource
	private IUserProAnswerService userProAnswerService;

	
	/**
	 *  problemAction/problemList.do
	 * 查询所有问题接口
	 * @return
	 */
	@RequestMapping("problemList")
	@ResponseBody
	public ReturnObj problemList(long page_id){
		ReturnObj reObj=new ReturnObj();
		TProblemExample example=new TProblemExample ();
		com.pangu.po.TProblemExample.Criteria c=example.createCriteria();
		c.andPageIdEqualTo(page_id);
		List<TProblem> list=problemService.selectByExample(example);
		if(list!=null){
			reObj.setCode(1);
			reObj.setMsg("查询成功");
			reObj.setResult(list);
		}else{
			reObj.setMsg("查询失败");
		}
		return reObj;
	}
	
	/**
	 *  problemAction/problemDetail.do
	 * 查询问题详情带答案列表
	 * @return
	 */
	@RequestMapping("problemDetail")
	@ResponseBody
	public ReturnObj problemDetail(long id_index){
		ReturnObj reObj=new ReturnObj();
		Map<String,Object> resultMap=new HashMap<String,Object>();
		TProblem obj=problemService.selectByPrimaryKey(id_index);
		if(obj!=null){
			TAnswerExample example=new TAnswerExample ();
			Criteria cr=example.createCriteria();
			cr.andProIdEqualTo(id_index);
			List<TAnswer> answerList=answerService.selectByExample(example);
			resultMap.put("problem", obj);
			resultMap.put("answer", answerList);
			reObj.setCode(1);
			reObj.setMsg("查询成功");
			reObj.setResult(resultMap);
		}else{
			reObj.setMsg("查询失败");
		}
		return reObj;
	}
	
	
	/**
	 *  problemAction/problemInsert.do
	 * 添加一个问题
	 * @return
	 */
	@RequestMapping("problemInsert")
	@ResponseBody
	public ReturnObj problemInsert(String problemNo,String problemContent,long pageId){
		ReturnObj reObj=new ReturnObj();
		TProblem record=new TProblem ();
		record.setProblemNo(problemNo);
		record.setProblemContent(problemContent);
		record.setPageId(pageId);
		int state=problemService.insertSelective(record);
		if(state>0){
			reObj.setCode(1);
			reObj.setMsg("添加成功");
		}else{
			reObj.setMsg("添加失败");
		}
		return reObj;
	}
	
	/**
	 * problemAction/answerInsert.do
	 * 为问题添加一个答案
	 * @return
	 */
	@RequestMapping("answerInsert")
	@ResponseBody
	public ReturnObj answerInsert(TAnswer answer){
		ReturnObj reObj=new ReturnObj();
		int state=answerService.insertSelective(answer);
		if(state>0){
			reObj.setCode(1);
			reObj.setMsg("添加成功");
		}else{
			reObj.setMsg("添加失败");
		}
		return reObj;
	}
	
	/**
	 * problemAction/userProAnswerInsert.do
	 * 用户选择回答一个问题
	 * @return
	 */
	@RequestMapping("userProAnswerInsert")
	@ResponseBody
	public ReturnObj answerInsert(TUserProAnswer userProAnswer,HttpSession session){
		ReturnObj reObj=new ReturnObj();
		if(session.getAttribute("session_user_id")!=null){
			Long userId=Long.parseLong(session.getAttribute("session_user_id").toString());
			userProAnswer.setUserId(userId);
			int state=userProAnswerService.insertSelective(userProAnswer);
			if(state>0){
				reObj.setCode(1);
				reObj.setMsg("添加成功");
			}else{
				reObj.setMsg("添加失败");
			}
		}else{
			reObj.setMsg("用户未登录");
		}
		return reObj;
	}
	
	/**
	 * problemAction/getUserProAnswer.do
	 * 查询一个问题用户选择的答案
	 * @return
	 */
	@RequestMapping("getUserProAnswer")
	@ResponseBody
	public ReturnObj getUserProAnswer(long pro_id,HttpSession session){
		ReturnObj reObj=new ReturnObj();
		if(session.getAttribute("session_user_id")!=null){
			Long userId=Long.parseLong(session.getAttribute("session_user_id").toString());
			TUserProAnswerExample example=new TUserProAnswerExample();
			com.pangu.po.TUserProAnswerExample.Criteria cr=example.createCriteria();
			cr.andUserIdEqualTo(userId);
			cr.andProIdEqualTo(pro_id);
			List<TUserProAnswer> answerList=userProAnswerService.selectByExample(example);
			if(answerList!=null&&answerList.size()>0){
				reObj.setCode(1);
				reObj.setMsg("查询成功");
				reObj.setResult(answerList);
			}else{
				reObj.setMsg("查询失败");
			}
		}else{
			reObj.setMsg("用户未登录");
		}
		return reObj;
	}
	
	/**
	 * problemAction/findProblemUserAnswerNum.do
	 * 查询一个问题的答案分布
	 * @return
	 */
	@RequestMapping("findProblemUserAnswerNum")
	public String findProblemUserAnswerNum(long pro_id,HttpServletRequest request){
		if(pro_id>0){
			List<HashMap<String,Object>> list=problemService.findProblemUserAnswerNum(pro_id);
			request.setAttribute("list", list);
		}
		return "/progress.jsp";
	}
	
	
	/**
	 * problemAction/problemDelete.do
	 * 用户选择回答一个问题
	 * @return
	 */
	@RequestMapping("problemDelete")
	@ResponseBody
	public ReturnObj problemDelete(long idIndex){
		ReturnObj reObj=new ReturnObj();
		if(idIndex>0){
			int state=problemService.deleteByPrimaryKey(idIndex);
			if(state>0){
				reObj.setCode(1);
				reObj.setMsg("删除成功");
			}else{
				reObj.setMsg("删除失败");
			}
		}else{
			reObj.setMsg("参数不正确");
		}
		return reObj;
	}
	
}
