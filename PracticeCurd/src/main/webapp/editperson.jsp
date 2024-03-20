<%@page import="com.entity.Person"%>
<%@page import="com.conn.DBConnect"%>
<%@page import="com.dao.PersonDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

    <%@include file="all_css.jsp" %>
  </head>
<body class="bg-light">
  
  
 <%@include file="navbar.jsp" %>
 
 
 <div class="container p-4">
<div class="row">
<div class="col-md-6 offset-md-3">
<div class="card">
<div class="card-body">
<p class="fs-3 text-center">Edit Person</p>

<%
int id=Integer.parseInt(request.getParameter("id"));
PersonDao dao=new PersonDao(DBConnect.getconn());
Person p=dao.getPersonById(id);

%>

<form action="update" method="post">
  <div class="mb-3">
     <label class="form-label">Name</label>
    <input type="text" class="form-control" name="name" value="<%=p.getName()%>">
    </div>
    
  <div class="mb-3">
    <label class="form-label">DOB</label>
    <input type="date" class="form-control" name="dob" value="<%=p.getDob()%>">
   </div>
   
   <div class="mb-3">
    <label  class="form-label">Email</label>
    <input type="email" class="form-control" name="email" value="<%=p.getEmail()%>">
   </div>
   
    <div class="mb-3">
    <label class="form-label">Qualification</label>
    <input type="text" class="form-control" name="qualification" value="<%=p.getQualification()%>">
   </div>
   
  <div class="mb-3">
    <label  class="form-label">Blood Group</label>
    <input type="text" class="form-control" name="bloodgroup" value="<%=p.getBloodgroup()%>">
   </div>
   
   <div class="mb-3">
    <label  class="form-label">Course</label>
    <input type="text" class="form-control" name="course" value="<%=p.getCourse()%>">
   </div>
   
   <div class="mb-3">
    <label  class="form-label">Contact Number</label>
    <input type="text" class="form-control" name="contactnumber" value="<%=p.getContactnumber()%>">
   </div>
   
    <input type="hidden" name="id" value="<%=p.getId() %>">
    
  <button type="submit" class="btn btn-primary col-md-12">Edit Employee</button>
</form>




</div>
</div>
</div>
</div>
</div>
</body>
</html>
