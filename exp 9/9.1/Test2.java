class Apple{
void m1(){
System.out.println("Hello World");
}
}
 class Test2 extends Apple implements Runnable{
public void run(){
System.out.println("Run method executed by child Thread"); 
}

public static void main(String args[]){
Test2 t1= new Test2();
t1.m1();
Thread thd1=new Thread();
thd1.start();
System.out.println("Main method executed by main thread"); 
}
}