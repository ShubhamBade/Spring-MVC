<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
* {
  margin: 0
}

.container {
  display: flex;
  justify-content: center;
  align-items: center;
  flex-direction: column;
  height: 100vh;
  background-color: #6699cc;
}

.container h1 {
  color: white;
  font-family: sans-serif;
  margin: 20px;
}

.registartion-form {
  display: flex;
  justify-content: center;
  align-items: center;
  width: 600px;
  color: rgb(255, 255, 255);
  font-size: 18px;
  font-family: sans-serif;
  background-color: #154a68;
  padding: 20px;
}

.registartion-form input,
.registartion-form select,
.registartion-form textarea {
  border: none;
  padding: 5px;
  margin-top: 10px;
  font-family: sans-serif;
}

.registartion-form input:focus,
.registartion-form textarea:focus {
  box-shadow: 3px 3px 10px rgb(228, 228, 228), -3px -3px 10px rgb(224, 224, 224);
}

.registartion-form .submit {
  width: 100%;
  padding: 8px 0;
  font-size: 20px;
  color: rgb(44, 44, 44);
  background-color: #ffffff;
  border-radius: 5px;
}

.registartion-form .submit:hover {
  box-shadow: 3px 3px 6px rgb(255, 214, 176);
}

</style>
</head>
<body>
	<div class="container">
  <h1>HTML registration form with Verification</h1>
  <div class="alert alert-danger" role="alert">
		  <form:errors path="user.*"></form:errors>
		</div>
  <form 
  	action="processform" method="post"
  	name="registration" class="registartion-form" onsubmit="return formValidation()">  	
    <table>
      <tr>
        <td><label for="name">Name:</label></td>
        <td><input type="text" name="name" id="name" placeholder="your name"></td>
      </tr>
      <tr>
        <td><label for="email">Email:</label></td>
        <td><input type="text" name="email" id="email" placeholder="your email"></td>
      </tr>
      <tr>
        <td><label for="password">Password:</label></td>
        <td><input type="password" name="password" id="password"></td>
      </tr>
      <tr>
        <td><label for="phoneNumber">Phone Number:</label></td>
        <td><input type="text" name="phoneNumber" id="phoneNumber"></td>
      </tr>
      <tr>
        <td><label for="gender">Gender:</label></td>
        <td>Male: <input type="radio" name="gender" value="male">
          Female: <input type="radio" name="gender" value="female">
          Other: <input type="radio" name="gender" value="other"></td>
      </tr>
      <tr>
        <td><label for="language">language</label></td>
        <td>
          <select name="language" id="language">
            <option value="">Select language</option>
            <option value="English">English</option>
            <option value="Spanish">Spanish</option>
            <option value="Hindi">Hindi</option>
            <option value="Arabic">Arabic</option>
            <option value="Russian">Russian</option>
          </select>
        </td>
      </tr>
      <tr>
        <td><label for="zipcode">Zip Code:</label></td>
        <td><input type="number" name="zipcode" id="zipcode"></td>
      </tr>
      <tr>
        <td><label for="City">City :</label></td>
        <td><input type="text" name="address.city" id="city"></td>
      </tr>
      <tr>
        <td><label for="Country">Country :</label></td>
        <td><input type="text" name="address.country" id="country"></td>
      </tr>
      <tr>
        <td colspan="2"><input type="submit" class="submit" value="Register" /></td>
      </tr>
    </table>
  </form>
</div>
</body>
</html>