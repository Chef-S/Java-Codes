interface hello{
public void division();
public  void modules();
}
class overide implements hello{
public void division(){
System.out.println("this will print: result of overiding");
}
public void modules(){
System.out.println("this will print: result of overiding too");
}
}
class tester{
public static void  main(String args[]){
overide o1= new overide(); 
o1.division();
o1. modules();
}
} 