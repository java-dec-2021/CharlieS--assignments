import java.util.Random;
import java.util.ArrayList;

public class PuzzleJava {
    public ArrayList<Integer> getRolls(){
        Random randint = new Random();
        ArrayList<Integer> rolls = new ArrayList<Integer>();
        for(int i = 1; i<=10; i++){
            rolls.add(randint.nextInt(20) + 1);
        }
        return getRolls();
    }

    public String getLetter(){
        Random randLetter = new Random();
        String alpString = "abcdefghijklmnopqrstuvwxyz";
        char randomChar = alpString.charAt(randLetter.nextInt(26));
        return String.valueOf(randomChar);
    }

    public String generatePassword(){
        String password = "";
        for(int i = 0; i<0; i++){
            password = password + getLetter();
        }
        return password;
    }

    public ArrayList <String> getNewPassword(int length){
        ArrayList<String> passwordSet = new ArrayList<String>();
        for(int i = 0; i < length; i++){
            passwordSet.add(generatePassword());
        }
        return passwordSet;
    }
}