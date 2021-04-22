import java.util.Scanner;

public class Package1 {
		
	final static double tax = .13f;
	
	public static void main(String[] args) {
		
		shipment();
		
	}
	public static void shipment() {
		
		System.out.println("welcome to Cam's shipping calculator!");
		
		double cost1 = package1Input();
		System.out.println("Price to ship package 1 $" +cost1);
		
		double cost2 = package2Input();
		System.out.println("Price to ship package2 $"+cost2);
		
		if (cost1 > cost2) {
			double value1 = cost1 - cost2;
			value1 = value1 * 100;
			value1 = Math.round(value1);
			value1 = value1 / 100;
			System.out.println("package 1 costs more than package 2 by: $"+value1);
		}
		else if (cost1 < cost2) {
			double value = cost2 - cost1;
			value = value * 100;
			value = Math.round(value);
			value = value / 100;
			System.out.println("package 2 costs more than package 1 by: $"+value);
		}
		else {
			System.out.println("same");	
		}
				
	}
	
	private static double package1Input() {
		
		System.out.println("Enter your specs for package 1");
		
		Package1 p1 = new Package1();
		
		Scanner scans = new Scanner(System.in);
		System.out.print("length: ");
		int length = scans.nextInt();
		
		System.out.print("width: ");
		int width = scans.nextInt();
		
		System.out.print("height: ");
		int height = scans.nextInt();
		
		int volume = length * width * height;
		double cost = volume * .1f + (volume *tax);
		
		cost = cost * 100;
		cost = Math.round(cost);
		cost = cost / 100;
		
		return cost;
	}
	
	private static double package2Input() {
		
		System.out.println("Enter your specs for package 2");
		
		Package1 p2 = new Package1();
		
		Scanner scans = new Scanner(System.in);
		System.out.print("length: ");
		int length = scans.nextInt();
		
		System.out.print("width: ");
		int width = scans.nextInt();
		
		System.out.print("height: ");
		int height = scans.nextInt();
		
		int volume = length * width * height;
		double cost = volume * .1f + (volume *tax);
		
		cost = cost * 100;
		cost = Math.round(cost);
		cost = cost / 100;
		
		return cost;
	}
}
