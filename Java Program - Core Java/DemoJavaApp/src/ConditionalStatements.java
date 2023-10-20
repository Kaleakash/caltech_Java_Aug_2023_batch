
public class ConditionalStatements {

	public static void main(String[] args) {
	
//	int a=10;
//	int b=50;
//	
//	if(a>b) {
//		System.out.println("a is largest");
//	}else {
//		System.out.println("b is largest");
//	}
		
	int label=10;
	switch(label) {
	case 1:System.out.println("This is 1st block");
	        break;
	case 2:System.out.println("This is 2nd block");
    		break;
	case 3 : System.out.println("This is 3rd block");
	        break;
	 default:System.out.println("Wrong block or default block");
	         break;
	}
	System.out.println("Finish");
	
	}

}
