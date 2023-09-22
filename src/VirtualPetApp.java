import java.util.Scanner;

public class VirtualPetApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        VirtualPet pet = new VirtualPet();
         input.close();

        // Game loop
        while (true) {
            System.out.println("Virtual Pet");
            System.out.println("Hunger: " + pet.getHunger());
            System.out.println("Thirst: " + pet.getThirst());
            System.out.println("Boredom: " + pet.getBoredom());
            System.out.println("What do you want to do?");
            System.out.println("1. Feed the pet");
            System.out.println("2. Water the pet");
            System.out.println("3. Play with the pet");
            System.out.println("4. Do nothing");

            int choice = input.nextInt();

            // Perform the action based on user input
            switch (choice) {
                case 1:
                    pet.feed();
                    break;
                case 2:
                    pet.water();
                    break;
                case 3:
                    pet.play();
                    break;
                case 4:
                    // Do nothing, just let time pass
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }

            // Update pet's attributes with time passage
            pet.tick();
        }
    }
}