import java.util.Scanner;
class R1 implements Runnable{
public void run(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number till which you want to print odd numbers");
int num=sc.nextInt();
for(int i=0;i<num;i++){
if(i%2!=0){
System.out.println(i);
}
}
}
}
class R2 implements Runnable{
public void run(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number till which you want to print Even numbers");
int num=sc.nextInt();
for(int i=0;i<num;i++){
if(i%2==0){
System.out.println(i);
}
}
}
}

class Demo {
public static void main(String args[]){
R1 r1=new R1();
Thread t1=new Thread(r1); 
t1.start();
R2 r2=new R2();
Thread t2=new Thread(r2);
t2.start();
System.out.println("Main Thread executed");

}
}