<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String basepath = request.getContextPath();
	request.setAttribute("basepath", basepath);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页列表展示</title>
<script type="text/javascript" src="${basepath}/resource/js/jquery-1.8.0.min.js"></script>
<style type="text/css">
	#addUser:hover{
		cursor: pointer;
	}
	td{
		width:80px;
		text-align: center;
	}
</style>
<script type="text/javascript">
	$(function(){
		loadlist();
		$('#addUser').click(function(){
			var username = $('#username').val();
			var userpazz = $('#userpazz').val();
			var id = $('#id').val();
			if(null==username || "" == username){
				$('#tipmessage').html('请输入用户名！');
				return;
			}
			if(null==userpazz || "" == userpazz){
				$('#tipmessage').html('请输入密码！');
				return;
			}
			$.ajax({
				url:'${basepath}/bookadmin/addAdmin.do',
				type:'POST',
				dataType:'json',
				data:{
					adminUser : username,
					adminPass : userpazz,
					id : id
				},
				success:function(d){
					if(d.state){
						document.location.reload();
					}else{
						alert(d.msg);
					}
				}
			})
		})
		
	})
	
	function loadlist(){
		$.ajax({
			url:'${basepath}/usersAction/queryAll.do',
			type:'POST',
			dataType:'json',
			success:function(json){
				var html="";
				html+="<tr>";
				html+="<th>用户ID</th>";
				html+="<th>姓名</th>";
				html+="<th>密码</th>";
				html+="<th>操作</th>";
				html+="</tr>";
				$.each(json,function(i,d){
					html+="<tr>";
					html+="<td>"+d.id+"</td>";
					html+="<td>"+d.adminUser+"</td>";
					html+="<td>"+d.adminPass+"</td>";
					html+="<td><a href='javascript:editUser("+d.id+");'>修改</a>|<a href='javascript:deleteUser("+d.id+");'>删除</a></td>";
					html+="</tr>";
				})
				$('#tabledata').html(html);
			}
		})
	}
	
	function editUser(id){
		$.ajax({
			url:'${basepath}/bookadmin/findUserById.do?id='+id,
			type:'POST',
			dataType:'json',
			success:function(d){
				$('#username').val(d.adminUser);
				$('#userpazz').val(d.adminPass);
				$('#id').val(d.id);
			}
		})
	}
	
	function deleteUser(id){
		$.ajax({
			url:'${basepath}/bookadmin/deleteAdmin.do?id='+id,
			type:'POST',
			dataType:'json',
			success:function(d){
				if(d.state){
					document.location.reload();
				}else{
					alert(d.msg);
				}
			}
		})
	}
</script>
</head>
<body>
	<div id="addwindow" style="border:1px solid black;border-radius:10px;height:130px;width:230px;padding:20px;margin:10px;">
		<input type="hidden" id="id">
		新增:<br>
		<div style="height:10px;"></div>
		姓名：<input type="text" id="username"/><br>
		<div style="height:10px;"></div>
		密码：<input type="password" id="userpazz"/>
		<div style="height:10px;"></div>
		<div id="tipmessage" style="color: red;font-size:12px;">&nbsp;</div>
		<div style="height:10px;"></div>
		<div id="addUser" style="width:50px;height:30px;background-color: gray;text-align: center;line-height:30px;color: white;border-radius:15%;margin:0 auto;">确定</div>
	</div>
	<div style="height:40px;">列表展示</div>
	<table id="tabledata" cellpadding="0" cellspacing="0"></table>
</body>
</html>