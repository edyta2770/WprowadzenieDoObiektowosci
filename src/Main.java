import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Car audi = new Car("Red", 5, "A4", false);
        System.out.println(audi.getAutomaticGearbox());
        audi.setAutomaticgearbox(true);
        System.out.println(audi.getAutomaticGearbox());

        Car suzuki = new Car("Black", 3, "1500", false);
        System.out.println(suzuki.getColour());
        suzuki.setColour("white");
        System.out.println(suzuki.getColour());

        Calculator calc = new Calculator();
        calc.add(5, 2);
        System.out.println(calc.add(5,2));
        */

        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Prosze podac pierwsza liczbe");
        int firstvariable  = scanner.nextInt();
        System.out.println("Prosze podac druga liczbe");
        int secondvariable = scanner.nextInt();
        System.out.println("Twoj wynik to" + calc.add(firstvariable, secondvariable));
        System.out.println("Twoj wynik to" + calc.sub(firstvariable, secondvariable));
        System.out.println("Twoj wynik to" + calc.multi(firstvariable, secondvariable));




        }



    }

}
