package boxingAndUnboxing;

public class WrapperTest2 {

	public static void main(String[] args)
	{	 //문자열을 기본타입 값으로 변환
        String str1 = "10";
        String str2 = "1.10";
        String str3 = "true";
        
        int str1_1 = Integer.parseInt(str1);
        float str2_1 = Float.parseFloat(str2);
        boolean str3_1 = Boolean.parseBoolean(str3);
        
        // 레퍼클래스 객체 생성
        Integer num1 = 10; // 
        Integer num2 = 10;
        // 기본 자료형 생성.
        int i = 10;
        
        //래퍼클래스 == 기본타입
        System.out.println("래퍼클래스 == 기본타입 : "+ (num1 == i));
        System.out.println(System.identityHashCode(num2)); // 주소값 확인 메소드.
        System.out.println(System.identityHashCode(i));
        //래퍼클래스 이퀄즈 기본
        System.out.println("래퍼클래스 equals 기본타입 : "+ (num2.equals(i)));
        System.out.println(System.identityHashCode(num2));
        System.out.println(System.identityHashCode(i));
        // 래퍼클래스 == 래퍼
        System.out.println("래퍼클래스 == 레퍼 : "+ (num1 == num2)); // 주소값.
        System.out.println(System.identityHashCode(num1));
        System.out.println(System.identityHashCode(num2));
        // 레퍼클래스 . 이퀄즈
        System.out.println("래퍼클래스 equals 래퍼 : "+ (num1.equals(num2)));
     
        
	}


}
