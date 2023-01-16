package boxingAndUnboxing;

public class Boxing {

	public static void main(String[] args)
	{
		int data = 10;

		//Auto Boxing
		Integer i_data = data; //자동 권장 방식
		Double d_data = (double) data; // 캐스팅 가능.
		//Auto UnBoxing
		data = i_data;			// 자동 권장 방식
		System.out.println(data);
		// int num2 = (int) i_data4; // 역 캐스팅 이렇게는 안됨.
		double num2 = d_data;
		System.out.println("더블형"+d_data);

		// Boxing
		//@SuppressWarnings 어노테이션은 컴파일 경고를 사용하지 않도록 
		// 설정해주는 것으로 한마디로 이클립스에서 노란색 표시줄이 나타내는 것 즉,
		// 경고를 제외시킬 때 사용한다.
		@SuppressWarnings("removal")
		Integer i_data3 = new Integer(20); //권장되지 않은 박싱
		Integer i_data2 = Integer.valueOf(100); //권장 방식
		// UnBoxing
		int num = i_data3.intValue();
		data = i_data2.intValue();
		
		System.out.println(i_data2);
		System.out.println(data);
		System.out.println(num);		
		System.out.println(i_data3);
		
	}

}
