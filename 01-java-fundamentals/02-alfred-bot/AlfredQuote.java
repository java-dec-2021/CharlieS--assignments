import java.util.Date;
public class AlfredQuote{

    public String basicGreeting() {
        return("Hello, lovely to see you. How are you?");
    }

    public String guestGreeting(String name, String dayPeriod) {
        return String.format("Good %s, %s. It's lovely to see you", dayPeriod, name);
    }

    public String dateAnnouncement() {
        return String.format("Hello Sir, it is currently %s", new Date());
    }

    public String respondBeforeAlexis(String conversation) {
        if(conversation.indexOf("Alexis")>-1){
            return("Right away, sir. She certainly isn't sophisticated enough for that.");
        }
        else if(conversation.indexOf("Alfred")>-1){
            return("At your service.  As you wish, naturally.");
        }
        else{
            return("Right.  And with that I shall retire.");
        }
    } 
}