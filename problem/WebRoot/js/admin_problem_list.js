function getProblemList(){
	var page_id=getQueryString("page_id");
	$.ajax({
		url:"problemAction/problemList.do?page_id="+page_id,
		dataType:"json",
		type:"post",
		success:function(data){
			console.log(data);
			if(data!=null&&data.code==1){
				var list=data.result;
				var table4_2=$(".table4_2");
				var htmlStr="";
				for(var i=0;i<list.length;i++){
					var obj=list[i];
					htmlStr+="<tr>";
					htmlStr+="<td>"+obj.problemNo+"</td><td>"+obj.problemContent+"</td><td>【<a href='add_answer.jsp?pro_id="+obj.idIndex+"'>添加答案</a>】【<a target='_blank' href='problemAction/findProblemUserAnswerNum.do?pro_id="+obj.idIndex+"'>查看回答分布</a>】【<a target='_blank' href='javascript:void(0);' onclick='deleteProblem("+obj.idIndex+")'>删除问题</a>】</td>";
					htmlStr+="</tr>";
					
				}
				table4_2.append(htmlStr);
			}else{
				alert("查询失败");
			}
		}
	})
}
getProblemList();

function deleteProblem(id){
	if(id!=null&&id!=""){
		$.ajax({
			url:"problemAction/problemDelete.do",
			data:{idIndex:id},
			type:"post",
			dataType:"json",
			success:function(data){
				if(data!=null&&data.code==1){
					alert("删除成功");
					window.location.href="admin_problem_list.html";
				}else{
					alert("删除失败");
					window.location.href="admin_problem_list.html";
				}
			}
		})
	}
	
}

function getQueryString(name) {
    var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i"); 
    var r = window.location.search.substr(1).match(reg); 
    if (r != null) return unescape(r[2]); 
    return null; 
} 

function setNewProblemButtonHref(){
	var page_id=getQueryString("page_id");
	window.location.href="add_problem.jsp?page_id="+page_id;
}
