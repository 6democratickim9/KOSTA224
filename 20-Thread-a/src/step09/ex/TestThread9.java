package step09.ex;
/*
	��Ƽ������ ��������
	
	- �䱸���� �� �м� 
	
	CommonInfo �� MAKE_PATH�� 1�� �������� 30�� �ݺ��ϸ鼭 30���� ������ ���� 
	�� �� ���ϸ��� 0_�ð�����.avi or mp3 ( Ȯ���ڴ� avi �Ǵ� mp3�� �����ϰ� ���� ) ���� �����Ѵ� 
	
	�̿� ���ÿ� CommonInfo�� MUSIC_PATH �� MOVIE_PATH ���丮�� 
	MAKE_PATH ���丮���� ������ ���ϵ��� Ȯ���ں��� �̵���Ų�� 
	7�� �������� 5�� �����ؼ� ��� �̵��ǵ��� ó���Ѵ� 
	
	�� �� �۾��� ���ÿ� �����ϱ� ���ؼ� ��Ƽ ������ ������ �ʿ��ϴ� 
	
	������ �����ϴ� ������ : MakeFileWorker Thread 
	������ �̵���Ű�� ������ : MoveFileWorker Thread 
	������� implements Runnable ������� �����Ѵ� 
	
	- ���� �� ���� 
	�ڷ����� �� �����׽�Ʈ
	1. Ȯ���ڸ� �����ϰ� ���� 
	2. �ð����� 
	1.2 �� �̿��� ���ϸ� ����
	 
	3. ���丮 �� ���� ����  
	4. ���� �̵� 
	
	���� 
	�� ���� �׽�Ʈ�� ���� ������ �̿��� 
	��Ƽ ������ ���α׷� ���� 
	
 */
public class TestThread9 {
	public static void main(String[] args) {
		int makeCount=30;
		int makePeriod=1000;
		int moveCount=5;
		int movePeriod=7000;
		MakeFileWorker makeWorker=new MakeFileWorker(makeCount,makePeriod);
		MoveFileWorker moveFileWorker=new MoveFileWorker(moveCount,movePeriod);
		//���� ������ �����ؼ� start ��Ų�� 
	}
}













