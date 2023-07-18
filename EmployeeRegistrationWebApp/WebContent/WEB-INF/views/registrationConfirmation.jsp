<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

The registration of employee is confirmed
<br>
${employeeModel.firstName} ${employeeModel.lastName}
<br>
<br>

The departmet assigned is : ${employeeModel.department}
<br>
<br>

The technologies that employee know :
<ul>
<c:forEach var="temp" items="${employeeModel.technologies}">
<li>${temp}</li>
</c:forEach>
</ul>

</body>
</html>