import java.util.Random; //generating random int values
import java.util.Scanner;

public class Main{
  
  public static void main (String args[]){
    
    LinkedList list = new LinkedList(); //creation of list
    
    int userNumber; //added this so that the user can chose how many numbers to have in the list
    Scanner input = new Scanner(System.in);
    System.out.println("Choose how many random numbers you wish to have in the list: ");
    userNumber = input.nextInt();
    
    int userRange;
    Scanner input1 = new Scanner(System.in);
    System.out.println("Choose what the maximum of the range should be for the random numbers: \n1 through ___ ");
    //this was implemented so that the user can choose what the numbers should go through, in order to get
    //1 through whichever number they wish. (I suggest 1 through 40 or higher, for more range)
    userRange = input1.nextInt();
    
    
    for (int i = 0; i < userNumber; i++){ //creates a list from 1 to the userNumber
      Random rand = new Random();
      int n = rand.nextInt(userRange) + 1; //creates a range from 1 to the userRange
      list.add(n); //adds the number to the list
    }
    
    System.out.println("The list before Bubble Sort: "); 
    list.print();
    
    list.bubbleSort(); //the sorting happens here
    
    System.out.println("The list after Bubble Sort: ");
    list.print();
  }
}
