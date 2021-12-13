import java.util.Random;
import java.util.ArrayList;

public class PuzzleJavaTester {
    public static void main(String[] args){
        PuzzleJava tester = new PuzzleJava();
        ArrayList<Integer> rolls = tester.getRolls();
        System.out.println(rolls);
        System.out.println(tester.getLetter());
        System.out.println(tester.generatePassword());
    }
    
}
