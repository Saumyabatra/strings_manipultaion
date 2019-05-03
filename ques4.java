package string;
import java.util.Scanner;
class ques4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1=new String("Saumya Batra");
		//int a=str1.length();
		char f='a';
		int count=0;
		for(int i=0;i<str1.length();i++){
			//char ch=str1.charAt(i);
			if(str1.charAt(i)==f){
				count++;
				System.out.println("position of a"+(i+1));
			}
		}
		System.out.println("The number of occurences of a are:"+count);
	}

}
