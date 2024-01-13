package beenary.dev;

import java.util.Scanner;

public class EnchantedDoor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the secret word to unlock the door");
        String magicWord = scanner.nextLine();

        boolean isUnlocked = unlock(magicWord);

        if(isUnlocked){
            System.out.println("The doors are unlocked. You may enter now.");
        }else{
            System.out.println("The doors remains locked.");
        }
    }

    private static boolean unlock(final String magicWord) {
        if(magicWord.equals("mellon")){
            return true;
        }
        else{
            return false;
        }
    }
}
