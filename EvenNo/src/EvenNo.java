import java.util.Scanner;

public class EvenNo {

	public static void main(String[] args) {
	
		int n = 10;
		int count=1;
		for(int i=1;;i++) {
			if(i%2==0 && count<=n) {
				System.out.println(i);
				count++;
			}
		}
		
		
	}

}
