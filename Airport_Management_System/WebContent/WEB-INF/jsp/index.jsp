<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title></title>
    <script>
function validation()                                    
{ 
    var name = document.forms["RegForm"]["uname"];               
    
    var password = document.forms["RegForm"]["pass"];  
      
   
    if (name.value == "")                                  
    { 
    	document.getElementById("u").innerHTML = "Please Enter UserName"; 
        
        return false; 
    } 
    if (password.value == "")                                  
    { 
    	document.getElementById("p").innerHTML = "Please Enter Password"; 
        
        return false; 
    } 
}
</script>
  </head>
  <body>
<div style="margin-top:15%;margin-left:40%;">
  <h1>Manager Login</h1>
 <form action ="managerView.htm" method = "post" modelAttribute = "model" name="RegForm" onsubmit = "return validation()">
    <input  type="text" placeholder="Manager ID" name = "manager_id" style = "border-radius : 5px; height:30px;" /> <span id = "u" style="color:red;"></span><br><br>
   
    <input  type="password" placeholder="Password" name = "manager_password" style = "border-radius : 5px; height:30px;" /> <span id = "p" style="color:red;"></span><br><br>
   
  <input type="submit" class="btn" value="Sign in" style = "border-radius : 5px; height:30px; width:80px;">
  </form>
  <a href="managerReg.htm" style="margin-left:100px;margin-top:30px;">Sign Up</a>
</div>
  </body>
</html>