import java.util.Scanner;
public class A {

    public static String dia (int n){
    	
    	String s = new String();
        switch(n){

            case 1 :
            s= new String("Segunda-feira");
            break;

            case 2 :
            	 s=  new String("Terça-feira");
            	 break;

            case 3 :
            	 s=  new String("Quarta-feira");
            	 break;

            case 4 :
            	 s=  new String("Quinta-feira");
            	 break;

            case 5 :
            	 s=  new String("Sexta-feira");
            	 break;

            case 6 :
            	 s=  new String("Sabado");
            	 break;

            case 7 :
            	 s=  new String("Domingo");
            	 break;
            
        }
        
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = dia(n);
        System.out.println(s);
        sc.close();
        
    }
}
