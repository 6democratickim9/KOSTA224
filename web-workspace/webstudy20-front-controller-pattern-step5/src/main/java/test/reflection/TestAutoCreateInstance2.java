package test.reflection;

class ReflectionService{
	public void create(String command) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		String packageInfo=this.getClass().getPackage().getName();
		System.out.println(packageInfo+"."+command);//패키지정보에 . 와 파라미터로 받은 커맨드를 합쳐서 출력한다
		Player p=(Player)Class.forName(packageInfo+"."+command).newInstance();
		p.play();
	}
}
public class TestAutoCreateInstance2 {
	public static void main(String[] args) {
		String command="CDPlayer";
		command="Youtube";
		ReflectionService service = new ReflectionService();
		try{
			service.create(command);
		}catch(InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}

}
