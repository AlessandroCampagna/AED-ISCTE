import java.util.Scanner;
public class B {

    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    String s2 = sc.nextLine();
    String s3 = sc.nextLine();
    sc.close();

    int n1 = s1.length();
    int n2 = s2.length();
    int n3 = s3.length();

    if (n1 >= n2 && n1 >= n3)
    System.out.println(s1.toUpperCase());

    else if (n2 >= n1 && n2 >= n3)
    System.out.println(s2.toUpperCase());

    else if (n3 >= n1 && n3 >= n2)
    System.out.println(s3.toUpperCase());
    
    }
}
