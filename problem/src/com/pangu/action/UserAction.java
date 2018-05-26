package com.pangu.action;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pangu.po.User;
import com.pangu.po.basePo.ReturnObj;
import com.pangu.service.IUserService;

@Controller
@RequestMapping("/userAction")
public class UserAction {

	@Resource
	private IUserService userService;

	
	/**
	 *  userAction/login.do
	 * 登录接口
	 * @param user_name
	 * @param pass_word（md5加密）
	 * @return
	 */
	@RequestMapping("login")
	@ResponseBody
	public ReturnObj userLogin(User user,HttpSession session){
		ReturnObj reObj=new ReturnObj();
		String user_name=user.getUser_name();
		String pass_word=user.getPass_word();
		if(user_name!=null&&!user_name.equals("")){
			if(pass_word!=null&&!pass_word.equals("")){
				List<User> list_user=userService.findUserByPar(user);
				if(list_user!=null&&list_user.size()>0){
					user=list_user.get(0);
					session.setAttribute("session_user_id", user.getId_index());
					session.setAttribute("session_user_type", user.getUser_type());
					reObj.setResult(user.getUser_type());
					reObj.setCode(1);
					reObj.setMsg("登录成功");
				}else{
					reObj.setMsg("用户名或密码错误");
				}
			}else{
				reObj.setMsg("密码不能为空");
			}
		}else{
			reObj.setMsg("用户名不能为空");
		}
		return reObj;
	}
	
	/**
	 *  userAction/register.do
	 * 登录接口
	 * @param user_name
	 * @param pass_word（md5加密）
	 * @return
	 */
	@RequestMapping("register")
	@ResponseBody
	public ReturnObj register(User user,HttpSession session){
		ReturnObj reObj=new ReturnObj();
		String user_name=user.getUser_name();
		String pass_word=user.getPass_word();
		if(user_name!=null&&!user_name.equals("")){
			if(pass_word!=null&&!pass_word.equals("")){
				User check_user_name_par=new User();
				check_user_name_par.setUser_name(user.getUser_name());
				List<User> check_user_name_list=userService.findUserByPar(check_user_name_par);
				if(check_user_name_list==null||check_user_name_list.size()==0){
					user.setNick_name(user_name);
					userService.saveUser(user);
					List<User> list_user=userService.findUserByPar(user);
					if(list_user!=null&&list_user.size()>0){
						user=list_user.get(0);
						session.setAttribute("session_user_id", user.getId_index());
						session.setAttribute("session_user_type", user.getUser_type());
						reObj.setResult(user.getUser_type());
						reObj.setCode(1);
						reObj.setMsg("注册成功");
					}else{
						reObj.setMsg("注册失败");
					}
				}else{
					reObj.setMsg("用户名已存在");
				}
			}else{
				reObj.setMsg("密码不能为空");
			}
		}else{
			reObj.setMsg("用户名不能为空");
		}
		return reObj;
	}
}
