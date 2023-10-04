package Practice.lab2;

public class StaffDemo {
    public static void main(String[] args) {

        System.out.println("Staff-1: ");
        Staff t1;
        t1 = new Teaching("CS001", "Varun", "7894561234", 25000, "CS", 3);
        t1.display();

        System.out.println("\nStaff-2: ");
        t1 = new Technical("CS002", "Ashik", "6154237894", 8500, "Flutter");
        t1.display();

        System.out.println("\nStaff-3: ");
        t1 = new Contract("CS003", "Kavan", "9478615423", 9500, 3);
        t1.display();

    }
}


class Staff
{
    String id, name, phone;
    int salary;

    public Staff(String id, String name, String phone, int salary)
    {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.salary = salary;
    }

    public void display()
    {
        System.out.print(id + "\t" + name + "\t" + phone + "\t" + salary + "\t");
    }
}

class Teaching extends Staff
{
    String domain;
    int publications;

    public Teaching(String id, String name, String phone, int salary, String domain, int publications) {
        super(id, name, phone, salary);
        this.domain = domain;
        this.publications = publications;
    }

    public void display()
    {
        super.display();
        System.out.println(domain + "\t" + publications);
    }
}

class Technical extends Staff
{
    String skills;

    public Technical(String id, String name, String phone, int salary, String skills) {
        super(id, name, phone, salary);
        this.skills = skills;
    }

    public void display()
    {
        super.display();
        System.out.println(skills);
    }
}

class Contract extends Staff
{
    int period;

    public Contract(String id, String name, String phone, int salary, int period) {
        super(id, name, phone, salary);
        this.period = period;
    }

    public void display()
    {
        super.display();
        System.out.println(period);
    }
}
