package step5;
import java.io.IOException;
class Service{
	public void a(int i) throws IOException {
		if(i<0)
			throw new IOException("TEST");//Exception 발생시  finally가 수행되지 않는다 
		try {
			/*
			 * if(i<0) throw new IOException("TEST");
			 */			
			System.out.println("a");
		}finally {
			System.out.println("b");
		}
	}
}
public class Test {
	public static void main(String[] args) {
		Service s=new Service();
		try {
			s.a(-1);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
