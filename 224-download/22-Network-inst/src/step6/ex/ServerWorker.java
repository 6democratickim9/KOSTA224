package step6.ex;

import java.net.Socket;

public class ServerWorker implements Runnable{
	private Socket socket;
	
	public ServerWorker(Socket socket) {
		super();
		this.socket = socket;
	}

	@Override
	public void run() {
	}

}
