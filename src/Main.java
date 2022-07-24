public class Main {
    public static void main(String[] args) {
        Car audi = new Car( "Red", 5, "A4",  false);
        System.out.println(audi.getAutomaticGearbox());
        audi.setAutomaticgearbox(true);
        System.out.println(audi.getAutomaticGearbox());

        Car suzuki = new Car ("Black", 3, "1500", false);
        System.out.println(suzuki.getColour());
        suzuki.setColour("white");
        System.out.println(suzuki.getColour());






    }

}
