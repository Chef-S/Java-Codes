import java.util.Scanner;
class test{
public static void main(String args[]){
int i;
String arr[]= new String[10];
int roll[]= new int[10];
Scanner sc= new Scanner(System.in);
try{
for(i=0;i<11;i++){
System.out.println("Enter name of student\t" + (i+1) );
arr[i]=sc.nextLine();
System.out.println("Enter rollno of student\t" + (i+1));
roll[i]=Integer.parseInt(sc.nextLine());
}}
catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("Array is out of Bounds"+e);}

for(i=0;i<11;i++){
System.out.println("name of student \t" + (i+1) + "\t is"  );
System.out.println(arr[i]);
System.out.println("name of roll \t" + (i+1) + "\t is"  );
System.out.println(roll[i]);
}
}
}