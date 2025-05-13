public class Animal {
    private String name;
    private boolean isMamal;


    public Animal(String name, boolean isMamal) {
        this.name = name;
        this.isMamal = isMamal;
    }

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMamal() {
        return isMamal;
    }

    public void setMamal(boolean mamal) {
        isMamal = mamal;
    }

    @Override
    public String toString() {
        return this.name + " "+ this.isMamal;
    }








}
