import java.util.Scanner;

public class primeNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many prime numbers you want to print? ");
        int numbers = sc.nextInt();

        int count = 0 ;
        int num = 0;

        while(count<numbers) {
            if(isPrime(num)){
                System.out.println(num);
                count++ ;
            }
            num++ ;
        }
        sc.close();
    }

    static boolean isPrime(int num) {
        if(num <= 1){
            return false;
        }else if(num <= 3){
            return true;
        }

        if(num%2 == 0 || num%3 == 0){
            return false;
        }

        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }
}