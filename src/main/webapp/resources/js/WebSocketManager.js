var stompClient = null;

function showMessage() {
	
}

function connect() {
	var socket = new SockJS("/Chatroom/stomp");
	stompClient = Stomp.over(socket);
	stompClient.connect({}, function() {
		stompClient.subscribe("/sendTo/broker")
	})
}