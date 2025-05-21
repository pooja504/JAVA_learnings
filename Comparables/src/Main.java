import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Employee vik=new Employee(25,"Vignesh");
        Employee pooju=new Employee(21,"Poooju");
        Employee mimu=new Employee(2,"Mimu");

        Employee[] employees= {vik,pooju,mimu};

        Arrays.sort(employees);
        System.out.println(Arrays.toString(employees));

        Person[] per1={
                new Person("Vinaya",20),
                new Person("Kunji",21),
                new Person("Auntymani",50)
        };

        Comparator<Person> personComparator= Comparator.comparingInt(Person::getAge);
        Comparator<Person> personNameComparator = Comparator.comparing(Person::getName);

        Arrays.sort(per1, personNameComparator);

        System.out.println(Arrays.toString(per1));



    }
}
