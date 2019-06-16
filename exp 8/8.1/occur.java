import java.util.Scanner;
class occur{
public static void main(String agrs[]){                                         
Scanner sc=new Scanner(System.in);
String str;
System.out.println("Enter a  String");
str=sc.nextLine();
char ch;
System.out.println("Enter a Character to be searched");
ch=sc.next().charAt(0);
int firstIndex=str.indexOf(ch);     
System.out.println("First occurance at position:" + firstIndex);
int lastIndex=str.lastIndexOf(ch);                                                                                                                                       System.out.println("Last occurance at position:" + lastIndex);      }
}