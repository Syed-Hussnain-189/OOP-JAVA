import java.util.Scanner;

public class part3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        System.out.println(num/1000);
        System.out.println((num%1000)/100);
        System.out.println((num%100)/10);
        System.out.println(num%10);

        sc.close();
    }
}
