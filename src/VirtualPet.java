public class VirtualPet {
    // Instance variables
    private int hunger;
    private int thirst;
    private int boredom;

    // Constructor
    public VirtualPet() {
        this.hunger = 50;
        this.thirst = 50;
        this.boredom = 50;
    }

    // Getter methods (Optional, but useful for displaying pet's status)
    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getBoredom() {
        return boredom;
    }

    // Methods
    public void feed() {
        hunger -= 10;
        thirst += 5;
        boredom += 5;
    }

    public void water() {
        thirst -= 10;
        boredom += 5;
    }

    public void play() {
        boredom -= 15;
        hunger += 5;
        thirst += 5;
    }

    // The tick() method represents the passage of time, updating pet's attributes
    public void tick() {
        hunger += 5;
        thirst += 5;
        boredom += 5;
    }

    public void showStatus() {
    }


    
}