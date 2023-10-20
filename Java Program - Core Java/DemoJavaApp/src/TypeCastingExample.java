
public class TypeCastingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a=10;
		short b=a;			// implicit type casting 
		System.out.println("a "+a);
		System.out.println("b "+b);
		short c = 129;			// range -32767 to 32768
		//byte d = c;
		byte d = (byte)c;		// range of byte -128 to 127
		System.out.println("c "+c);
		System.out.println("d "+d);
		
		int m=100;
		float n=m;				// implicit type casting 
		System.out.println("m "+m);
		System.out.println("n "+n);
		
		//float o=100;
		//float o=(float)100.12;		// explicit type casting 
		float o= 100.124567f;				// explicit type casting 
		//int p = o;
		int p = (int)o;			// explicit type casting 
		System.out.println("o "+o);
		System.out.println("p "+p);
	}

}
