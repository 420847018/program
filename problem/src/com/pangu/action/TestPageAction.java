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
import com.pangu.po.TTestPage;
import com.pangu.po.TTestPageExample;
import com.pangu.po.TUserProAnswer;
import com.pangu.po.TUserProAnswerExample;
import com.pangu.po.basePo.ReturnObj;
import com.pangu.service.IAnswerService;
import com.pangu.service.IProblemService;
import com.pangu.service.ITestPageService;
import com.pangu.service.IUserProAnswerService;

@Controller
@RequestMapping("/testPageAction")
public class TestPageAction {

	@Resource
	private ITestPageService testPageService;

	
	/**
	 *  testPageAction/testPageList.do
	 * 查询所有试卷接口
	 * @return
	 */
	@RequestMapping("testPageList")
	@ResponseBody
	public ReturnObj problemList(){
		ReturnObj reObj=new ReturnObj();
		TTestPageExample example=new TTestPageExample ();
		List<TTestPage> list=testPageService.selectByExample(example);
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
	 *  testPageAction/testPageInsert.do
	 * 添加一个试卷
	 * @return
	 */
	@RequestMapping("testPageInsert")
	@ResponseBody
	public ReturnObj testPageInsert(String testPageName,String testPageDest){
		ReturnObj reObj=new ReturnObj();
		TTestPage testPage=new TTestPage();
		testPage.setPageDesc(testPageDest);
		testPage.setPageName(testPageName);
		int state=testPageService.insertSelective(testPage);
		if(state>0){
			reObj.setCode(1);
			reObj.setMsg("添加成功");
		}else{
			reObj.setMsg("添加失败");
		}
		return reObj;
	}
	
	/**
	 *  testPageAction/testPageDelete.do
	 * 删除一个试卷
	 * @return
	 */
	@RequestMapping("testPageDelete")
	@ResponseBody
	public ReturnObj testPageDelete(long id){
		ReturnObj reObj=new ReturnObj();
		int state=testPageService.deleteByPrimaryKey(id);
		if(state>0){
			reObj.setCode(1);
			reObj.setMsg("删除成功");
		}else{
			reObj.setMsg("删除失败");
		}
		return reObj;
	}
	
	
	
}
