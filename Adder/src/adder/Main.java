/**
 * @(#)Main.java
 *
 *
 * @author 
 * @version 1.00 2017/1/29
 */

public class Main
	{
    public static void main(String[] args)
    	{
   
        try
        {
            int result = addArguments(args);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Please provide three integers to add");
        }
    }

    private static int addArguments(String[] realArgs) {
    	
    	if(args[0].charAt(0)=='-')
    		{
 			return ((Integer.valueOf(args[1])+Integer.valueOf(args[2])) *(-1));
    		}
    	else
        	return Integer.valueOf(args[0]) + Integer.valueOf(args[1]) + Integer.valueOf(args[2]);
    }
}

