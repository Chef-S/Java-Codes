interface test{
public void square(int a);
}

class Arith implements test{
public void square(int a){
int b=a*a;
System.out.println("square is"+b);
}
}
class ToTestInt{
public static void main(String args[]){

 Arith a1=new Arith();
a1.square(2);
}
} 