public class PersonB implements  Person,Vehicle {

    @Override
    public String walk() {
        return "fast runner";
    }

    @Override
    public int getWeight() {
        return 45;
    }

    @Override
    public String getColor() {
        return "blue";
    }

    @Override
    public String getBrandy() {
        return "Mahindra";
    }
}
