import java.util.Scanner;


public class Index {
public static void main(String []args){
	 Scanner s=new Scanner(System.in);
	 int n=s.nextInt();
	 int temp;
	 int a[]=new int[n];
	 for(int k=0;k<n;k++)
	 {
		 a[k]=s.nextInt();
	 }
System.out.println("Enter the element:");
int b=s.nextInt();
for(int i=0;i<n;i++)
{
	if(b==a[i]){
		System.out.println(i);
	}
}

}
}
