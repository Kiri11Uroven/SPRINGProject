<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!Doctype html>
<html>
<body>
<h2>All Employees</h2>
<br>
<table>
    <tr>
        <th>Name</th>
        <th>Surname</th>
        <th>Department</th>
        <th>Salary</th>
        <th>Operations</th>



    </tr>

    <c:forEach var="emp" items="${allEmps}">

        <c:url var="updateButton" value="/updateInfo">
            <c:param name="empid" value="${emp.id}"/>
        </c:url>
        <c:url var="deleteButton" value="/deleteEmp">
            <c:param name="empid" value="${emp.id}"/>
        </c:url>



        <tr>
            <td>${emp.name}</td>
            <td>${emp.surname}</td>
            <td>${emp.department}</td>
            <td>${emp.salary}</td>
            <td>
                <input type="button" value="update" onclick="window.location.href ='${updateButton}'"/>

                <input type="button" value="Remove" onclick="window.location.href ='${deleteButton}'"/>
            </td>
        </tr>
    </c:forEach>
</table>
<br>
<br>
<input type="button" value="add" onclick="window.location.href ='addNewEmp'">
</body>
</html>
