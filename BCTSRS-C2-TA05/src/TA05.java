/**
 * @author Roger Rubio Rufaste
 *
 */

import javax.swing.JOptionPane;

public class TA05 {

	/**
	 * This main method executes the menu of the program
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		menu();
	}
	
	/**
	 * This method asks the user what exercice wants to execute
	 */
	public static int menu() {
		
		String exerciceNumber = JOptionPane.showInputDialog("Write the number of the exercice you want to execute. "
				+ "If you want to end the program write 0 .");
		
		switch (exerciceNumber) {
			case "0":
				System.out.println("End of the program.");
				break;
			case "1":
				ex1();
				break;
			case "2":
				ex2();
				break;
			case "3":
				ex3();
				break;
			case "4":
				ex4();
				break;
			case "5":
				ex5();
				break;
			case "6":
				ex6();
				break;
			case "7":
				ex7();
				break;
			case "8":
				ex8();
				break;
			case "9":
				ex9();
				break;
			case "10":
				ex10();
				break;
			case "11":
				ex11();
				break;
			case "12":
				ex12();
				break;
			case "13":
				ex13();
				break;
			default:
				System.out.println("Incorrect value.");
				System.out.println("End of the program.");
			
		}
		
		return 0;
	}
	
	
	/**
	 * This method declares 2 variables and compares them changing the values
	 */
	public static void ex1() {
		//First we declare the 2 variables
		int x = 5;
		int y = 10;
		
		//We show the values
		System.out.println("Values of the variables are X = "+x+" and Y = "+y);
		
		//We do the first comparison
		System.out.println("The biggest of them is: "+Math.max(x, y));
		
		//We change the value of X variable
		x = 50;
		
		//We show the new value
		System.out.println("We change the value of X to "+x);
		
		//We do the second comparison
		System.out.println("The biggest of them is: "+Math.max(x, y));
		
		//We change the Y value
		y = 50;
		
		//We show the new value
		System.out.println("We change the value of Y to "+y);
		
		//We do the final comparison
		System.out.println("The biggest of them is: "+Math.max(x, y)+" because the values are equal.");
		
		//End of this method
		System.out.println("End of Exercice 1");
		
		menu();
	}
	
	/**
	 * This method shows a welcome with the name initialized
	 * 
	 */
	public static void ex2() {
		//Name
		String name = "Roger";
		
		//Shows the welcome
		System.out.println("Bienvenido "+name);
		
		//End of this method
		System.out.println("End of Exercice 2");
		
		menu();
	}
	
	/**
	 * This method asks your name and then shows you a welcome with your name
	 * 
	 */
	public static void ex3() {
		//Ask the name of the user
		String name = JOptionPane.showInputDialog("Write your name: ");
		
		//Shows the welcome
		System.out.println("Bienvenido "+name);
		
		//End of this method
		System.out.println("End of Exercice 3");
		
		menu();
	}
	
	/**
	 * This method asks a radius and then calculates the area of the circle
	 * 
	 */
	public static void ex4() {
		//Ask the radius
		String radius = JOptionPane.showInputDialog("Write the radius of the circle: ");
		
		//We cast to change from String to double
		double r = Double.parseDouble(radius);
		
		//Calculates the area
		double a = Math.PI * (Math.pow(r, 2));
		System.out.println("The area of the circle with the radius given is: "+a);
		
		//End of this method
		System.out.println("End of Exercice 4");
		
		menu();
	}
	
	/**
	 * This method asks a number and returns if it's divisible by 2 or not
	 * 
	 */
	public static void ex5() {
		//Ask the number
		String number = JOptionPane.showInputDialog("Write the number you want to check if its divisible by 2:");
		
		//We cast to change from String to double
		double n = Double.parseDouble(number);
		
		//Checks if the number is divisible by 2
		if(n%2==0) {
			System.out.println("The number can be divided by 2.");
		} else {
			System.out.println("The number can NOT be divided by 2.");
		}
		
		//End of this method
		System.out.println("End of Exercice 5");
		
		menu();
	}

	/**
	 * This method asks a price of a product and returns it with IVA
	 * 
	 */
	public static void ex6() {
		//First we add the constant IVA
		final double IVA = 21;
		
		//Ask the price
		String number = JOptionPane.showInputDialog("Write the price of the product you want to calculate with IVA:");
		
		//We cast to change from String to double
		double n = Double.parseDouble(number);
		
		//We calculate the price with the IVA
		double finalPrice = n*(IVA/100) + n;
		
		System.out.println("The price with IVA is: "+finalPrice);
		
		//End of this method
		System.out.println("End of Exercice 6");
		
		menu();
	}
	
	/**
	 * This method shows every number from 0 to 100 (both included) using "while"
	 * 
	 */
	public static void ex7() {
		//We iterate until we showed every number from 0 to 100 using "while"
		int i=0;
		while(i<101) {
			System.out.println(i);
			i++;
		}
		
		//End of this method
		System.out.println("End of Exercice 7");
		
		menu();
	}
	
	/**
	 * This method shows every number from 0 to 100 (both included) using "for"
	 * 
	 */
	public static void ex8() {
		//We iterate until we showed every number from 0 to 100 using "for"
		for(int i=0;i<101;i++) {
			System.out.println(i);
		}
		
		//End of this method
		System.out.println("End of Exercice 8");
		
		menu();
	}
	
	/**
	 * This method shows every number from 0 to 100 that are divisible by 2 and 3 using "for"
	 * 
	 */
	public static void ex9() {
		//We iterate until we showed every number divisible by 2 and 3 from 0 to 100
		for(int i=0;i<101;i++) {
			if(i%2==0 && i%3==0) {
				System.out.println(i);
			}
		}
		
		//End of this method
		System.out.println("End of Exercice 9");
		
		menu();
	}
	
	/**
	 * This method asks how many sells the user wants to introduce. 
	 * Then it asks to introduce the sells and returns the total price.
	 * 
	 */
	public static void ex10() {
		//We ask for the number of sells
		String number = JOptionPane.showInputDialog("Write the number of sells you want to introduce:");
		int n = Integer.parseInt(number);
		
		//We initialize a variable for total sells price
		double s = 0.0;
		
		for(int i=0;i<n;i++) {
			String sell = JOptionPane.showInputDialog("Write the price of the sell:");
			s = s + Double.parseDouble(sell);
		}
		
		//We show the final price of all sells added
		System.out.println("The total price is: "+s);
		
		//End of this method
		System.out.println("End of Exercice 10");
		
		menu();
	}
	
	/**
	 * This method asks a day of the week and returns if its weekday or not
	 * 
	 */
	public static void ex11() {
		//We ask for the name of the day
		String day = JOptionPane.showInputDialog("Write the name of the day you want to know if its weekday or not."
				+ "Do it without accents or caps and in Spanish language.");
		
		switch (day) {
			case "lunes":
				System.out.println(day+" is weekday.");
				break;
			case "martes":
				System.out.println(day+" is weekday.");
				break;
			case "miercoles":
				System.out.println(day+" is weekday.");
				break;
			case "jueves":
				System.out.println(day+" is weekday.");
				break;
			case "viernes":
				System.out.println(day+" is weekday.");
				break;
			case "sabado":
				System.out.println(day+" is NOT weekday.");
				break;
			case "domingo":
				System.out.println(day+" is NOT weekday.");
				break;
			default:
				System.out.println("Incorrect value.");
				System.out.println("End of the program.");
		}
		
		//End of this method
		System.out.println("End of Exercice 11");
		
		menu();
	}
	
	/**
	 * This method asks for a password that the user needs to introduce in 3 attempts.
	 * 
	 */
	public static void ex12() {
		//We declare and initialize the password, the max attempts, the i iterator controller and a found controller
		String pass = "1234";
		int n = 3;
		int i = 0;
		boolean found = false;
		
		//We iterate until the password is written or the attempts are spent
		while(i<n && found==false) {
			String attempt = JOptionPane.showInputDialog("Write the password:");
			if(attempt.equals(pass)) {
				System.out.println("¡Enhorabuena!");
				found=true;
			} else {
				System.out.println("Wrong password >:( ");
			}
			i++;
		}
		
		//End of this method
		System.out.println("End of Exercice 12");
		
		menu();
	}
	
	/**
	 * This method asks for two numbers and an operator and returns the result
	 * 
	 */
	public static void ex13() {
		//We start asking the first number
		String number1 = JOptionPane.showInputDialog("Welcome to CalculadoraInversa! "
				+ "Write two numbers and an operator and you will have the result! Please, type the first number:");
		
		//Then we ask the second number
		String number2 = JOptionPane.showInputDialog("Write the second number:");
		
		//Then we ask for the operator
		String op = JOptionPane.showInputDialog("Write the operator:");
		
		//We parse the Strings received to Double
		double n1 = Double.parseDouble(number1);
		double n2 = Double.parseDouble(number2);
		
		//We do a switch-case for all the operators
		switch (op) {
		case "+":
			System.out.println("The result for "+n1+op+n2+" is "+(n1+n2));
			break;
		case "-":
			System.out.println("The result for "+n1+op+n2+" is "+(n1-n2));
			break;
		case "*":
			System.out.println("The result for "+n1+op+n2+" is "+(n1*n2));
			break;
		case "/":
			System.out.println("The result for "+n1+op+n2+" is "+(n1/n2));
			break;
		case "^":
			System.out.println("The result for "+n1+op+n2+" is "+(Math.pow(n1, n2)));
			break;
		case "%":
			System.out.println("The result for "+n1+op+n2+" is "+(n1%n2));
			break;
		default:
			System.out.println("Incorrect value.");
			System.out.println("End of the program.");
		}
		
		//End of this method
		System.out.println("End of Exercice 13");
		
		menu();
	}
	
}
