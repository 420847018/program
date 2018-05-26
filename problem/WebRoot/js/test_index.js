function testPageList(){
	$.ajax({
		url:"testPageAction/testPageList.do",
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
					htmlStr+="<span id='index'>问卷</span>：<a href='index.html?page_id="+obj.id+"'><span id='totalcount'>"+obj.pageName+"</span> &nbsp;";
					htmlStr+="<span id='t'>"+obj.pageDesc+"</span></a>";
					htmlStr+="</h1>";
				}
				frm_main.append(htmlStr);
			}else{
				alert("查询失败");
			}
		}
	})
}
testPageList();