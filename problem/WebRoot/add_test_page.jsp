<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${basePath}css/add_problem.css" type="text/css" rel="stylesheet" />
<script src="js/jquery-1.8.0.min.js"></script>
<script src="js/add_test_page.js"></script>
<title>新增</title>
</head>
<body class="basic-grey">
<h1>新增
<span>添加一个新试卷</span>
</h1>
<label>
<span>试卷名称:</span>
<input id="pageName" type="text" style="width:20%" name="pageName" placeholder="填写试卷名称" />
</label>
<label>
<span>试卷说明:</span>
<input id="pageDesc" type="text" name="pageDesc" placeholder="请填写试卷说明" />
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