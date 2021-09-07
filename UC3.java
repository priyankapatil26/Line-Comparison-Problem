package linecompare;

import java.util.Scanner;

public class UC3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double length1,length2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x1,x2,y1,y2");
		int x1=sc.nextInt();
		int x2=sc.nextInt();
		int y1=sc.nextInt();
		int y2=sc.nextInt();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter p1,p2,q1,q2");
		int p1=sc1.nextInt();
		int p2=sc1.nextInt();
		int q1=sc1.nextInt();
		int q2=sc1.nextInt();
		
		length1 = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		length2 = Math.sqrt((p2-p1)*(p2-p1) + (q2-q1)*(q2-q1));
		
		int result = length1.compareTo(length2);
		if(result>0) {
			System.out.println("line1 is greater");
		}
		else if(result<0) {
			System.out.print("line2 is greater");
		}
		else {
			System.out.print("Both Lines are equal");
		}
	}
}
