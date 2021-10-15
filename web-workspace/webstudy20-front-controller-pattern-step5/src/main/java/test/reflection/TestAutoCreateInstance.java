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
		
	}

}
