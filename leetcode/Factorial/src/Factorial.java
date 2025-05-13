public class Factorial {


    public static void main(String[] args) {
        System.out.println(findFactorial(4));
    }


    public static int findFactorial(int a){
        int sum=1;
        if(a>0){
            for (int i=1; i<=a;i++){
                sum *=i;
            }
            return sum;

        } else if (a==0) {
            return 1;

        }
        return -1;

    }

}
