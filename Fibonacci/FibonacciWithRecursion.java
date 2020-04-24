class FibonacciWithRecursion{


    static int n1=0, n2=1, n3=0;

    static void printFibonacciRecursion(int count){

        if(count > 0){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" "+n3);
            printFibonacciRecursion(count-1);
        }
    }


    public static void main(String[] args) {
        
        int count = 10;
        System.out.print(n1+" "+n2); // printing 0 and 1
        printFibonacciRecursion(count-2); // count-2 because 2 numbers are already printed

    }
}