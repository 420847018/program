<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${basePath}css/add_problem.css" type="text/css" rel="stylesheet" />
<script src="js/jquery-1.8.0.min.js"></script>
<script src="js/add_problem.js"></script>
<title>新增</title>
</head>
<body class="basic-grey">
<h1>新增
<span>添加一个新问题</span>
</h1>
<label>
<span>问题编号:</span>
<input id="problemNo" type="text" style="width:20%" name="problemNo" placeholder="填写问题编号" />
</label>
<label>
<span>问题内容:</span>
<input id="problemContent" type="text" name="problemContent" placeholder="请填写问题内容" />
</label>
<label>
<!--<label>
<span>Subject :</span><select name="selection">
<option value="0">Job Inquiry</option>
<option value="General Question">General Question</option>
</select>
</label> -->

<label id="buttonDiv">
<span>&nbsp;</span>
<input type="button" class="button" value="提交" onclick="submit()"/>
</label>
</body>
</html>