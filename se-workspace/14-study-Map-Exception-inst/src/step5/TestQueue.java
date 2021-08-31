package step5;

import java.util.LinkedList;
import java.util.Queue;

/*
 *  Queue : FIFO ( First In, First Out ) 
 *  Stack : LIFO ( Last In, First Out ) 
 */
public class TestQueue {
	public static void main(String[] args) {
		Queue<String> queue=new LinkedList<String>();
		queue.add("성원오빠 안녕!");
		queue.add("어디야?");
		queue.add("대답안해???");
		queue.add("헤어져~~~!!");
		//queue 는 FIFO ( 선입선출 ) 
		//System.out.println(queue.poll());
		//System.out.println(queue);
		// while loop , isEmpty() , poll() 이용해 모든 요소를 추출 
		while(queue.isEmpty()==false) {//비어 있지 않을 동안 
			System.out.println(queue.poll());//FIFO 로 추출된다 
		}
		System.out.println(queue);
	}
}











