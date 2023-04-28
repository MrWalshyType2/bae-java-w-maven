package com.qa.visitor_pattern;

public class App {
    public static void main(String[] args) {
        Entity player = new Player("Bob");
        Entity npc = new NonPlayerCharacter("Troll", true);

        npc.acceptVisitor(player);
    }
}
