package equals;




class Person{
	String name = null;
	int age;
	
	
	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
		{
			return true;
		}
		if (obj instanceof Person)
		{
			String other = ((Person)obj).name;
			return name.equals(other);
		}
		return false;
	}
public class EqualsTest {
	
	
		
		
	}
	
	
	public static void main(String[] args) 
	{
		Person snz = new Person("snz", 22);
		Person cia = new Person("Cia", 23);
		Person kio = new Person("kio", 30);

	}

}
