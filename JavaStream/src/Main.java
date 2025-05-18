import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> test=new  ArrayList<>(Arrays.asList(1,2,33,4,4));
//        for (int i: test){
//            if (i>10){
//                System.out.println(i);
//            }
//
//        }
        test.stream().filter(i ->i>10).forEach(System.out::println);

        ArrayList<Integer> test2= new ArrayList<>(Arrays.asList(1,2,4,5,6,77,8,99,10,4));
        test2.add(88);
        System.out.println(evenOdd(test2));
        System.out.println(evenOddWithStream(test2));

        System.out.println(distictNum(test2));
        System.out.println(disnum(test2));



    }

    public static ArrayList<Integer> evenOdd(ArrayList<Integer> arr){
        ArrayList<Integer> evenList=new ArrayList<>();
        for (int i:arr){
            if (i%2==0){
                evenList.add(i);
            }

        }
        return evenList;


    }

    public  static List<Integer> evenOddWithStream(ArrayList<Integer> array){

        return array.stream().filter(i ->i%2==0).toList();


    }

    public static List<Integer> distictNum(ArrayList<Integer> arr){
        List<Integer> distinctNumbers= new ArrayList<>();

        for (int i: arr){
            if(!distinctNumbers.contains(i)){
                distinctNumbers.add(i);
            }
        }
        return distinctNumbers;
    }

    public static List<Integer> disnum(ArrayList<Integer> arr){
        return  arr.stream()
                .distinct().toList();
      }
}
