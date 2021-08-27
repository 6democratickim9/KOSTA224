package step1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class OutputService {
	public String filePath;
	public OutputService(String filePath) {
		super();
		this.filePath=filePath;
	}
		public void outputData(String data) throws IOException{
			//filePath에 해당하는 파일에 data를 출력한다
			//파일에 연결되는 NodeStream을 생성
//			FileWriter fw = new FileWriter();
			PrintWriter pw=null;//지역변수는 반드시 명시적 초기화
			try {
				pw = new PrintWriter(new FileWriter(filePath,true));
			pw.println(data);
			}finally {//finally는 항상 실행
				if(pw!=null)//pw스트림 객체가 존재하면
					pw.close();			
				}
			
			//스트림을 닫아준다(연결괸 자원의 제어권을 놓아준다), 
//			내부적으로 flush()를 호출해서 buffer(메모리)에 있는 정보를 실제 파일에 출력
			
			
			//
			}
		
}

