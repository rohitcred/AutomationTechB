package functions;

public class Script {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library.sum(10, 20);
		Library.print();
		Library ref = new Library();
		ref.fun1();
		String data=ref.printName("rohit");
				System.out.println(data);
				
				AccessModifiers ref2=new AccessModifiers();
				ref2.protectedFunction();
				ref2.publicfunction();
				ref2.noAccessModifier();
				
	

	}

}
