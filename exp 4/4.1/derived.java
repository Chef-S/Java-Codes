class parent{
 private int a =10;
 private void A(){
    System.out.println("*");
}
int asc(){
     return a;
}

}

class derived extends parent{
public static void main(String args[]){ 
int c;
parent obj= new parent();
c=obj.asc();
System.out.println(c);

}
}
