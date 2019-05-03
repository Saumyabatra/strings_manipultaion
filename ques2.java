package string;
import java.util.Scanner;
class ques2 {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string to capitalize:");
		StringBuffer s1=new StringBuffer(sc.nextLine());
		for(int i=0;i<s1.length();i++){
			int j=s1.charAt(i);
			if(j>64 && j<91){
				j=j+32;
				System.out.println((char)j);
			}
			else if(j>96 && j<123){
				j=j-32;
				System.out.println((char)j);
			}
			else if(j==32){
				System.out.println(" ");
			}
				
			}
		}
	}
