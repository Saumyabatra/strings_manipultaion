/*Write a program for searching strings for the first occurrence of a character or substring and for
the last occurrence of a character or substring. */
package string;
import java.util.Scanner;
class ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string:");
		Scanner sc=new Scanner(System.in);
		String n1=sc.nextLine();
		System.out.println("The length of the string is:"+n1.length());
		//String n2=sc.nextLine();
		System.out.println("Character at 2 is"+n1.charAt(2));
		System.out.println("The substring genereted using the string is:"+n1.substring(4));
		System.out.println("The given string contains:"+n1.contains("yu"));
		System.out.println("Adding the given string sequence we get :"+n1.join("-","Saumya","Batra"));
		String s1="Saumya";
		System.out.println(s1.equals(n1));//matches authentication
		System.out.println(s1==n1);//matches references
		System.out.println(s1.isEmpty());
		String n=n1.concat("Batra");
		System.out.println(n);
		n1=n1.replace("Saumya", "Shaurya");
		System.out.println(n1);
		System.out.println(n1.equalsIgnoreCase("SHAURYA"));
		s1.intern();
		System.out.println(s1==n1);//matches references
		System.out.println(n1.indexOf("aurya",3));
		String s3="This is an example to show the use of substring";
		System.out.println(s3.substring(10));
		System.out.println(s3.substring(10,16));
	}
	

}
