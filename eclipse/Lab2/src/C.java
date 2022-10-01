import java.util.Scanner;
public class C {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        String[] sv = s.split(" ");
        System.out.println(sv[sv.length -1 ].toUpperCase() + ", " + sv[0]);


    }
}