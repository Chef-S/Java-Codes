interface A {
public void  meth1();
public void meth2();
}
class Myclass implements A {
public void meth1(){
System.out.println("this is method 1");
}

public void meth2(){
System.out.println("this is method 1");
}
public static void main(String args[]){
Myclass m1= new Myclass(); 
m1.meth1();
m1.meth2();
}
}
