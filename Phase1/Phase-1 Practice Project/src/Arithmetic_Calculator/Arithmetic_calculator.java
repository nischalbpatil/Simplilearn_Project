package Arithmetic_Calculator;
import java.util.Scanner;

public class Arithmetic_calculator {
	static int N1,N2,result;
	static int o;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		
		System.out.println("Enter the Numbers");
		
		N1=s1.nextInt();
		N2=s1.nextInt();
		
		System.out.println("Enter the Operations (+,-,*,/)");
		
		char op = s1.next().charAt(0);
		
		switch (op) {
		case '+':
			o=N1+N2;
			break;
		case '-':
			o=N1-N2;
			break;
		case '*':
			o=N1*N2;
			break;
		case '/':
			o=N1/N2;
			break;
			

		default:
			System.out.println("Enter correct input");
			break;
		}
		System.out.println("The Operation of two numbers is:");
		System.out.println(N1+" "+op+" "+N2+" = " + o);
		
	}

}
