package com.qa.visitor_pattern;

public class NonPlayerCharacter extends Entity {

    private boolean isHostile;
    public NonPlayerCharacter(String name, boolean isHostile) {
        super(name);
        this.isHostile = isHostile;
    }

    @Override
    public void acceptVisitor(EntityVisitor visitor) {
        visitor.visitNonPlayerCharacter(this);
    }

    @Override
    public void visitPlayer(Player player) {
        if (isHostile) FightManager.fight(player, this);
    }

    @Override
    public void visitNonPlayerCharacter(NonPlayerCharacter npc) {

    }

    public boolean isHostile() {
        return isHostile;
    }
}
