package list;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ArrayListTest2 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		//추가
		list.add(10);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(20);
		list.add(90);
		list.add(100);
		
		
		//list.sort(2);
		
		System.out.println(list);
		// 삭제법
		list.remove(6);
		System.out.println(list);
		
		// 삭제 : 검색후 삭제 성공여부까지
		list.remove(Integer.valueOf(90));
		System.out.println(list);
		// 성공여부
		System.out.println(list.contains(10));
		
		//값으로 인덱스 가져오기 : 해당 값의 인덱스 번호를 반환
		System.out.println(list.indexOf(40));
		
		//수정법
		System.out.println(list.set(2, 50));
		list.set(2, 60);
		System.out.println(list);
		// 정렬법
		list.sort(null);
		System.out.println("정렬 테스트"+list);
		
		//메소드의 설명에 throws가 있다면 예외처리를 고려한다.
		try
		{
			list.set(5, 100);
			
		}catch (IndexOutOfBoundsException e)
		{
			System.out.println("인덱스 범위확인");
		}
		
		
		list.removeAll(list);
		System.out.println(list); // 메모리에 공간은 남고 값만 지워짐.
		
	}

}
