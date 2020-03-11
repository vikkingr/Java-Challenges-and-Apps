/**
 * 
 * @author n01441484
 * Created by: Robert Veinberg-Vikking
 */

public class ChatBot
{
	
	Memory memory = new Memory();
	
	//Instance variables
	
  
    
    //constructor
    ChatBot()
    {
    	
    	System.out.println("New chatbot created.");
    	
    	memory.setName("Smithy");
    	memory.setFavoriteHobby("Chatting");
    	memory.setFavoriteDOTW("Sunday");
    	memory.setQuirk("Botting");
    	
    }
    
    public void Interact(String userInput)
    {
    	
    	String parser = new String();
    	
    	parser = userInput.toLowerCase();
    	
    	
    	// Check index for keywords
    	
    	int indexOfHello = parser.indexOf("hello");
    	int indexOfName = parser.indexOf("name");
    	int indexOfFavoriteThings = parser.indexOf("favorite");
    	int indexOfQuirk = parser.indexOf("quirk");
    	
    	if(indexOfHello > 0)
    	{
    		
    		replyHello();
    		
    		return;
    		
    	}
    	else if(indexOfName > 0)
    	{
    		
    		replyName();
    		
    		return;
    		
    	}
    	else if(indexOfFavoriteThings > 0)
    	{
    		
    		replyFavoriteThings();
    		
    		return;
    		
    	}
    	else if(indexOfQuirk > 0)
    	{
    		
    		replyQuirk();
    		
    		return;
    		
    	}
//    	if(indexOfHello >= 0 && indexOfHello < indexOfName && indexOfHello < indexOfFavoriteThings && indexOfHello < indexOfQuirk)
//    	{
//    		
//    		replyHello();
//    		
//    		return;
//    		
//    	}
//    	
//    	if(indexOfName >= 0 && indexOfName < indexOfHello && indexOfName < indexOfFavoriteThings && indexOfName < indexOfQuirk)
//    	{
//    		
//    		replyName();
//    		
//    		return;
//    		
//    	}
//    	
//    	if(indexOfFavoriteThings >= 0 && indexOfFavoriteThings < indexOfHello && indexOfFavoriteThings < indexOfName && indexOfFavoriteThings < indexOfQuirk)
//    	{
//    		
//    		replyFavoriteThings();
//    		
//    		return;
//    		
//    	}
//    	
//    	if(indexOfQuirk >= 0 && indexOfQuirk < indexOfHello && indexOfQuirk < indexOfName && indexOfQuirk < indexOfFavoriteThings)
//    	{
//    		
//    		replyQuirk();
//    		
//    		return;
//    		
//    	}
    	
//    	replyHello();
//    	replyName();
//    	replyQuirk();
//    	replyFavoriteThings();
//    	replyAskAboutUser();
        
    }//end function
    
    private void replyHello()
    {
    	
    	System.out.println("Greetings my friend!");
    	
    }
    
    private void replyName()
    {
    	
    	System.out.println("My name is: " + memory.getName() + ".");
    	
    }
    
    private void replyFavoriteThings()
    {
    	
    	System.out.println("My favorite hobby is: " + memory.getFavoriteHobby() + ".");
    	System.out.println("My favorite day of the week is: " + memory.getFavoriteDOTW() + ".");
    	
    }
    
    private void replyQuirk()
    {
    	
    	System.out.println("My quirk is: " + memory.getQuirk() + ".");
    	
    }
    
    private void replyWeight()
    {
    	
    	
    	
    }
    
    private void replyAskAboutUser()
    {
    	
    	System.out.println("What about you? Can you tell me about yourself?");
    	
    }
    
    
    
    
}//end class