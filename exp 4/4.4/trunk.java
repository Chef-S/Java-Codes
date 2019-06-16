import java.util.Scanner;
class trunk{


public static void main(String args[]){
int dur;
System.out.println("what kind of call do you want ot make \t 1. ordianry 2.urgent 3.lightning");
Scanner sc= new Scanner(System.in);
int choice=sc.nextInt();
switch(choice){
case 1:

charge c1=new charge();
break;
case 2:

System.out.println("enter duration");
dur=sc.nextInt();
charge c2=new charge(dur);
break;
case 3:


System.out.println("enter duration in decimal");
dur=sc.nextInt();
charge c3=new charge(dur);
break;

default:

System.out.println("error try again");
}
}
}
class charge{
int rate;
 charge(){
rate=100;
System.out.println("your fixed charges are" + rate);
}

charge(int dur){
rate=20*dur;
System.out.println("your charges are" + rate);
}

charge(double dur){
rate=(int)(30*dur);
System.out.println("your charges are" + rate);
}
}