import java.util.*;
import java.util.Map;
import java.util.HashMap;

class Main {
  public static void main(String[] args) {
    Map<Integer, Character> alphabet = new HashMap<Integer, Character>(); //creating map alphabet that will be contain all available for encryption and decryption characters

    for (int i = 32; i < 127; i++){ //fill the map alphabet with numbers and symbols from ASCII (from 32 to 127 symbol)
      char letterInAlphabet = (char)i;
      alphabet.put(i, letterInAlphabet);
    }

    String text = "Mike"; //creating variable that contains text for encryption than put there some text
    int step = 14; //creating variable that contains step used in encryption and decryption and put there number

    System.out.println("Non encrypted: " + text); //print non encrypted text
    System.out.println("Encrypted: " + EncryptByCaesarCipher(text, alphabet, step)); //print encrypted text 
    text = EncryptByCaesarCipher(text, alphabet, step); //put encrypted text in variable text
    System.out.println("Decrypted: " + DecryptOfCaesarCipher(text, alphabet, step)); //print decrypted text  
  }    

  public static Optional<Integer> GetPositionOfLetter(Map<Integer, Character> alphabet, Character letter) { //method that gets key by value from map  
    Optional<Integer> positionOfLetter = alphabet.entrySet() //creating new optional variable that will contain position of letter 
    .stream() //start stream 
    .filter(e -> letter.equals(e.getValue())) //using filter to find position of letter by letter
    .map(Map.Entry::getKey) //using .map to get position
    .findFirst(); //.findFirst method is used to get the first and only the first position кelated to letter position for which we want to find

  return positionOfLetter;         
  }

  public static Character GetLetter(Map<Integer, Character> alphabet, int positionOfLetter){ //method that gets value by key from map
    Character letter = alphabet.get(positionOfLetter); //creatind variable and put there letter which we get from map
  return letter; 
  } 

  public static String EncryptByCaesarCipher(String text, Map<Integer, Character> alphabet, int step){ //method that encrypt string using caesar cipher
    char[] array = text.toCharArray(); //break down string by symbols and put them in array of chars
    for (int i = 0; i < array.length; i++){ //take each character and encrypt 
      int newPositionOfLetter = GetPositionOfLetter(alphabet, array[i]).get() + step; //find the symbol number and plus step value
      if (newPositionOfLetter > 127){ //if new character number more then last character number make % and plus number of first character in ASCII
        newPositionOfLetter = 32 + (newPositionOfLetter % 127); 
      }
      char newLetter = GetLetter(alphabet, newPositionOfLetter); //find encrypt letter using GetLetter method
      array[i] = newLetter; //put encrypt letter in array of chars on position of letter which we just worked with 
    }
    String encryptedString = new String(array); //parse array of encrypted characters in string 
  return encryptedString;  //return encrypted string
  }

  public static String DecryptOfCaesarCipher(String text, Map<Integer, Character> alphabet, int step){ //method that decrypt string which was encrypted by caesar cipher
    char[] array = text.toCharArray(); //break down string by symbols and put them in array of chars
    for (int i = 0; i < array.length; i++){ //take each character and decrypt
      int PositionOfLetter = GetPositionOfLetter(alphabet, array[i]).get() - step; //find the symbol number and minus step value
      if (PositionOfLetter < 32 && PositionOfLetter > 0){ //if symbol number less than first symbol number but more than 0 make last symbol number minus defernce of first symbol number and number of sought-for letter 
        PositionOfLetter = 127 - (32 - PositionOfLetter);   
      }
      else if (PositionOfLetter < 0){ //if symbol number less than 0 make last symbol number minus sum of first symbol number and module of sought-for letter % last symbol number
        PositionOfLetter = 127 - (32 + (Math.abs(PositionOfLetter) % 127));  
      }
      char Letter = GetLetter(alphabet, PositionOfLetter); //find decrypt letter using GetLetter method
      array[i] = Letter; //put decrypt letter in array of chars on position of encrypt letter which we just worked with
    }
    String decryptedString = new String(array); //parse array of decrypt characters in string 
  return decryptedString; //return decrypted string
  }

}
