import java.util.Scanner;

public class Ruin {

public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("How much money are you starting with?");
    int startAmount = scan.nextInt();
    
    System.out.println("What is the probability you win in a single play?");
    double winChance = scan.nextDouble();

    System.out.println("What is you win limit?");
    int winLimit = scan.nextInt();

    double gameProbability = Math.random();

   System.out.println ("what is the total simulations?");
   int totalSimulations = scan.nextInt ();
   
   
   for (int i = 0; i < totalSimulations; i++){


    while (startAmount > 0 && startAmount < winLimit ) {
        
    if (winChance < Math.random() ) {
        startAmount--; 
        System.out.println("You lose!");
    }

    else {
        startAmount++;
        System.out.println("You win!");
    }
}
}
}
}







    


