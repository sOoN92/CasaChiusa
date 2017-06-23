<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Casa chiusa</title>
</head>
<body>
<form action="SceltaIdCliente" method="post"></form>
Scegli il tuo id Maialone
<select name="id"> 
 <% 
 List<String> listaId = (ArrayList<String>)request.getAttribute("listaIdClienti") ;
  if(listaId!=null){
  for(String id : listaId){
 
  %>
    <option value="<%=id%>"><%=id%></option>
    <%}}%>
  </select>
  <br><br>
  <input type="submit" value="Invia">
</form>
</body>
</html>