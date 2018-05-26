function getTestPageList(){
	$.ajax({
		url:"testPageAction/testPageList.do",
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
					htmlStr+="<td>"+obj.id+"</td><td>"+obj.pageName+"</td><td>【<a href='admin_problem_list.html?page_id="+obj.id+"'>查看问题</a>】【<a target='_blank' href='javascript:void(0);' onclick='deleteTestPage("+obj.id+")'>删除试卷</a>】</td>";
					htmlStr+="</tr>";
					
				}
				table4_2.append(htmlStr);
			}else{
				alert("查询失败");
			}
		}
	})
}
getTestPageList();

function deleteTestPage(id){
	if(id!=null&&id!=""){
		$.ajax({
			url:"testPageAction/testPageDelete.do",
			data:{id:id},
			type:"post",
			dataType:"json",
			success:function(data){
				if(data!=null&&data.code==1){
					alert("删除成功");
					window.location.href="admin_test_page_list.html";
				}else{
					alert("删除失败");
					window.location.href="admin_test_page_list.html";
				}
			}
		})
	}
	
}