package t;

import java.util.Scanner;

public class tt {

	public static void main(String[] args) {
		 int tot = 0;
	        int i = 1;
	        while (i <= 10) {
	            Scanner x = new Scanner(System.in);
	            int y = x.nextInt();
	            System.out.println("Input number:");

	            tot+=y;
	        }
	        System.out.println("Total:" + tot);

	}

}
