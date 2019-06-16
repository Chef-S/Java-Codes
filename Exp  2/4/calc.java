import java.util.Scanner;
class calc{
public static void main(String args[]){
int a , b ,op, result=0;
Scanner sc= new Scanner(System.in);
System.out.println("enter operant 1");
a=sc.nextInt();
System.out.println("enter operant 2");
b=sc.nextInt();
System.out.println("choose operator 1. add 2. sub 3. multiply 4. divide");
op=sc.nextInt();
switch(op){
case 1:
       result=a+b;
       break;
case 2:
       result=a-b;
       break;
case 3:
       result=a*b;
       break;
case 4:
       result=a/b;
       break;

default:
System.out.println("error");
}
System.out.println(result);
}
}
