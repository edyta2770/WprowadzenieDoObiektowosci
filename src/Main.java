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
        int firstvariable = scanner.nextInt();
        System.out.println("Prosze podac druga liczbe");
        int secondvariable = scanner.nextInt();
        System.out.println("Twoj wynik to" + calc.add(firstvariable, secondvariable));
        System.out.println("Twoj wynik to" + calc.sub(firstvariable, secondvariable));
        System.out.println("Twoj wynik to" + calc.multi(firstvariable, secondvariable));


        System.out.println("podaj pierwsza liczbe");
        int x = scanner.nextInt();
        System.out.println("podaj jaka operacje chcesz wykonac wpisujac: + - * /*");
        String znak = scanner.next();
        System.out.println("podaj druga liczbe");
        int y = scanner.nextInt();
        switch (znak){
            case ("+"):
                System.out.println (calc.add(x, y));
                break;
            case ("-"):
                System.out.println (calc.sub(x, y));
                break;
            case ("*"):
                System.out.println (calc.multi(x, y));
                break;





        }


    }

}
