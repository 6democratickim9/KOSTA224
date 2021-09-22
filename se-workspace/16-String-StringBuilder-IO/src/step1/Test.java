package step1;
class Ex{
	String message;

	Ex(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}

class MyEx extends Ex{
	MyEx(String message){
		super(message);
	}
}

public class Test {
	public static void main(String[] args) {
		MyEx m = new MyEx("a");
		System.out.println(m.getMessage());
	}
}
