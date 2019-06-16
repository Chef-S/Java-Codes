import java.util.*;
class result{
public static void main(String args[]){
System.out.println("enter 10 student marks" );
Scanner s=new Scanner(System.in);
int arr[];
arr=new int[10];
int i;
for(i=0;i<10;i++)
{
arr[i]=s.nextInt();

}
System.out.println("grades are:-" );

for(i=0;i<10;i++){
   if(arr[i]>40&&arr[i]<50){
   System.out.println(arr[i] + "\t"+"PASS" );
   }

   else if(arr[i]>51&&arr[i]<75){
   System.out.println(arr[i] + "\t"+"MERIT" );
    }
   else if(arr[i]>75){
   System.out.println(arr[i] + "\t"+"DISTINCTION" );
    }

else{
   System.out.println(arr[i] + "\t"+"FAIL" );

    }

   }
}
}