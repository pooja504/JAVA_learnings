import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Company {

//    companyName (String)
//    employees (Employee array)
//    numEmployees (int)

    private String comapanyName;
    private Employee[] employees;
    private int numEmployee;


    public Company(String comapanyName,Employee[] employees,int numEmployee){
        this.comapanyName=comapanyName;
        this.employees=employees;
        this.numEmployee=numEmployee;
    }


    public String getComapanyName(){
        return this.comapanyName;
    }

    public void setComapanyName(String comapanyName){
        this.comapanyName=comapanyName;
    }

    public Employee[] getEmployees(){
        return this.employees;
    }

    public void setEmployees(Employee[] employees){
        this.employees=employees;
    }

    public int getNumEmployee() {
        return numEmployee;
    }

    public void setNumEmployee(int numEmployee) {
        this.numEmployee = numEmployee;
    }


    public double getAvgSalary(){
        double sum= 0;
        for (Employee i:employees){
            sum+=i.getSalary();
        }
        return sum/numEmployee;
    }

    public Employee getEmployeeWithMaxSalary(){
        Employee dummyEmployee=new Employee(0,null,null,0);
        double sala=0;
        for (Employee emp: employees){
            if (emp.getSalary()>dummyEmployee.getSalary()){
                dummyEmployee=emp;

            }
        }
        return dummyEmployee;

    }

    public ArrayList<Employee> getEmployeesByDesignation(String designation){
        ArrayList<Employee> employeeList = new ArrayList<>();
        for (Employee emplo: employees){
            if (emplo.getDesignation().equals(designation)){
                employeeList.add(emplo);
            }
        }
        return employeeList;


    }


    @Override
    public synchronized String toString() {
        return "Company{" +
                "comapanyName='" + comapanyName + '\'' +
                ", employees=" + Arrays.toString(employees) +
                ", numEmployee=" + numEmployee +
                '}';
    }
}
