interface area
{
static final float pi=3.142f;
float compute(float x,float y);
}

class rectangle implements area
{
public float compute(float x,float y)
{return(x*y);}
}

class circle implements area
{
public float compute(float x,float y)
{return(pi*x*x);}
}

class driver 
{
public static void main(String args[])
{
rectangle r1=new rectangle();
circle c1=new circle();
System.out.println("Area of the rectangle= "+r1.compute(20,30));
System.out.println("Area of the circle= "+c1.compute(30,0));
}
}