import java.util.Scanner;
import V1.VehicleException;
class Vehicle{
public static void main(String args[]){
System.out.println("Enter two direction for two cars Press 1 for right and 2 for left:");
Scanner sc= new Scanner(System.in);
int a, b;
a=sc.nextInt();
b=sc.nextInt();
try
{
      
checkVehicleException (a, b);
    

 
System.out.println ("Vehicles can pass without collision");

} 

catch (VehicleException e)
{
     

System.out.println (e + "\n");

} 
}
public static void

 checkVehicleException (int a, int b)
  throws VehicleException
{
       

if (a == b)
	 
{
	   

throw new VehicleException ("Error: Same direction. They will collide  ");
}
}
}


