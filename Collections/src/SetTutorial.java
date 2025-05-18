import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetTutorial {

    public static void main(String[] args) {

        Set<Integer> setimasa=new HashSet<>(Arrays.asList(1,2,3,4,4,5));
        System.out.println(setimasa);
        setimasa.add(66);
        System.out.println(setimasa);
        System.out.println(setimasa.contains(6));
        System.out.println(setimasa.containsAll(Arrays.asList(5555,1)));
    }

    public static boolean checkDupli(List<Integer> arr){
        Set<Integer> dummy=new HashSet<>();
        for (int i:arr){
            if (!dummy.contains(i)){
                dummy.add(i);
            }else return false;
        }
        return true;

    }
}
