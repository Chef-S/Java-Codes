import java.util.Scanner;
class upper{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string");
StringBuffer stringbuffer=new StringBuffer();
stringbuffer.append(sc.nextLine());
System.out.println("You entered string:" + " " +stringbuffer);    
String upp=new String();
for (int i = 0; i< stringbuffer.length(); i++){

                char aChar = stringbuffer.charAt(i);
             if (97 <= aChar && aChar<=122){
             aChar = (char)( (aChar -32) ); 
         upp=upp+aChar;              
  }

}
System.out.println("In upper case:" +" " +upp); 
}
}
