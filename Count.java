package janani;
import java.util.Scanner;
public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0,n;
		System.out.println("enter the number");
		Scanner ja=new Scanner(System.in);
		n=ja.nextInt();
		while(n!=0){
			n=n/10;
			count ++;
		}
     System.out.println(count);
	}

}
