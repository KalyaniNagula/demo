package wrapercalss;

public class Wraperclass {

	public static void main(String[] args) {
		Integer Integervalue=200;
		System.out.println(Integervalue);
		Integer Integervalue1=new Integer(Integervalue);
		System.out.println(Integervalue1);
		Integer Integervalue2=Integer.valueOf(Integervalue1);
		System.out.println(Integervalue2);
		Float floatvalue=new Float(2.5);
		System.out.println(floatvalue);
		System.out.println(Float.valueOf(floatvalue));
		Double doublevalue=new Double(500.0);
		System.out.println(doublevalue);
		System.out.println(Double.valueOf(55.0));
		Character character=new Character('k');
		System.out.println(character);
		System.out.println(Character.valueOf('n'));
		Boolean boolean1=new Boolean(true);
		System.out.println(boolean1);
		System.out.println(Boolean.valueOf(false));
		Long Longvalue=new Long(300);
		System.out.println(Longvalue);
		System.out.println(Long.valueOf(450));
		
		

	}

}