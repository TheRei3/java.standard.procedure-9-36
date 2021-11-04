package ex9no36;

import java.io.File;
import java.util.*;

public class ex9no36 {  //  512p
	public static void main(String[] args) {
		Scanner sc = new Scanner(new File("data2.txt"));
		int sum = 0;
		int cnt = 0;
		
		while(sc.hasNextInt()) {
			sum += sc.nextInt();
			cnt++;
		}
		
		System.out.println("sum = " + sum);
		System.out.println("average = " + (double) sum/cnt);
	}

}
