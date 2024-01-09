//Program for implementing inheritance and constructor
class Employee{
    String Name;
    int Age;
    String Phnno;
    String Address;
    float Salary;

    Employee(String name,int age,String phnno,String address,float salary)
    {
        this.Name=name;
        this.Age=age;
        this.Phnno=phnno;
        this.Address=address;
        this.Salary=salary;
    }

    void print_salary()
    {
        System.out.println("Salary : "+Salary);
    }
}
class manager extends Employee
{
    String Specialization;
    manager(String name,int age,String phnno,String address,float salary,String spec)
    {
        super(name,age,phnno,address,salary);
        this.Specialization=spec;
    }
    
}
class officer extends Employee
{
    String Department;
    officer(String name,int age,String phnno,String address,float salary,String dept)
    {
        super(name,age,phnno,address,salary);
        this.Department=dept;
    }
    
}
public class Employeedetails {
    public static void main(String args[]){
        manager M=new manager("John Doe", 35, "1234567890", "123 Main St", 60000, "Finance");
        officer O=new officer("Alice Smith", 28, "9876543210", "456 Oak St", 40000, "HR");

        System.out.println("Manager Details ");
        System.out.println("name : "+M.Name);
        System.out.println("age : "+M.Age);
        System.out.println("phn no. : "+M.Phnno);
        System.out.println("address : "+M.Address);
        System.out.println("Specialization : "+M.Specialization);
        M.print_salary();
        
        
        System.out.println("\nOfficer Details");
        System.out.println("name : "+O.Name);
        System.out.println("age : "+O.Age);
        System.out.println("phn no. : "+O.Phnno);
        System.out.println("address : "+O.Address);
        System.out.println("Department : "+O.Department);
        O.print_salary();
        
    }
}
/*
 Output:
Manager Details 
name : John Doe
age : 35
phn no. : 1234567890
address : 123 Main St
Specialization : Finance
Salary : 60000.0

Officer Details
name : Alice Smith
age : 28
phn no. : 9876543210
address : 456 Oak St
Department : HR
Salary : 40000.0
 */