<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<html>
<body>
	<textarea readonly><c:forEach items="${chatMessagesList.messages}" var="message">
	${message.text}
	</c:forEach></textarea>

	<form method="post" action="chatroom" modelAttribute="message">	
		<input type="text" name="text"/>
		<button type="submit">SUBMIT</button>  
	</form>
</body>
</html>
