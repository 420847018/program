//查询问题详情
function getProblemDetail(id){
	$.ajax({
		url:"problemAction/problemDetail.do",
		data:{id_index:id},
		dataType:"json",
		type:"post",
		success:function(data){
			console.log(data);
			if(data!=null&&data.code==1){
				var obj=data.result;
				var problem=obj.problem;
				var answer=obj.answer;
				var totalcount=$("#totalcount").html(problem.problemNo);
				var t=$("#t").html(problem.problemContent);
				var htmlStr="";
				var ul_answers=$("#ul_answers");
				for(var i=0;i<answer.length;i++){
					var answerObj=answer[i];
					htmlStr+="<li><input type='radio' value='"+answerObj.idIndex+"' name='answer' id='answer2'><label>"+answerObj.answerNo+" "+answerObj.answerContent+"</label></li>";
				}
				ul_answers.append(htmlStr);
				getUserProAnswer(id);
			}else{
				alert("查询失败，没有此问题");
			}
		}
	})
}
//查询问题用户的回答
function getUserProAnswer(id){
	$.ajax({
		url:"problemAction/getUserProAnswer.do",
		data:{pro_id:id},
		dataType:"json",
		type:"post",
		success:function(data){
			console.log(data);
			if(data!=null&&data.code==1){
				//用户回答过
				var result=data.result;
				for(var i=0;i<result.length;i++){
					var obj=result[i];
					$("#ul_answers input").each(function(){
						if(obj.answerId==this.value){
							$(this).attr("checked","true");
						}
						$(this).attr("disabled","true");
					})
				}
			}else{
				//用户没回答过
				var html="<a href='javascript:void(0)' onclick='userProAnswerInsert("+id+");' class='btn green'>提交</a>";
				$(".btns").html(html);
			}
		}
	})
}

//用户回答此问题
function userProAnswerInsert(id){
	var answerId=$('#ul_answers input:radio:checked').val();
	if(answerId!=null&&answerId!=""){
		$.ajax({
			url:"problemAction/userProAnswerInsert.do",
			data:{proId:id,answerId:answerId},
			dataType:"json",
			type:"post",
			success:function(data){
				console.log(data);
				if(data!=null&&data.code==1){
					//用户成功
					window.location.href="index.html";
				}else{
					alert("回答失败");
				}
			}
		});
	}else{
		alert("请先选择答案");
	}
}
function getQueryString(name) { 
    var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i"); 
    var r = window.location.search.substr(1).match(reg); 
    if (r != null) return unescape(r[2]); 
    return null; 
} 

getProblemDetail(getQueryString("id"));