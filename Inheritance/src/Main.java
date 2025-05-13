//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Parrot thatha1 = new Parrot("thathama",false,true,"green");
        Parrot kaka = new Parrot();
        kaka.setName("crow");
        kaka.setMamal(false);
        kaka.setBird(false);
        kaka.setColor("black");



        Cat perssian = new Cat("mimmu",true,true,"male");
        Cat peraki = new Cat();
        peraki.setName("Luna");
        peraki.setMamal(true);
        peraki.setHasTail(true);
        peraki.setGender("Female");

//        System.out.println(thatha1);
//        System.out.println(kaka);
//        System.out.println(peraki);
//        System.out.println(perssian);

        Animal[] animals = {peraki,perssian,thatha1,kaka};
        for(Animal i : animals){
            if (i instanceof Cat){
            Cat poocha =(Cat) i;
            System.out.println(poocha.getGender());
            }else {
                Parrot kili = (Parrot) i;
                System.out.println(kili.getColor());
            }
        }



    }
}