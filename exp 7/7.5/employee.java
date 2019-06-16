import java.util.Scanner;
class AgeException extends Exception{
AgeException(String s){
super(s);}
}
class nameException extends Exception{
}
class employee{
public static void main(String args[]) {
Scanner sc= new Scanner(System.in);
String emp[] = new String[10];
int age[]= new int[10];
try{
for(int i=0; i<10;i++){
System.out.println("Enter employee name");
emp[i]=sc.nextLine();
if(!(emp[i].matches("[a-zA-Z]+")))
{throw new nameException();}
System.out.println("Enter employee age");
age[i]=Integer.parseInt(sc.nextLine());
checkAgeException(age[i]);
}
}
catch(nameException e1){
System.out.println ("no int for name");
 
}
catch(AgeException e){
 
System.out.println (e + "\n");
}
}
public static void checkAgeException(int age) throws AgeException {
if(age>50){ throw new AgeException("The age is above 50");
}
}
}




