public class Main {

    public static void main(String[] args) {
        DoThis cat=new Animal();
        DoThis person=new Human();
        DoThis insect= () -> System.out.println("fly");
        person.walk();
        insect.walk();
        print(cat);
        print(person);
        print(insect);



    }

    public static void print(DoThis obj){
        obj.walk();

    }


}
