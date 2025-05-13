public class CorporatePerson extends Person{
    private String combani;
    public CorporatePerson(String name, int age, String combani){
        super(name,age);
        this.combani=combani;

    }

    public String getCombani() {
        return combani;
    }

    @Override
    public String toString() {
        return this.getName()+ " " + this.getAge() + " " + this.combani;
    }
}
