package tenMarks;
import java.util.Scanner;
public class UpperCaseLowerCase {

	
	public static void main(String [] args) {
		
		int cap=0;
		int small=0;
		
		
		Scanner sc=new Scanner(System.in);
		String st=new String();
		st=sc.nextLine();
		//int len=;
		char arr[]=new char[st.length()];
		arr=st.toCharArray();
		
		for(int i=0;i<st.length();i++) {
			
			if(arr[i]>=65 && arr[i]<=90) {
				cap++;
				
			}
			
			else if(arr[i]>=97 && arr[i]<=122){
				small++;
			}
		}
		
	System.out.println(cap);	
	System.out.println(small);
	}
	
	
}
