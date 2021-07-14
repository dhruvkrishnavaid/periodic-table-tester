import java.util.Scanner;
import java.util.Random;

class element {
// create a linear search algorithm
  public static int linearSearch(String[] arr, String key){  
    for(int i=0;i<arr.length;i++){  
        if(arr[i] == key){  
            return i;  
        }  
    }  
    return -1;  
}  
  public static void main(String[] args) {
    // create an object of Scanner class
    Scanner input = new Scanner(System.in);
    // create an array of elements
    String[] elements = {"hydrogen", "helium", "lithium", "berylium", "boron", "carbon", "nitrogen", "oxygen", "flourine", "neon", "sodium", "magnesium", "aluminium", "silicon", "phosphorus", "sulphur", "chlorine", "argon", "potassium", "calcium", "scandium", "titanium", "vandium", "chromium", "manganese", "iron", "cobalt", "nickel", "copper", "zinc"};
    // pick a random element
    Random random = new Random();
    int pickRandom = random.nextInt(elements.length);
    String randomElement = elements[pickRandom];
    // ask the question
    System.out.println("What is the atomic number of "+ randomElement + "?");
    System.out.print("Your answer: ");
    // ask for input
    int yourAnswer = input.nextInt();
    // check the answer
    int result = linearSearch(elements, randomElement);
    int recievedInput = yourAnswer - 1;
    int correctAnswer = result + 1;
    if (recievedInput == result) {
      System.out.println("Correct Answer!");
    } else {
      System.out.println("Sorry, but you need some more practice. The correct answer is " + correctAnswer + ".");
    }
    // close the object with Scanner class
    input.close();
  }
}