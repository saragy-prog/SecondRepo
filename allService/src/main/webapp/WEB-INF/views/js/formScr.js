function validateForm() {

	var n1 = document.getElementById("name1").value;
	var t1 = /^[A-Z][a-z]*(-[A-Z][a-z]*)*$/;
	if (!t1.test(n1)) {
		alert("First name is incorrect");
		return false;
	}
	var n2 = document.getElementById("name2").value;
	if (!t1.test(n2)) {
		alert("Last name is incorrect");
		return false;
	}
	var p1 = document.getElementById("pas1").value;
	if (!/\d/.test(p1)) {
		alert("Password has no digit");
		return false;
	}
	if (!/[A-Z]/.test(p1)) {
		alert("Password has no big letters");
		return false;
	}
	if (!/[a-z]/.test(p1)) {
		alert("Password has no small letters");
		return false;
	}
	var p2 = document.getElementById("pas2").value;
	if (p1 != p2) {
		alert("Passwords mismatch");
		return false;
	}
	var eMail = document.getElementById("email").value;
	var te = /^\w+([-+.']\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/;
	if (!te.test(eMail)) {
		alert("e-Mail is incorrect");
		return false;
		// document.addEventListener("load", function(){
		// console.log("LOAD index.html")
	}
}
