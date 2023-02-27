public class Main {
    public static void main(String[] args) {

        // variabele declaratie: [Type] [naam] = [waarde];
        int number = 6; // type:int         // naam:number  // waarde:6
        int numberOne = 4; // type:int         // naam:number1 // waarde:4
        int numberTwo = 20;  // type:int         // naam:number2 // waarde:20
        String name = "Kees";  // type:String      // naam:name    // waarde:"Kees"

        // methode aanroepen: [naam][parameters tussen ()-haakjes];
        hello();
        positiveOrNegative(number);
        positiveOrZeroOrNegative(number);
        bartender(name);
        sum(numberOne, numberTwo);
    }

    //1-------------------------------de hello-methode print de regel "Hello, world!";
    public static void hello(){
        System.out.println("Hello, world!");
    }

    //3----------------------------de positiveOrNegative-methode print aan de hand van een if else statement "This number is positive!" of "This number is negative!";
    // Een methode declaratie met een parameter: [Type] [naam]
    public static void positiveOrNegative (int number){
        // als parameter int number groter is dan 0
        if (number > 0){
            System.out.println("This number is positive!");
        }
        // overige gevallen
        else {
            System.out.println("This number is negative!");
        }
    }

    //3-----------------------------de positiveOrZeroOrNegative-methode print aan de hand van een if else if else statement "This number is positive!", "This number is zero!" of "This number is - negative!"
    public static void positiveOrZeroOrNegative(int number) {

        // als parameter int number groter is dan 0
        if (number > 0) {
            System.out.println("This number is positive!");
        }
        // als parameter int number 0 is
        else if (number == 0) {
            System.out.println("This number is zero!");
        }
        // als parameter int number kleiner dan 0 is
        else {
            System.out.println("This number is negative!");
        }
    }

        //4---------------------------De bartender-methode print aan de hand van een switch statement, het drankje dat deze persoon graag drinkt;
        // We maken een switch die een beslissing maakt aan de hand van de waarde van de name parameter
        public static void bartender(String name){
            // reguliere switch statement:
            // als de waarde "Jan" is
            switch (name){
                case "Jan":
                    System.out.println("Jan drinkt graag water");
                    break;
                // als de waarde "Piet" is
                case "Piet":
                    System.out.println("Piet drinkt graag appelsap");
                    break;
                // als de waarde "Klaas" is
                case "Klaas":
                    System.out.println("Klaas drinkt graag druivensap");
                    break;
/*            // enhanced switch-statement:
            switch (name) {
               case "Jan" -> System.out.println("Jan drinkt graag water");
               case "Piet" -> System.out.println("Piet drinkt graag appelsap");
               case "Klaas" -> System.out.println("Klaas drinkt graag druivensap");*/
                }
        }

        //5-----------------------------de sum-methode print de uitkomst van de twee nummers die bij elkaar zijn opgeteld.
        //een methode met 2 parameters, parameters worden gescheiden door een komma.
        public static void sum(int numberOne, int numberTwo){
            // Let op hoe hier de String aan elkaar geknoopt is. Dat is concatenatie. Tip: let bij concatenatie altijd goed op de spaties
            System.out.println(numberOne + " + " + numberTwo + " = " + (numberOne+numberTwo));
        }
}