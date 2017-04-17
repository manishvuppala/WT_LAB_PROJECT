function checkpwdm()
{
	var x=document.getElementById("password").value;
	var y=document.getElementById("Repassword").value;
	if (x==y) 
		{
			alert("passwords match!!");
		} 
		else 
		{
			alert("passwords didn't match!!");
			
		}

}