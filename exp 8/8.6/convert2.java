import java.util.Scanner;
class convert2{
public static void main(String args[]){
//converts float to Float 
   float f1=20;

    //1st way
    Float F1= new Float(f1);
    System.out.println(F1);

 
   //2rd way
    Float F3=Float.valueOf(f1);
    System.out.println(F3);
  
//converts Float to String
      
    //1st way
    Float F4= new Float(30);
    String str1=F4.toString();
    System.out.println(str1);
   
     //2nd way
    String str2= String.valueOf(F4);
     System.out.println(str2);
     
     //3rd way
    String str3=" "+F4;
    System.out.println(str2);
 

//converts String to float 
  String s2="20.3";
float f2= Float.parseFloat(s2);
System.out.println(f2);

//convert float to String
float f3= 12.3f;
String s3=String.valueOf(f3);
System.out.println(f3);

//convert String to Float


   String s="20.4";
     
     //1st way
     Float F5 = new Float(s);
      System.out.println(F5);
     
     //2nd way
     Float F8=Float.valueOf(s);
      System.out.println(F8);
     
      //3rd way
      Float F9=Float.parseFloat(s);
     System.out.println(F9);

//convert Float to float
Float F7= new Float(20.7f);
float f4= F7.floatValue();
System.out.println(f4);
}
}