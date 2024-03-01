import java.util.Scanner;

public class dataType {

    public static void main(String[] args) {
        byte    num1 = 10;
        short   num2 = 240;
        int     num3 = 31300;
        long    num4 = 192111;
        float   num5 = 23432.5F;
        double  num6 = 25634.5;
        boolean num7 = true;

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(num7);
 
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of Byte type: ");
        num1 = sc.nextByte();

        System.out.print("Enter number of Short type: ");
        num2 = sc.nextShort();

        System.out.print("Enter number of Int  type: ");
        num3 = sc.nextInt();

        System.out.print("Enter number of Long type: ");
        num4 = sc.nextLong();

        System.out.print("Enter number of Float type: ");
        num5 = sc.nextFloat();

        System.out.print("Enter number of Double type: ");
        num6 = sc.nextDouble();

        System.out.print("Enter number of Boolean type: ");
        num7 = sc.nextBoolean();

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(num7);
        
        sc.close();
    }
}