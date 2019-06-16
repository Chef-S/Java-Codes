import java.util.Scanner;
class fib{
public static void main(String agrs[]){
Scanner sc = new Scanner(System.in);
int num ,i,n1=0,n2=1,n3;
System.out.println("enter a number uptil you want fibonacci series");
num=sc.nextInt();
System.out.print(n1+" "+n2);
for(i=2;i<num;++i)   
 {    
  n3=n1+n2;    
  System.out.print(" "+n3);    
  n1=n2;    
  n2=n3;    
 }    


}
}