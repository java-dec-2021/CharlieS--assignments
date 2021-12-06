public class AlfredTest {
    public static void main(String[] args) {
        AlfredQuote alfredBot = new AlfredQuote();

        String testGreeting = alfredBot.basicGreeting();
        String testGuestGreeting = alfredBot.guestGreeting("Charlie Schiller", "morning");
        String testDateAnnouncement = alfredBot.dateAnnouncement();
        String alexisTest = alfredBot.respondBeforeAlexis("Alexis! Play me some bluegrass tunes");
        String alfredTest = alfredBot.respondBeforeAlexis("I can't find my yo-yo. Maybe Alfred will know where it is.");
    }
}
