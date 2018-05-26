function addNewAnswer(){
	var str="<label>";
	str+="<span>答案编号:</span>";
	str+="<input id='answerNo' type='text' style='width:20%' name='answerNo' placeholder='填写答案编号' />";
	str+="</label>";
	str+="<label>";
	str+="<span>答案内容:</span>";
	str+="<input id='answerContent' type='text' name='answerContent' placeholder='请填写答案内容' />";
	str+="</label>";
	$(".STYLE-NAME").append(str);
}

function submit(){
	setProId();
	$.ajax({
		url:"problemAction/answerInsert.do",
		data:$('#form1').serialize(),
		type:"post",
		dataType:"json",
		success:function(data){
			if(data!=null&&data.code==1){
				alert("添加成功");
				window.location.href="admin_problem_list.html";
			}else{
				alert("添加失败");
				window.location.href="admin_problem_list.html";
			}
		}
	})
}

function getQueryString(name) {
    var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i"); 
    var r = window.location.search.substr(1).match(reg); 
    if (r != null) return unescape(r[2]); 
    return null; 
} 
function setProId(){
	var pro_id=getQueryString("pro_id");
	$("#pro_id").val(pro_id);
}

