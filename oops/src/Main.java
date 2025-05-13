//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1
                .setName("pooju")
                .setAge(24);


        Person person2 = new Person();
        person2.setName("vik");
        person2.setAge(50);

        Person person3 = new Person().setAge(23).setName("vinaya");
        Person person4 =new Person("mimmu", 15);
        Person person5 = new Person("bublu");

        System.out.println(person1.getName() + " " + person1.getAge());
        System.out.println(person2.getName() + " " + person2.getAge());
        System.out.println(person3.getName() + " " + person3.getAge());
        System.out.println(person4.getName() + " " + person4.getAge());
        System.out.println(person5.getName() + " " + person5.getAge());

        CorporatePerson ulli = new CorporatePerson("pooja", 23, "UST");

        System.out.println(ulli);
        Person jinki = new CorporatePerson();

    }
}