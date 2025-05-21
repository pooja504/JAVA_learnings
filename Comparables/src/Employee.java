public class Employee implements Comparable<Employee>{
    private int age;
    private String name;

    public Employee(int age, String name) {
        this.age = age;
        this.name = name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public int compareTo(Employee o) {
        if (this.age>o.age){
            return -1;
        } else if (this.age<o.age) {
            return 1;

        }else {
            return 0;
        }

        //return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
