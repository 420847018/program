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
				ul_answers.html("");
				for(var i=0;i<answer.length;i++){
					var answerObj=answer[i];
					htmlStr+="<li><input type='radio' value='"+answerObj.idIndex+"' name='answer' id='answer2'><label>"+answerObj.answerNo+" "+answerObj.answerContent+"</label></li>";
				}
				ul_answers.append(htmlStr);
			}else{
				alert("查询失败，没有此问题");
			}
		}
	})
}
