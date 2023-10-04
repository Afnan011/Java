package Practice.lab1;
import java.util.Scanner;


public class EmployeeDemo {
    public static void main(String[] args) {

        Employee emp1 = new Employee("E01", "Afnan", 25000);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of Employees: ");
        int n = sc.nextInt();

        Employee[] emp = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter Employee " + (i+1) + " details: ");

            System.out.print("Enter Employee ID: ");
            String empId = sc.next();

            System.out.print("Enter Employee Name: ");
            String empName = sc.next();

            System.out.print("Enter Basic Salary: ");
            float salary = sc.nextFloat();

            emp[i] = new Employee(empId, empName, salary);
        }

        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println("EmpId\tEmpName\t\tBasicSalary\t\tDA\t\t\tHRA\t\tGrossSalary\t\t\tIncomeTax\t\tNet Salary");
        for (int i = 0; i < n; i++) {
            emp[i].calculate();
            emp[i].display();
        }

        System.out.println("-----------------------------------------------------------------------------------------------");

    }
}


class Employee
{
    String empId;
    String empName;
    float salary;
    float da, hra, gross, inTax, netSal;

    public Employee(String empId, String empName, float salary)
    {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    public void calculate()
    {
        da =  salary * 0.73f;
        hra = salary * 0.1f;
        gross = salary + da + hra;
        inTax = gross * 0.3f;
        netSal = gross - inTax;
    }

    public void display()
    {
        System.out.printf("%s\t\t%s\t\t%.2f\t\t%.2f\t%.2f\t\t%.2f\t\t%.2f\t\t\t%.2f\n", empId, empName, salary, da, hra, gross, inTax, netSal);
    }

}
/*
E01
Afnan
25000

E02
Akash
20000

E03
sinan
23000
 */