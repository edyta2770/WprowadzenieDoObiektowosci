public class Car {
    private String colour;
    private int doorsAmount;
    private String brand;
    private boolean automaticgearbox;

    public Car (String colour, int doorsAmount, String brand, boolean automaticGearbox) {
        this.colour = colour;
        this.doorsAmount = doorsAmount;
        this.brand = brand;
        this.automaticgearbox = automaticGearbox;
    }
public void setAutomaticgearbox (boolean automaticgearbox){
        this.automaticgearbox = automaticgearbox;
}
public boolean getAutomaticGearbox() {
    return automaticgearbox;
}
public void setColour (String colour) {
        this.colour = colour;
}
public String getColour (){
        return colour;

}

}
