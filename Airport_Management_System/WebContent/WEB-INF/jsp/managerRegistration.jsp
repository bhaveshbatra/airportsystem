<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script>

function validation()                                    
{ 
    var firstName = document.forms["RegForm"]["manager_first_name"];               
    
    var lastName = document.forms["RegForm"]["manager_last_name"];  
      
    var id = document.forms["RegForm"]["manager_id"];
    
    var age = document.forms["RegForm"]["manager_age"]; 
    
    var gender = document.forms["RegForm"]["manager_gender"]; 
    
    var dob = document.forms["RegForm"]["manager_dob"]; 
    
    var contact = document.forms["RegForm"]["manager_contact_no"];
    
    var othercontact = document.forms["RegForm"]["manager_alt_contact_no"]; 
    
    var email = document.forms["RegForm"]["manager_email_id"]; 
    
    var pass = document.forms["RegForm"]["manager_password"]; 
    
    //  id
    
    if (id.value == "")                                  
    { 
    	document.getElementById("id").innerHTML = "Please Enter ID"; 
        
        return false; 
    } 
    
    // first name
    
    if (firstName.value == "")                                  
    { 
    	document.getElementById("f").innerHTML = "Please Enter FirstName"; 
        
        return false; 
    } 
    
    if (/\d/.test(firstName.value))                                  
    { 
    	document.getElementById("f").innerHTML = "Please Enter String"; 
        
        return false; 
    } 
    
    //  last Name
    if (lastName.value == "")                                  
    { 
    	document.getElementById("l").innerHTML = "Please Enter LastName"; 
        
        return false; 
    }
    
    if (/\d/.test(lastName.value))                                  
    { 
    	document.getElementById("l").innerHTML = "Please Enter String"; 
        
        return false; 
    } 
    
//  age
    
    if (age.value == "")                                  
    { 
    	document.getElementById("a").innerHTML = "Please Enter Age"; 
        
        return false; 
    } 
    if (isNaN(age.value))                                  
    { 
    	document.getElementById("a").innerHTML = "Age must be number"; 
        
        return false; 
    }
   // if ( age.value < 18 || id.value > 105)                                  
   // { 
	//	document.getElementById("a").innerHTML = "Age range from 3 to 5"; 
        
    //    return false; 
   // }
    
    // gender
    
    if (gender.value == "")                                  
    { 
    	document.getElementById("g").innerHTML = "Please Enter Gender"; 
        
        return false; 
    } 
    
    //  dob
    
    if (dob.value == "")                                  
    { 
    	document.getElementById("d").innerHTML = "Please Enter dob"; 
        
        return false; 
    } 
    
    // contact
    
    if (contact.value == "")                                  
    { 
    	document.getElementById("c").innerHTML = "Please Enter ContactNumber"; 
        
        return false; 
    }
    
    if (isNaN(contact.value))                                  
    { 
    	document.getElementById("c").innerHTML = "Please Enter Number"; 
        
        return false; 
    }
    if (contact.value.length < 10)                                  
    { 
    	document.getElementById("c").innerHTML = "Enter 10 digit Number"; 
        
        return false; 
    }
    // alternate contact
    
    
    if (othercontact.value.length < 10)                                  
    { 
    	document.getElementById("ac").innerHTML = "Enter 10 digit Number"; 
        
        return false; 
    }
    
    // email ids
    if (email.value == "")                                  
    { 
    	document.getElementById("e").innerHTML = "Please Enter emailId"; 
        
        return false; 
    }
    // password
    if (pass.value == "")                                  
    { 
    	document.getElementById("c").innerHTML = "Please Enter Password"; 
        
        return false; 
    }
    alert("You have succefully resgisterd!!");
}
</script>
</head>
<body>
<div style="margin-left:40%;">
  <h1> Manager Sign UP</h1>
<form action="managerRegistration.htm" modelAttribute="model" method = "post" name="RegForm" onsubmit = "return validation()">
<!-- <input  type="text" placeholder="ID" name = "manager_id" style="border-radius : 5px; height:25px;" />  <span id = "id" style="color:red;"></span><br><br> -->
<input type="text" placeholder="FirstName" name = "manager_first_name" style="border-radius : 5px; height:25px;" />  <span id = "f" style="color:red;"></span><br><br>
<input type="text" placeholder="LastName" name = "manager_last_name" style="border-radius : 5px; height:25px;" />  <span id = "l" style="color:red;"></span><br><br>
<input type="number" placeholder="Age" name = "manager_age" style="border-radius : 5px; height:25px;" />  <span id = "a" style="color:red;"></span><br><br>
<input type="text" placeholder="Gender" name = "manager_gender" style="border-radius : 5px; height:25px;" />  <span id = "g" style="color:red;"></span><br><br>
<input type="text" placeholder="DOB" name = "manager_dob" style="border-radius : 5px; height:25px;" />  <span id = "d" style="color:red;"></span><br><br>
<input type="number" placeholder="Contact No" name = "manager_contact_no" style="border-radius : 5px; height:25px;" maxlength="10"/>  <span id = "c" style="color:red;"></span><br><br>
<input type="number" placeholder="Alt Contact No" name = "manager_alt_contact_no" style="border-radius : 5px; height:25px;" maxlength="10"/>  <span id = "ac" style="color:red;"></span><br><br>
<input type="text" placeholder="Email Id" name = "manager_email_id" style="border-radius : 5px; height:25px;" />  <span id = "e" style="color:red;"></span><br><br>
<input type="password" placeholder="Password" name = "manager_password" style="border-radius : 5px; height:25px;" />  <span id = "p" style="color:red;"></span><br><br>

  <input type="submit"  value="Register" style="border-radius : 5px; height:30px;">
  
</form>
</div>
</body>
</html>