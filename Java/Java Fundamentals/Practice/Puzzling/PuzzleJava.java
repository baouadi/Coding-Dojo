import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class PuzzleJava {

public ArrayList<Integer> getTenRolls(){
    ArrayList<Integer> myArray = new ArrayList<Integer>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            myArray.add(rand.nextInt(20) + 1);
        }
        return myArray;
    }

    public String getRandomLetter() {
        Random rand = new Random();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String[] array = new String[26];

        for (int i = 0; i < 26; i++) {
            int randomIndex = rand.nextInt(26);
            array[i] = String.valueOf(alphabet.charAt(randomIndex));
        }
        return array[rand.nextInt(26)];
    }

    public String generatePassword(){
        String password = "";

        for (int i = 0; i < 8; i++) {
            password += getRandomLetter();
    }
    return password;
}

public String getNewPasswordSet(){
    Scanner sc= new Scanner(System.in);     
System.out.print("Enter the password length ");  
int pwdLength= sc.nextInt();
String password = ""; 
for (int i = 0; i < pwdLength; i++) {
    password += getRandomLetter();
}
return password;

}

}
