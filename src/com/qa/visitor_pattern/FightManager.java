package com.qa.visitor_pattern;

import java.util.Random;
import java.util.Scanner;

public class FightManager {

    final static Scanner SC = new Scanner(System.in);
    final static Random RANDOM = new Random();
    public static void fight(Player player, NonPlayerCharacter npc) {
        while (true) {
            System.out.println("(A) Attack");
            System.out.println("(R) Run away");
            String input = SC.nextLine();

            switch (input) {
                case "A":
                    // player attack npc
                    int damage = RANDOM.nextInt(0, 20) * player.getDamageMultiplier();npc.setHealth(npc.getHealth() - damage);
                    System.out.println("You did " + damage + " damage to the NPC");

                    // npc attack player
                    damage = RANDOM.nextInt(0, 20);
                    player.setHealth(npc.getHealth() - damage);
                    System.out.println("NPC did " + damage + " damage to you");
                    break;
                case "R":
                    System.out.println("You ran away from " + npc.getName());
                    return; // exit the method
                default:
                    System.out.println("Invalid input, please try again");
                    break;
            }
            if (npc.getHealth() <= 0) {
                System.out.println("You won the fight, well done!");
                break;
            } else if (player.getHealth() <= 0) {
                System.out.println("Game over, you lost!");
                System.exit(0);
            }
        }
    }
}
