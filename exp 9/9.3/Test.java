class runnable implements Runnable{
int a=0;
public synchronized  int counter(){
a=+1;
return a;
}
public void run(){
int b=counter();
System.out.println(b);
}
}
class Test{
public static void main(String args[]){
runnable r1=new runnable();
Thread t1=new Thread(r1); 
t1.start();
Thread t2=new Thread(r1); 
t2.start();
Thread t3=new Thread(r1); 
t3.start();
Thread t4=new Thread(r1); 
t4.start();
}
}

