package test.reflection;
interface Player{
	public void play();
}
class CDPlayer implements Player{
	@Override
	public void play() {
		System.out.println("play the cd");
	}
}
class Youtube implements Player{
	@Override
	public void play() {
		System.out.println("play the video");
	}
}

public class TestAutoCreateInstance {
	public static void main(String[] args) {
		String info = "test.relflection.CDPlayer";
		String info2="test.reflection.Youtube";

			Player p1;
			try {
				p1 = (Player)Class.forName(info).newInstance();
				p1.play();
			Player p2 = (Player)Class.forName(info2).newInstance();
			p2.play();
			} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
				e.printStackTrace();
			}
			
		
	}

}
