<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${basePath}css/add_problem.css" type="text/css" rel="stylesheet" />
<script src="js/jquery-1.8.0.min.js"></script>
<script src="js/add_answer.js"></script>
<title>新增</title>
</head>
<body class="basic-grey">
<form action="" method="post" class="STYLE-NAME" name="sform" id="form1">
<input type="hidden" name="proId" id="pro_id">
<h1>新增
<span>添加一个答案</span>
</h1>
<label>
<span>答案编号:</span>
<input type="text" style="width:20%" name="answerNo" placeholder="填写答案编号" />
</label>
<label>
<span>答案内容:</span>
<input type="text" name="answerContent" placeholder="请填写答案内容" />
</label>
</form>
<label id="buttonDiv">
<span>&nbsp;</span>
<!-- <input type="button" class="button" value="添加一个新答案" onclick="addNewAnswer()" /> -->
<input type="button" class="button" value="提交" onclick="submit()"/>
</label>
</body>
</html>