import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class TestPuzzleJava {
    
	private static final char[] RandomLetter = null;

    public static void main(String[] args) {

    PuzzleJava generator = new PuzzleJava();
    ArrayList<Integer> randomRolls = generator.getTenRolls(); 
    System.out.println(randomRolls);	
    System.out.println(generator.getRandomLetter());
    System.out.println(generator.generatePassword());
    System.out.println(generator.getNewPasswordSet());
	}
}
