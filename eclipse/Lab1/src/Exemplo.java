import java.util.Scanner;
public class Exemplo {
	public static void main(String[] args) {
		
		// lab 1 A //
		System.out.println("Hello World");

		// lab 1 B //
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		System.out.print(n1+n2);
		
		// lab C //
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		switch (c ) {
		
		case 1 :
			System.out.println(a+b);
			break;
		case 2:
			System.out.println(a-b);
			break;
		case 3 :
			System.out.println(a*b);
			break;
		case 4:
			System.out.println(a/b);
			break;
			
		}

		sc.close();
	}

}
