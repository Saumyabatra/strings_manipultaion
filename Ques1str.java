/*Write a program for searching strings for the first occurrence of a character or substring and for
the last occurrence of a character or substring. */
package string;
import java.util.Scanner;
class Ques1str {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String s1=sc.nextLine();
		System.out.println("Enter a character to be searched:");
		String ch=sc.next();
		System.out.println("The first occurence of "+ch+"in the string "+s1+"is"+s1.indexOf(ch));
		System.out.println("the last occurence is"+s1.lastIndexOf(ch));
	}

}
