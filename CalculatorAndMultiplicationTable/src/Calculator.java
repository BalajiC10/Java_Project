import java.util.Scanner;

public class Calculator {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Numbers");
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();
	
	System.out.println("Enter the operation to be performed"+" ( +,-,/,* )");
	String op = sc.next();
	
	int res;
	switch(op) {
	case "+": res=num1+num2;
				System.out.println("Addition is "+ res);
				break;
	case "-": res=num1-num2;
	System.out.println("Substraction is "+ res);
	break;
	case "/": res=num1/num2;
	System.out.println("Divider is "+ res);
	break;
	case "*": res=num1*num2;
	System.out.println("Product is "+res);
	break;
		
	default:System.out.println("Invalid input");
	}
}
}
