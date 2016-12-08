<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   

<html>
<body>
	<form method="post" action="login" modelAttribute="user">
		<label for="username">Username</label>
		<input type="text" name="username"/> 
		<button type="submit">LOGIN</button> 
	</form>
</body>
</html>
