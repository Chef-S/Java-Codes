import java.util.Scanner;
class A{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
String str= new String();
str= "Shefali";
 int len=str.length();
int count=0;
System.out.println("lenght of your name is" + len);
for(int i=0; i<str.length();i++){
if(str.charAt(i)=='a'||str.charAt(i)=='A'){
count++;
System.out.println(" a or A found at " + i +"th position");
}
}
System.out.println(" a found at " + count +"times");
}
}