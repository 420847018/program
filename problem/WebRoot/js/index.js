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
				var frm_main=$("#frm_main");
				var htmlStr="";
				for(var i=0;i<list.length;i++){
					var obj=list[i];
					htmlStr+="<h1 class='title'>";
					htmlStr+="<span id='index'>编号</span>：<a href='problem.html?id="+obj.idIndex+"'><span id='totalcount'>"+obj.problemNo+"</span> &nbsp;";
					htmlStr+="<span id='t'>"+obj.problemContent+"</span></a>";
					htmlStr+="</h1>";
				}
				frm_main.append(htmlStr);
			}else{
				alert("查询失败");
			}
		}
	})
}
getProblemList();

function getQueryString(name) {
    var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i"); 
    var r = window.location.search.substr(1).match(reg); 
    if (r != null) return unescape(r[2]); 
    return null; 
} 