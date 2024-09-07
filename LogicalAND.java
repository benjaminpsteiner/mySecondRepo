package comm.neotech.lesson06;

public class LogicalAND {

	public static void main(String[] args) {
		// declare an integer
		// if the number is between 1 and 10 -> small number
		// if the number is between 11 and 100 -> medium number
		// if the number is between 101 and 1000 -> big number
		// if the number is greater than 1000 -> out of range

		int number = 2000;

		// if the number is between 1 and 10 -> small number
		if (number >= 1 && number <= 10) {
			System.out.println(number + " is a small number!");
		} else if (number >= 11 && number <= 100) {
			System.out.println(number + " is a medium number!");
		} else if (number >= 101 & number <= 1000) {
			System.out.println(number + " is big number!");
		} else {
			System.out.println(number + " is out of range!");
		}

		// String in a condition block

		String name = "John";
		int age = 26;
		boolean male = true;

		if (name == "John" && age == 26 && male) {
			System.out.println("I found you!");
		} else {
			System.out.println("Wrong person!");
		}

	}

}
