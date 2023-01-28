<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!Doctype html>
<html>

<body>
<h2>Employee info</h2>
<br>

<form:form action="safeEmp" modelAttribute="employee">
<form:hidden path="id"/>
  Name <form:input path="name"/>
  <br>
  <br>
  Surname <form:input path="surname"/>
  <br>
  <br>

  Department <form:input path="department"/>
  <br>
  <br>

  Salary <form:input path="salary"/>
  <br>
  <br>
  <input type="submit" value="ok!">
</form:form>

<br>
<br>
<input type="button" value="add" onclick="window.location.href ='addNewEmp'">
</body>
</html>
