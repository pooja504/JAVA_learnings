import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        List<Integer> array=new LinkedList<>();

        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(4);
        array.add(5);
        array.add(0,3);

        System.out.println(array);
        array.set(2,6);
        System.out.println(array);
        System.out.println(array.contains(5));

        System.out.println(isContain(5,array));
        vikku(array);
        System.out.println(array);
        int i=3;
        doNothingLikeViku(i);
        System.out.println(i);
        System.out.println(array.get(2));




    }

    public static void doNothingLikeViku(int a){
        a=a+3;

    }

    public static boolean isContain(int a, List<Integer> arr){
        for (int i:arr) {
            if (i == a) return true;

        }
        return false;

    }


    public static void vikku(List<Integer> arr){
        arr.add(5,666666);

    }
}
