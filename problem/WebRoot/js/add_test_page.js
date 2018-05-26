function submit(){
	var testPageName=$("#testPageName").val();
	var testPageDesc=$("#testPageDesc").val();
	$.ajax({
		url:"testPageAction/testPageInsert.do",
		data:{testPageName:testPageName,testPageDesc:testPageDesc},
		type:"post",
		dataType:"json",
		success:function(data){
			if(data!=null&&data.code==1){
				alert("添加成功");
				window.location.href="admin_test_page_list.html";
			}else{
				alert("添加失败");
				window.location.href="admin_test_page_list.html";
			}
		}
	})
}
