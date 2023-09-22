import java.util.Random;

public class VirtualPetStretch {
    private int hunger;
    private int thirst;
    private int boredom;
    private String favoriteFood;
    private String dislikedFood;

    public VirtualPetStretch() {
        this.hunger = 50;
        this.thirst = 50;
        this.boredom = 50;
        this.favoriteFood = "Biscuits";
        this.dislikedFood = "Broccoli";
    }

    // Getters and setters (optional)
    // ...

    // Methods
    public void feed(String food) {
        if (food.equalsIgnoreCase(favoriteFood)) {
            System.out.println("Yum! " + favoriteFood + " is my favorite!");
            hunger -= 20;
            thirst += 5;
        } else if (food.equalsIgnoreCase(dislikedFood)) {
            System.out.println("I don't like " + dislikedFood + "!");
            boredom -= 10;
        } else {
            System.out.println("Thanks for the " + food + ".");
            hunger -= 10;
            thirst += 5;
            boredom += 5;
        }
    }

    public void water() {
        System.out.println("Thanks for the water.");
        thirst -= 20;
        boredom += 5;
    }

    public void play() {
        System.out.println("Yay! Let's play!");
        boredom -= 30;
        hunger += 10;
        thirst += 10;
    }

    public void tick() {
        Random random = new Random();

        // Pet can take care of some of its needs randomly
        int action = random.nextInt(3); // 0: Feed, 1: Water, 2: Play

        switch (action) {
            case 0:
                feed(favoriteFood); // Pet feeds itself with its favorite food
                break;
            case 1:
                water(); // Pet drinks water
                break;
            case 2:
                play(); // Pet plays
                break;
        }

        // Pet's needs increase randomly
        int randomIncrease = random.nextInt(6) + 5; // Random number between 5 and 10
        hunger += randomIncrease;
        thirst += randomIncrease;
        boredom += randomIncrease;
    }

    // Visual representation of the pet's status
    public void showStatus() {
        String hungerStatus = hunger >= 50 ? ">=<" : ":)";
        String thirstStatus = thirst >= 50 ? ">=<" : ":)";
        String boredomStatus = boredom >= 50 ? ">=<" : ":)";

        System.out.println("Virtual Pet");
        System.out.println("Hunger: " + hungerStatus);
        System.out.println("Thirst: " + thirstStatus);
        System.out.println("Boredom: " + boredomStatus);
    }
}