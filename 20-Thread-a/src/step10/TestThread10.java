package step10;
public class TestThread10{
	public static void main(String[] args) {
		int makeCount=30;
		int makePeriod=1000;
		int moveCount=5;
		int movePeriod=7000;
		MakeFileWorker makeWorker=new MakeFileWorker(makeCount,makePeriod);
		MoveFileWorker moveFileWorker=new MoveFileWorker(moveCount,movePeriod);
		//���� ������ �����ؼ� start ��Ų�� 
		Thread makeThread = new Thread(makeWorker);
		makeThread.start();
		Thread moveThread = new Thread(moveFileWorker);
		moveThread.start();
	}
}













