package step1;

import java.util.TreeSet;

public class TestSet2 {
	public static void main(String[] args) {
		/*
		 *  Set interface 의 하위 자료구조체 : 중복 인정 x 
		 *  LinkedHashSet : 중복 인정 x , 추가 순서가 보장 
		 *  TreeSet : 중복 인정 x , 정렬 기능 내장 
		 */
		TreeSet<String> set1=new TreeSet<String>();
		set1.add("피자");
		set1.add("맥주");
		set1.add("갈비탕");
		set1.add("갈비탕");
		System.out.println(set1.size());
		System.out.println(set1);//TreeSet 은 정렬 기능이 있다 
		System.out.println("**************************");
		TreeSet<Integer> set2=new TreeSet<Integer>();		
		set2.add(33);
		set2.add(77);
		set2.add(33);
		set2.add(22);
		set2.add(1);
		System.out.println(set2.size());
		System.out.println(set2);//오름차순 정렬되어 출력된다 
	}
}


















