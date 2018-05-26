function submit(){
	if(submitTest()){
		var user_name=$("#user_name").val();
		var pass_word=$("#pass_word").val();
		$.ajax({
			url:"userAction/login.do",
			data:{user_name:user_name,pass_word:$.md5(pass_word)},
			async:false,
			type:"post",
			dataType:"json",
			success:function(data){
				if(data!=null&&data.code==1){
					//登录成功
					if(data.result==1){//管理员
						window.location.href="admin_test_page_list.html";
					}else{
						window.location.href="test_index.html";
					}
				}else{
					alert("用户名密码错误");
				}
			}
		})
	}
}