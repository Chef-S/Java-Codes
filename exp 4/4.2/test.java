  class player{
 public void pp(){
int p=10;
System.out.println(p);
}
}
class hockey_player extends player{

void show1(){
System.out.println("1");
}
}
class cricket_player extends player{

void show2(){
System.out.println("2");
}
}
class football_player extends player{
void show3(){
System.out.println("3");
}

}
class test{
public static void main(String args[]){
 football_player obj1 = new  football_player();
obj1.pp();
obj1.show3();
hockey_player obj2= new hockey_player();
obj2.pp();
obj2.show1();
cricket_player obj3= new cricket_player();
obj3.pp();
obj3.show2();

}
}