<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<html>
<head>
	<link rel="stylesheet" href="webjars/bootstrap/3.3.7/css/bootstrap.min.css">
	<script type="text/javascript" src="webjars/sockjs-client/1.0.2/sockjs.min.js"></script>
    <script type="text/javascript" src="webjars/stomp-websocket/2.3.3/stomp.min.js"></script>
	<script type="text/javascript" src="<c:url value='/resources/js/WebSocketManager.js' />"></script>
</head>
<body>
	<textarea readonly><c:forEach items="${chatMessagesList.messages}" var="message">
	${message.author.username}: ${message.text}
	</c:forEach></textarea>

	<form method="post" action="chatroom" modelAttribute="message">	
		<input type="text" name="text"/>
		<button type="submit">SUBMIT</button>  
	</form>
</body>
</html>
