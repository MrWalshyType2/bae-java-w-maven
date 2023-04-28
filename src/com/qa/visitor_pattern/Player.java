package com.qa.visitor_pattern;

public class Player extends Entity {

    public Player(String name) {
        super(name);
    }

    @Override
    public void acceptVisitor(EntityVisitor visitor) {
        visitor.visitPlayer(this);
    }

    @Override
    public void visitPlayer(Player player) {
        System.out.println("You visited " + player.getName());
    }

    @Override
    public void visitNonPlayerCharacter(NonPlayerCharacter npc) {
        System.out.println("You visited the NPC " + npc.getName());
        if (npc.isHostile()) FightManager.fight(this, npc);
    }

    public int getDamageMultiplier() {
        return 2;
    }
}
