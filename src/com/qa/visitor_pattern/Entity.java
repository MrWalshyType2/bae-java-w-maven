package com.qa.visitor_pattern;

public abstract class Entity implements EntityVisitor {
    private static long id_counter = 1;
    private long id;
    private String name;
    private int health;

    public Entity(String name) {
        this.name = name;
        this.id = id_counter++;
        this.health = 100;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public abstract void acceptVisitor(EntityVisitor visitor);
}
