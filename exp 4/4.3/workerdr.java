import java.util.*;
class worker{
  int wage2;
double wage1;
Scanner sc= new Scanner(System.in);
int i;
worker(){
String name;
System.out.println("enter the name of the employee");
name=sc.nextLine();
System.out.println("name of employee is" +name);
}
void ComPay(double week){
 
double wage1= 40*100*week;
System.out.println(wage1);
}
void ComPay(int day){

  wage2=day*800;
System.out.println(wage2);
} 
}

class SalariedWorker extends worker{

void show1(){
System.out.println("wage of salaried worker is"+ wage1);
}
}
class DailyWorker extends worker{
void show2(){
System.out.println("wage of  daily worker is"+ wage2);
}
}
class workerdr{
public static void main(String args[]){
SalariedWorker sw1 =new SalariedWorker();
sw1.ComPay(10.5);
DailyWorker dw1= new DailyWorker(); 
dw1.ComPay(10);
}
}