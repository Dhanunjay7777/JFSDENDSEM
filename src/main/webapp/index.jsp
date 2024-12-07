<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link rel="stylesheet" href="css/styles.css"/>
</head>
<body>
<div class="loginWindow">
<div class="LoginHeader">Sign In</div>
<div class="LoginContent">
<div style="display:block;padding-top:20px">Username*</div>
<input type="text" id="T1"/>
<div style="display:block;padding-top:20px">Password*</div>
<input type="password" id="T2"/>
<div style="display:block;padding-top:10px;padding-bottom:10px;text-align:right">Forgot<label style="color:blue;cursor:pointer"> Password?</label></div>
<div>
<button class="signinButton" onclick="signIn()">SIGN IN </button>
<div style="display:block;height:80px;line-height: 80px"></div>
<label id ="ack"></label>
<div style="display;block;text-align: center">Don't have an account?</div>
<label class="signuplabel" onclick="signUp()">SIGN UP</label>
</div>
</div>
</div>
</body>
<script type="text/javascript" src="js/main.js"></script>
<script type="text/javascript">
function signIn()
{
	var data = JSON.stringify({
		username: T1.value,
		password: T2.value
	});
	var url ="http://localhost:8080/user/login";
	callApi("POST", url , data, getResponse)
}
function getResponse(res)
{
	if(res == 401)
		{
		ack.style.color = "red";
		ack.innerHTML = "Invalid credetials";
	}
	else
	{
		ack.innerHTML = "";
		//location.replace("/home")
		location.href="/home";
	}
}
function signUp()
{
	location.replace("/signup")
	}
</script>
</html>