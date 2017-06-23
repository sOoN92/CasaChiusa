<%@page import="java.util.ArrayList"%>
<%@page import="casa.chiusa.godo.Mignotta"%>
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
<form action="pagZoccolona" method="post">
Scegli la tua Maialina da sburata
<select name="Mignotta"> 
 <% 
 List<String> listaNomiMignotta = (ArrayList<String>)request.getAttribute("listaNomiMignotte");
 
  if(listaNomiMignotta !=null){
  for(String mignotta : listaNomiMignotta ){
  %>
    <option value="<%=mignotta%>"><%=mignotta%></option>
    <%}}%>
  </select>
  <br><br>
  <input type="submit" value="Invia">
</form>

</body>
</html>