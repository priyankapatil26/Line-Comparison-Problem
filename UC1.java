package linecompare;

import java.util.Scanner;

public class UC1 {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter x1,x2,y1,y2");
				int x1=sc.nextInt();
				int x2=sc.nextInt();
				int y1=sc.nextInt();
				int y2=sc.nextInt();
				double length;
				length = Math.sqrt( ( ( x2 - x1 ) * ( x2 - x1 ) ) + ( ( y2 - y1 ) * ( y2 - y1 ) ) );
				System.out.println("Length of line is =" +length);

		}}




