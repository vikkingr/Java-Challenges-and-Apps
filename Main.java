import java.util.*;

/**
 * 
 * @author n01441484
 * Created by: Robert Veinberg-Vikking
 */

public class Main {

	public static void main(String[] args)
	{
		
		ChatBot bot1 = new ChatBot();
		
		Scanner input = new Scanner(System.in);
		
		String userInput = new String();
		
		while(!userInput.equals("exit"))
		{
			
			System.out.print("Enter input: ");
			userInput = input.nextLine();
			
			bot1.Interact(userInput);
			
		}

	}

}
