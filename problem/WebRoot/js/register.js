function submit(){
	if(submitTest()){
		var user_name=$("#user_name").val();
		var pass_word=$("#pass_word").val();
		$.ajax({
			url:"userAction/register.do",
			data:{user_name:user_name,pass_word:$.md5(pass_word)},
			async:false,
			type:"post",
			dataType:"json",
			success:function(data){
				if(data!=null){
					if(data.code==1){
						//注册成功
						window.location.href="index.html";
					}else{
						alert(data.msg);
					}
				}else{
					alert("系统错误");
				}
				
			}
		})
	}
}