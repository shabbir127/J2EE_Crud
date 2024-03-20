<%@page import="com.entity.Person"%>
<%@page import="java.util.List"%>
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
<%@include file="all_css.jsp" %>
</head>
<body>
<%@include file="navbar.jsp" %>




<div class="container p-5">
<div class="card">
<div class="card-body">
<p class="text-center fs-1">All Student Data</p>
<c:if test="${not empty succMsg}">
<p class="text-center text-success">${succMsg}</p>
<c:remove var="succMsg"/>
</c:if>
<c:if test="${not empty errorMsg}">
<p class="text-center text-success">${errorMsg}</p>
<c:remove var="errorMsg"/>
</c:if>

<table class="table">
  <thead>
    <tr>
      <th scope="col">Full Name</th>
      <th scope="col">DOB</th>
      <th scope="col">Email</th>
      <th scope="col">Qualification</th>
       <th scope="col">Blood</th>
       <th scope="col">Course</th>
        <th scope="col">Contact Number</th>
         <th scope="col">Action</th>
    </tr>
  </thead>
  <tbody>
  
  <%
  PersonDao dao=new PersonDao(DBConnect.getconn());
  List<Person> list=dao.getAllperson();
  for(Person p :list)
  {
  %>
  
  
  
  
   <tr>
      <th scope="row"><%=p.getName()%></th>
      <td><%=p.getDob()%></td>
      <td><%=p.getEmail()%></td>
      <td><%=p.getQualification() %></td>
       <td><%=p.getBloodgroup()%></td>
        <td><%=p.getCourse()%></td>
         <td><%=p.getContactnumber()%></td>
        
      <td> <a href="editperson.jsp?id=<%=p.getId()%>" class="btn btn-sm btn-primary">Edit</a></td>
       <td> <a href="delete?id=<%=p.getId() %>" class="btn btn-sm btn-danger ms-1">Delete</a></td>
    </tr>
   
      <%} %>
  
   </tbody>
</table>
</div>


</div></div>
  


</body>
</html>