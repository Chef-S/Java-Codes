import java.util.*;
 

 class Employee{
Scanner sc= new Scanner(System.in);
String name;
int empid;
int salary;
Employee(){
 System.out.println("enter name");
 name =sc.nextLine();
System.out.println("Enter Empid");
empid =sc.nextInt();
System.out.println("Enter salary");
salary=sc.nextInt();
}

Employee(String name,int empid,int salary){

System.out.println("name is\t"+name);
 

System.out.println("Employee id is\t"+ empid);
System.out.println(" old salary is\t"+ salary);
}



  int increaseSalary(){
  salary = (int) (salary+salary*0.2);  
  return salary;
   }

     String method1(){
 this.name=name;     
 return name;
     }
     int  method2(){
this.salary=salary;  
 return salary;
    }
}

class Manager extends Employee{
Scanner sc= new Scanner(System.in);
String department;
Manager(){
System.out.println("Enter department");
department=sc.nextLine();
System.out.println("department is\t"+department);
}
}
 class testclass{
 public static void main(String args[]){
 Scanner sc= new Scanner(System.in);
Manager m1= new Manager();
Employee e1= new Employee();
e1.increaseSalary();
System.out.println("Name of Employee  is\t" +e1.method1());
System.out.println("New updated salary is\t" +e1.method2());
System.out.println("Name of Employee  is\t" +m1.method1());
System.out.println("New updated salary is\t" +m1.method2());
Employee e2=new Employee("shef",12,13);
}
}