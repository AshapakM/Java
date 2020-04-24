import java.util.Scanner;

class PrimeNumber3{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First number : ");
        int start = sc.nextInt();
        System.out.print("Enter Second number : ");
        int end = sc.nextInt();

        System.out.println("List of Prime numbers between "+start+" and "+end);
        for(int i=start; i<=end; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }

        sc.close();

    }

    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % 2 == 0){
                return false;
            }
        }
        return true;
    }
}