package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Please provide only three integers");
	}	
	catch(IllegalArgumentException e){

	    System.err.println("Please provide only numbers or the negative sign ");
        }
    }

    private static int addArguments(String[] args) {
        return Integer.valueOf(args[0]) + Integer.valueOf(args[1]) + Integer.valueOf(args[2]);
    }
}
