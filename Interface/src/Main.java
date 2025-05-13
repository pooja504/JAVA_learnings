//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Person pooju = new PersonA();
    PersonB pooja = new PersonB();

        System.out.println(pooju.walk()+" "+pooju.getWeight());
        System.out.println(pooja.getColor()+" "+pooja.walk()+" "+pooja.getBrandy());


    }
}