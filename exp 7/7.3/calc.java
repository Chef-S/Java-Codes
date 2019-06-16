class calc
{
public static void main(String ar[])
{
int a,b,c=0;
try{
a=Integer.parseInt(ar[0]);
b=Integer.parseInt(ar[1]);
System.out.println(a);
System.out.println(b);
}
catch(NumberFormatException e)
{System.out.println(e);
}
}
}