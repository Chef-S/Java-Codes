import java.util.Scanner;
class dividezero{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
int a, b;
System.out.println("Enter two numbers");
a=sc.nextInt();
b=sc.nextInt();
try{int c= a/b;
System.out.println("Result is \t" + c);
}
catch(ArithmeticException e){
System.out.println("Error: Divided by Zero");
}
}
}



