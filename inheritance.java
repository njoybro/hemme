import java.util.Scanner;
class Employee
{
 String name;
 int age;
 long phoneNumber;
 String address;
 double salary;
 void printSalary()
 {
 System.out.println("Salary="+salary);
 }
}
class Officer extends Employee
{
 String specialization;
}
class Manager extends Employee
{
 String department;
}
class Empinheritance
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
Officer o = new Officer();
System.out.println("Enter the officer's name:");
o.name=sc.nextLine();
System.out.println("Enter Address:"); 
o.address=sc.nextLine();
System.out.println("Enter Specialization:");
o.specialization=sc.nextLine();
System.out.println("Enter Age:");
o.age=sc.nextInt();
System.out.println("Enter PhoneNumber:");
o.phoneNumber=sc.nextLong();
System.out.println("Enter Salary:");
o.salary=sc.nextDouble();
//sc.nextLine(); // to skip new Line
System.out.println("*****************************************");
System.out.println("OFFICER DETAILS:");
System.out.println("Officer's name:"+o.name);
System.out.println("Age:"+o.age);
System.out.println("Address:"+o.address);
System.out.println("PhoneNumber:"+o.phoneNumber);
System.out.println("Specialization:"+o.specialization);
o.printSalary();
System.out.println("*****************************************");
sc.nextLine(); // to skip new Line
Manager m = new Manager();
System.out.println("Enter the manager's Detail");
System.out.println("Enter the manager's name:");
m.name=sc.nextLine();
System.out.println("Enter Address:");
m.address=sc.nextLine();
System.out.println("Enter Department");
m.department=sc.nextLine();
System.out.println("Enter Age:");
m.age=sc.nextInt();
System.out.println("Enter PhoneNumber:"); 
m.phoneNumber=sc.nextLong();
System.out.println("Enter Salary:");
m.salary=sc.nextDouble();
sc.nextLine(); // to skip new Line
System.out.println("*****************************************");
System.out.println("OFFICER DETAILS:");
System.out.println("Officer's name:"+m.name);
System.out.println("Age:"+m.age);
System.out.println("Address:"+m.address);
System.out.println("PhoneNumber:"+m.phoneNumber);
System.out.println("Department:"+m.department);
m.printSalary();
System.out.println("*****************************************");
}
}
