package test;

public class ClientOuter {
	private String socket;
	public void run() {
		System.out.println(socket);
	}
	public class ReWorker{
		public void run() {
			System.out.println(socket);
		}
	}

}
