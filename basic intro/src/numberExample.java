public class numberExample {
	public static void main(String[] args) {
		// write function that take in a number and prints it
		// print first 5 number 1 2 3 4 5
		printNum1(1);

	}
	static void   printNum1(int n ){
		System.out.println(n);
		printNum2(2);
	}

	static  void printNum2(int n){
		System.out.println(n);
		printNum3(3);
	}
	static  void printNum3(int n )
	{
		System.out.println(n);
		printNum4(4);
	}
	static  void printNum4(int n){
		System.out.println(n);
		printNum5(5);
	}
	static  void printNum5(int n){
		System.out.println(n);
	}
}

