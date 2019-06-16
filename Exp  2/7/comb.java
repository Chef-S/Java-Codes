import java.util.Scanner;
class comb{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
int a[];
a= new int[3];
int b,c,d;
System.out.println("enter a 3 digit number");

a[0]=sc.nextInt();
a[1]=sc.nextInt();

a[3]=sc.nextInt();


for (int i=0;i<3;i++){

for(int j=0;j<3;j++){

for (int k=0;k<3;k++){

if (i!=j&&i!=k&&j!=k)

System.out.println(a[i]+a[j]+a[k]);

}

}

}
}
}