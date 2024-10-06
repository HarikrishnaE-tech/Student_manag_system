package exception;

public class NoIdFoundException extends Exception {
String message;
public NoIdFoundException(String message) {
	this.message=message;
	
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}

}
