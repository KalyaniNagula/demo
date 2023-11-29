package Generic;

public class Person implements Comparable {

	private String string;
	int value;;
	

	public Person(String string, int value) {
		this .string=string;
		this. value=value;
		
		
	}

	@Override
	public int compareTo(Object o) {
		
		return 0;
	}

}
