import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons=new ArrayList<>(Arrays.asList(
                new Person("pooju",24),
                new Person("vikku",60),
                new Person("mimu",3),
                new Person("barfi",5),
                new Person("Luna",8),
                new Person("Shiro",0)

        ));

        System.out.println(ageGreater(persons));
        System.out.println(greaterAge(persons));
        System.out.println(persons);
        pluss(persons);
        System.out.println(persons);
        System.out.println(avg(persons));
        System.out.println(average(persons));

    }


    public static Person maxAge(List<Person> arr){
        Person dummi=new Person(null,0);
        for (Person i:arr){
            if (i.getAge()>dummi.getAge()){
                dummi=i;
            }
        }
        return dummi ;

    }

    public static List<Person> ageGreater(List<Person> ar){
        List<Person> greater=new ArrayList<>();
        for (Person i:ar){
            if (i.getAge()>10){
                greater.add(i);
            }
        }
        return greater;

    }

    public static List<Person> greaterAge(List<Person> array){

        return array
                .stream()
                .filter(a->a.getAge()>10)
                .toList();

    }

    public static void plus5(List<Person> arr){
        for (Person i:arr){
            i.setAge(i.getAge()+5);
        }
    }
    public static void pluss(List<Person> arr){
        arr.forEach(i ->i.setAge(i.getAge()+5));
    }

    public static double avg(List<Person> array){
        double sum=0;
        for (Person i:array){
            sum+= i.getAge();
        }
        return sum/array.size();

    }

    public static double average(List<Person> arr){
        return (double) arr.stream()
                .map(Person::getAge)
                .reduce(Integer::sum)
                .get() / arr.size();
    }




}
