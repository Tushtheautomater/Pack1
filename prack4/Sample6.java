package prack4;

public class Sample6 {
	

	    // Non-static method to print a string
	    public void printString(String str) {
	        System.out.println(str);
	    }

	    public static void main(String[] args) {
	        // Creating an instance of StringPrinter class
	        Sample6 printer = new Sample6();

	        // Calling the non-static method using the instance
	        printer.printString("Hello, world!");
	    }
	}



