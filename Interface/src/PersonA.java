public class PersonA implements  Person{
    @Override
    public String walk() {
        return "Slow walker";
    }

    @Override
    public int getWeight() {
        return 20;
    }
}
