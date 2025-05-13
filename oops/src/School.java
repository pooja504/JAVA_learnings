public class School {
    static Person[] persons = new Person[10];

    public static void main(String[] args) {
        persons[0] = new Person("Aiden", 24);
        persons[1] = new Person("Lila", 31);
        persons[2] = new Person("Jasper", 19);
        persons[3] = new Person("Maya", 27);
        persons[4] = new Person("Ezra", 35);
        persons[5] = new Person("Zoe", 22);
        persons[6] = new Person("Leo", 29);
        persons[7] = new Person("Aria", 26);
        persons[8] = new Person("Miles", 30);
        persons[9] = new Person("Nina", 18);


//        for(Person i: persons){
//            System.out.println(i);
//        }
        System.out.println(search("Leo"));
    }

    public static Person search(String name){
        for (Person pers : persons){
            if(pers.getName().equals(name)){
                return pers;
            }
        }
        return null;
    }

}
