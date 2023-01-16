package equals;


class Student{
	String name;
	int age;
	int number;
	
	
	public Student(String name, int age, int number)
	{
		super();
		this.name = name;
		this.age = age;
		this.number = number;
	}


	@Override
	public boolean equals(Object obj)
	{
		
		return number == ((Student)obj).number &&
				age == ((Student)obj).age;
		
	
	}
	
	
}


public class EqualsTesk {

	
	
	
	public static void main(String[] args)
	{
		Student SNSKE = new Student("짱구",5, 1);	
		Student HMWRI = new Student("짱아",5, 1);	
		Student SNSKA = new Student("짱구",5, 1);	
		
		System.out.println(SNSKE.equals(SNSKA));
		System.out.println(SNSKE.equals(HMWRI));
		System.out.println(SNSKA.equals(HMWRI));
		
		
		
		
	}

}
