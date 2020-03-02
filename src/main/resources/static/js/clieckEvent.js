function writeClickEvent(){
	location.href="write";
}
function readClickEvent() {
	
	var nicname = name; 
	alert(document.getElementById('tiLink'));
	location.href="view";
}


function submitClickEvent(){
	var title =  document.getElementById("title").value;
	// var title =$('#title').val()
	var nicname = document.getElementById("nicname").value;
	var context = document.getElementById("context").value;
	if(!title) {
		alert("제목은 입력하세요");
		document.getElementById("title").focus();
	} else if (!nicname) {
		alert("닉네임을 입력하세요");
		document.getElementById("nicname").focus();
	} else if (!context) {
		alert("내용을 입력하세요");
		document.getElementById("context").focus();
	} else { 
		document.contextForm.submit();
	}
	return true;
}