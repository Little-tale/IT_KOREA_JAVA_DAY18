package boxingAndUnboxing;

public class WrapperTest3 {

	public static void main(String[] args)
	{
//      //문자열을 기본 타입 값으로 변환
//  String str1 = "10";
//  String str2 = "1.16";
//  String str3 = "true";
//  
//  //int, long, float, double, boolean
//  int num1 = Integer.parseInt(str1);
//  System.out.println(num1 + str1);
  
  //값은 10
  // 래퍼클래스 객체생성 (int형 num1)
  Integer num1 = new Integer(10);
  
  // 래퍼클래스 객체생성( int형 num2)
  Integer num2 = Integer.valueOf(10);
  
  // 기본 자료형 변수생성(int형 i)
  int i = 10;
  
  //1. 래퍼클래스 == 기본타입 : 
   System.out.println(System.identityHashCode(num1));
     System.out.println(System.identityHashCode(i));
     System.out.println(System.identityHashCode(num2));
     
  System.out.println("래퍼클래스 == 기본타입 : " +(num1 == i)); //true
  //2. 래퍼클래스.equals(기본타입)
  System.out.println("래퍼클래스.equals(기본타입) : " + num2.equals(i)); //true
  //3. 래퍼클래스 == 래퍼클래스
  System.out.println("래퍼클래스 == 래퍼클래스 : " + (num1 == num2)); //false
     System.out.println(System.identityHashCode(num1));
     System.out.println(System.identityHashCode(num2));
  System.out.println(num1);
  System.out.println(num2);
  //연산 내부의 값을 비교하는 것이 아니라 래퍼객체의 참조 주소를 비교한다
  //4. 래퍼클래스.equals(래퍼클래스)
  System.out.println("래퍼클래스.equals(래퍼클래스) : " + num1.equals(num2));
}

}