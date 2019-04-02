import java.util.*;
public class MinMax {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		int temp;
		int max=0;
		int num2=num;
		int min=9;
		while(num!=0) {
			
			temp=num%10;
			if(max<temp) {
				max=temp;
			}
			num=num/10;
			
		}
		
		
		while(num2!=0) {
			temp=num2%10;
			if(min>temp) {
				min=temp;
		
			
			}
			num2=num2/10;
		}

	System.out.println(max);
	System.out.println(min);
	}

}
