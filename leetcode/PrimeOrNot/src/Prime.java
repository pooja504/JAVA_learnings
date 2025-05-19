import java.util.stream.IntStream;

public class Prime {

    public static boolean isPrime(int a){
        if (a==1)return true;
        for (int i=2;i<a/2;i++){
            if (a%i==0){
                return false;
            }
        }
        return true;


    }

    public static boolean isPrimeUsing(int a){
        return IntStream.rangeClosed(2,a/2)
                .noneMatch(num -> a%num==0);
    }
}
