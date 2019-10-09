// Jeg importer Scanner bibliotek, fordi jeg skal bruge det når en Palyer skal klikke på r for at rolle terninger
import java.util.Scanner;

public class CDIO_delprøve_1 {
    public static void main(String[] args) {
// Jeg laver et objekt af slags Scanner og jeg kalder det scan
        Scanner scan = new Scanner(System.in);
        Player player1 = new Player(1);

        for (int i = 0; i<=10; i++){
            System.out.println(player1.Player_text());
            System.out.println(player1.TOTAL_TEKST());
        if (player1.getTotal() >= 40){
            break;
        }
        }
    }
}
                /*
            System.out.println(player2.getPlayer());
            System.out.println(player2.getTotal());
            System.out.println();
            if (player2.die1() == 1 && player2.die2() ==1){
                System.out.println("Unfortunately, you got double 1");
                System.out.println("You lose, and Player 1 won");
                break;
            }
            else if (player2.TOTAL() >= 40){
                System.out.println("wow!!! Congratulations Player 2 \n\"YOU WON");
                break;
           */


/*
// Jeg laver 4 terninger
        Dice die1 = new Dice();
        Dice die2 = new Dice();
        Dice die3 = new Dice();
        Dice die4 = new Dice();
// Jeg laver 2 variabler af slags int for at lægge ternings værdier sammen
        int result1;
        int result2;
// Jeg laver endnu 2 variabler af slags int for at bruge dem til at lægge ternings værdier til ens score
        int total1 = 0;
        int total2 = 0;
// Jeg fortæller hvordan man kan spille
        System.out.println("You can start the game by clicking 1 or 2 and Enter");
        System.out.println("It deponds on if you want to be player 1 or player 2");
// Jeg laver en do løkke for at teste spillet
        do {
// Jeg laver en knap for at rolle ternnger
            char Play = scan.next().charAt(0);
// Knaben hedder 1. Dvs. Player 1 skal trykke på 1 og ENTER for at rolle terningerne
            if (Play == '1') {
// Jeg printer Player's 1's point samt med den nye score
// F.eks. Player 1: 2 , 6 = 8
                System.out.print("Player 1: ");
                System.out.print(die1.roll() + " , " + die2.roll() + " = ");
                result1 = (die1.getFacevalue() + die2.getFacevalue());
                System.out.println(result1);
                // Player 1: 3 , 4 = 15
                total1 = result1 + total1;
                System.out.println("Player 1 Total = " + total1);
// Jeg laver if sætning for at afslutte spillet når en af spillernes score når op til 40
                if (total1 >= 40) {
                    System.out.println("wow!!! Congratulations Player 1 \n\"YOU WON");
                    break;
                }
// Jeg afslutter spillet når en af Players slår double 1'er
                if ((die1.getFacevalue() == 1) && (die2.getFacevalue() == 1)) {
                    System.out.println("Unfortunately, you got double 1");
                    System.out.println("You lose, and Player 2 won");
                    break;
                }
                System.out.println("");
            }

// Knaben hedder 2. Dvs. Player 2 skal trykke på 2 og ENTER for at rolle terningerne
                if (Play == '2') {
// Jeg printer Player's 2's point samt med den nye score
// F.eks. Player 1: 2 , 6 = 8
                    System.out.print("Player 2: ");
                    System.out.print(die3.roll() + " , " + die4.roll() + " = ");
                    result2 = (die3.getFacevalue() + die4.getFacevalue());
                    System.out.println(result2);
                    // Player 1: 3 , 4 = 15
                    total2 = result2 + total2;
                    System.out.println("Player 2 Total = " + total2);
// Jeg laver if sætning for at afslutte spillet når en af spillernes score når op til 40
                    if (total2 >= 40) {
                        System.out.println("wow!!! Congratulations Player 2 \n\"YOU WON");
                        break;
                    }
// Jeg afslutter spillet når en af Players slår double 1'er
                    if ((die3.getFacevalue() == 1) && (die4.getFacevalue() == 1)) {
                        System.out.println("Unfortunately, you got double 1");
                        System.out.println("You lose, and Player 1 won");
                        break;
                    }
                }
        }while (true);

 */