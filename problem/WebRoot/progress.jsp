<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%
	String basepath = request.getContextPath();
	request.setAttribute("basepath", basepath);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<style type="text/css">
*{margin:0;padding:0;list-style-type:none;}
a,img{border:0;}
body{font:12px/180% Arial, Helvetica, sans-serif, "新宋体";}
/* holder */
#holder{margin:-350px 0 0 -350px;width:700px;height:700px;position:absolute;left:50%;top:50%;}
</style>

<script type="text/javascript" src="<%=basepath %>/js/jquery-1.8.0.min.js"></script>
<script type="text/javascript" src="<%=basepath %>/js/raphael-min.js"></script>
<script type="text/javascript" src="<%=basepath %>/js/script.js"></script>

</head>
<body>

<table>
	<tbody>
	<% if(request.getAttribute("list")!=null){
		List<HashMap<String,Object>> list=(List<HashMap<String,Object>>)request.getAttribute("list");
		for(int i=0;i<list.size();i++){
			HashMap<String,Object> map=list.get(i);
		%>
		<tr>
			<th scope="row"><%=map.get("answer_no") %></th>
			<td><%=Integer.parseInt(map.get("num").toString())/Integer.parseInt(map.get("count_num").toString())>0?Integer.parseInt(map.get("count_num").toString()):1*100 %>%</td>
		</tr>
		<%}
	}
	%>
	</tbody>
</table>
	
<div id="holder"></div>
</body>
</html>