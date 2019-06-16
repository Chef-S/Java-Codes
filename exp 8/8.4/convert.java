import java.util.Scanner;
class convert{
public static void main(String args[]){

//int to Integer
int a=20;  
Integer i1 =Integer.valueOf(a); //converting int into Integer  
Integer j=a; //autoboxing, now compiler will write Integer.valueOf(a) internally.
System.out.println(j);

//Integer to int
Integer a1=new Integer(3);    
int i2=a1.intValue();//converting Integer to int  
int j1=a1;//unboxing, now compiler will write a.intValue() internally   
System.out.println(j);

//int to String
 int c = 134; 
 String str3 = String.valueOf(c); 
System.out.println(str3);

//String to int
String number = "10";
int result = Integer.parseInt(number);	
System.out.println(result);

//String to Integer using integer.parseint
 String s1 = "2015";
  int i3 = Integer.parseInt(s1);
System.out.println(i3); 

//String to Integer using valueOf()  
String s3 = "2015";
int i4= Integer.valueOf(s3);
System.out.println(i4);  

//Integer to string
int i5 = 2015;
String s = Integer.toString(i4);
System.out.println(s); 

}
}