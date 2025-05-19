import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Factors {

    public static List<Integer> factors(int a){
        List<Integer> factors=new ArrayList<>();
        for (int i=1;i<=a/2;i++){
            if (a%i==0){
                factors.add(i);
            }
        }
        factors.add(a);
        return factors;
    }


    public static List<Integer> factorsUsingStream(int a){
        List<Integer> arr= IntStream.rangeClosed(1,a/2)
                .filter(num ->a%num==0)
                .boxed()
                .toList();
        List<Integer> array=new ArrayList<>(arr);
        array.add(a);
        return array;

    }
}
