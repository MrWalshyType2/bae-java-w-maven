package com.qa.visitor_pattern;

public interface EntityVisitor {
    void visitPlayer(Player player);
    void visitNonPlayerCharacter(NonPlayerCharacter npc);
}
