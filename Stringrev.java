import java.util.Scanner;


public class Stringrev {
	public static void main(String[] args){
	String name;
	Scanner s=new Scanner(System.in);
	name=s.nextLine();
	String reverse=new StringBuffer(name).reverse().toString();
	System.out.println(reverse);
}


}
