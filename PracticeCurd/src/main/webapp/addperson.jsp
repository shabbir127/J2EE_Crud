<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="all_css.jsp" %>
</head>
<body>
<%@include file="navbar.jsp" %>

<div class="container p-4">
<div class="row">
<div class="col-md-6 offset-md-3">
<div class="card">
<div class="card-body">
<p class="fs-3 text-center">Add Person</p>

<c:if test="${not empty succMsg}">
<p class="text-center text-success">${succMsg}</p>
<c:remove var="succMsg"/>
</c:if>
<c:if test="${not empty errorMsg}">
<p class="text-center text-success">${errorMsg}</p>
<c:remove var="errorMsg"/>
</c:if>
      
      <form action="register" method="post">
  <div class="mb-3">
    <label class="form-label">Name</label>
    <input type="text" class="form-control" name="name">
    </div>
    
  <div class="mb-3">
    <label class="form-label">DOB</label>
    <input type="date" class="form-control" name="dob">
   </div>
   
   <div class="mb-3">
    <label  class="form-label">Email</label>
    <input type="email" class="form-control" name="email" >
   </div>
   
    <div class="mb-3">
    <label class="form-label">Qualification</label>
    <input type="text" class="form-control" name="qualification">
   </div>
   
  <div class="mb-3">
    <label  class="form-label">Blood Group</label>
    <input type="text" class="form-control" name="bloodgroup" >
   </div>
   
   <div class="mb-3">
    <label  class="form-label">Course</label>
    <input type="text" class="form-control" name="course">
   </div>
   
   <div class="mb-3">
    <label  class="form-label">Contact Number</label>
    <input type="text" class="form-control" name="contactnumber" >
   </div>
   
  
  <button type="submit" class="btn btn-primary">Submit</button>
</form>


     
</div>
</div>
</div>
</div>
</div>



</body>
</html>