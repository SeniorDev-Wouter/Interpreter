package org.example;

import java.util.HashMap;
import java.util.Map;

public class Player {
    private String name;
    private Map<String, Integer> attributes = new HashMap<>();

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAttribute(String attributeName) {
        return attributes.getOrDefault(attributeName, 0);
    }

    public void setAttribute(String attributeName, int value) {
        attributes.put(attributeName, value);
    }

    public void move(String target) {
        System.out.println(name + " is moving towards " + target);
    }

    public void attack(String target) {
        System.out.println(name + " is attacking " + target);
    }
}
