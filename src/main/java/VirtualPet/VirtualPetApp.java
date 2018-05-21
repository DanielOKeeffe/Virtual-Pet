package VirtualPet;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		VirtualPet julius = new VirtualPet(25, 25, 25, false, false);

		System.out.println("Welcome to WCCI's Virtual Pet!");
		System.out.println("Today you will be playing with Julius the crocodile!");
		System.out.println("                        .--.  .--.");
		System.out.println("                       /    \\/    \\");
		System.out.println("                      | .-.  .-.   \\");
		System.out.println("                      |/_  |/_  |   \\");
		System.out.println("                      || `\\|| `\\|    `----.");
		System.out.println("                      |\\0_/ \\0_/    --,    \\");
		System.out.println("    .--\"\"\"\"\"-.       /              (` \\     `-.");
		System.out.println("   /          \\-----'-.              \\          \\");
		System.out.println("   \\  () ()                         /`\\          \\");
		System.out.println("   |                         .___.-'   |          \\");
		System.out.println("   \\                        /` \\|      /           ;");
		System.out.println("    `-.___             ___.' .-.`.---.|             \\");
		System.out.println("       \\| ``-..___,.-'`\\| / /   /     |              `\\");
		System.out.println("        `      \\|      ,`/ /   /   ,  /");
		System.out.println("                `      |\\ /   /    |\\/");
		System.out.println("                 ,   .'`-;   '     \\/");
		System.out.println("            ,    |\\-'  .'   ,   .-'`");
		System.out.println("          .-|\\--;`` .-'     |\\.'");
		System.out.println("         ( `\"'-.|\\ (___,.--'`'");
		System.out.println("          `-.    `\"`          _.--'");
		System.out.println("             `.          _.-'`-.");
		System.out.println("               `''---''``       `.");
		System.out.println();
		System.out.println("Julius loves eating, drinking, and playing.");
		System.out.println();

		String choice;
		int food;
		int volume;
		int time;
		do {
			julius.tick();
			if (julius.getSickness() == true) {
				System.out.println("Julius is sick and needs medicine!");
				System.out.println();
				System.out.println("Choose what you want to do with Julius");
				System.out.println();
				System.out.println("Press 1 to feed Julius.");
				System.out.println("Press 2 to give Julius water.");
				System.out.println("Press 3 to play with Julius.");
				System.out.println("Press 4 to give Julius medicine.");
				System.out.println("Press 5 tuck Julius into bed.");
				choice = input.nextLine();
			} else {
				System.out.println("Currently Julius has the following emotions:");
				System.out.println("Hungry: " + julius.getHunger());
				System.out.println("Thirsty: " + julius.getThirst());
				System.out.println("Bored: " + julius.getBoredom());
				System.out.println();
				System.out.println("Choose what you want to do with Julius");
				System.out.println();
				System.out.println("Press 1 to feed Julius.");
				System.out.println("Press 2 to give Julius water.");
				System.out.println("Press 3 to play with Julius.");
				System.out.println("Press 4 to give Julius medicine.");
				System.out.println("Press 5 tuck Julius into bed.");
				choice = input.nextLine();
			}

			if (choice.equals("1")) {
				if (julius.getSickness() == true) {
					System.out.println("Julius is not feeling well and does not want to eat anything right now.");
					System.out.println();
				} else {
					System.out.println("How much do you want to feed Julius?");
					food = input.nextInt();
					input.nextLine();
					if (julius.getFreeWill() == false) {
						julius.feed(food);
						System.out.println("Julius loves the food you gave him!");
						System.out.println();
					} else {
						System.out.println("Julius ignores you and plays instead.");
						System.out.println();
						julius.play(25);
					}
				}

			} else if (choice.equals("2")) {
				if (julius.getSickness() == true) {
					System.out.println("Julius is not feeling well and does not want to drink anything right now.");
					System.out.println();
				} else {
					System.out.println("How much water do you want to give Julius?");
					volume = input.nextInt();
					input.nextLine();
					if (julius.getFreeWill() == false) {
						julius.water(volume);
						System.out.println("Julius is so happy you gave him water!");
						System.out.println();
					} else {
						System.out.println("Julius ignores you and goes to eat a snack.");
						System.out.println();
						julius.feed(25);
					}
				}

			} else if (choice.equals("3")) {
				if (julius.getSickness() == true) {
					System.out.println("Julius is not feeling well and does not want to play with you.");
					System.out.println();
				} else {
					System.out.println("How long do you want to play with Julius?");
					time = input.nextInt();
					input.nextLine();
					if (julius.getFreeWill() == false) {
						julius.play(time);
						System.out.println("Julius had a lot of fun playing with you!");
						System.out.println();
					} else {
						System.out.println("Julius ignores you and gets a drink of water.");
						julius.water(25);
					}
				}

			} else if (choice.equals("4")) {
				if (julius.getSickness() == false) {
					System.out.println("Julius is feeling great and does not need any medicine!");
					System.out.println();
				} else {
					julius.giveMedicine();
					System.out.println("Julius is feeling much better!");
					System.out.println();
				}

			} else if (choice.equals("5")) {
				System.out.println("Julius is feeling sleepy but looks foward to spending time with you soon!");
				System.exit(0);

			} else {
				System.out.println("Julius does not understand your input. Please try again.");
				System.out.println();
			}

		} while (!choice.equals("5"));

		input.close();

	}

}