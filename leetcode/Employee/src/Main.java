public class Main {
    public static void main(String[] args) {


        Employee e1 = new Employee(1, "Alice", "Developer", 50000);
        Employee e2 = new Employee(2, "Bob", "Tester", 45000);
        Employee e3 = new Employee(3, "Charlie", "Manager", 70000);
        Employee e4 = new Employee(4, "David", "Developer", 52000);
        Employee e5 = new Employee(5, "Eva", "Designer", 48000);
        Employee e6 = new Employee(6, "Frank", "Developer", 51000);
        Employee e7 = new Employee(7, "Grace", "Tester", 46000);
        Employee e8 = new Employee(8, "Henry", "Support", 43000);
        Employee e9 = new Employee(9, "Ivy", "HR", 55000);
        Employee e10 = new Employee(10, "Jack", "Lead", 75000);

        Employee[] employees1={e1,e2,e3,e4,e5,e6};
        Employee[] employees2={e7,e8,e9,e10};
        Company ust=new Company("UST",employees1,6);
        Company tcs=new Company("TCS", employees2,4);
        System.out.println(ust.getEmployeeWithMaxSalary());
        System.out.println(ust.getEmployeesByDesignation("Developer"));
        System.out.println(ust);

    }
}
