package boxingAndUnboxing;

import java.util.Arrays;

public class WrapperTask {

	public static void main(String[] args)
	{
		// 아래 값들을 하나의 배열에 담기, 단 스트링 금지
		// 1, 3.14, a , CAT, false;
		
		Object numList[] = {1,3.14,'a',"CAT",false};
		
		// 기본 출력방식 
		for (int i = 0; i < 5; ++i)
		{
			System.out.println(numList[i]);
		}
		// 클래스 이용 출력방식.
		System.out.println(Arrays.toString(numList));
	}

}
