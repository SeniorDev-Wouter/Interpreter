package org.example;

public class ActionDecisionMaker {
    private Player player;
    private boolean actionPerformed;

    public ActionDecisionMaker(Player player) {
        this.player = player;
        this.actionPerformed = false;
    }

    public void performAction(String attribute, String comparisonOperator, int value, String action) {

        if (actionPerformed) {
            return;
        }

        if (shouldPerformAction(attribute, comparisonOperator, value) && !action.isEmpty()) {
            if (action.startsWith("beweeg")) {
                String target = action.substring("beweeg naar".length()).trim();
                player.move(target);
            } else if (action.startsWith("val ik")) {
                String target = action.substring("val ik aan".length(), action.length() - 3).trim(); // Trim the "aan"
                player.attack(target);
            } else {
                System.out.println("Unknown action: " + action);
            }
            actionPerformed = true;
        }
    }

    private boolean shouldPerformAction(String attribute, String comparisonOperator, int value) {
        int attributeValue = player.getAttribute(attribute);

        switch (comparisonOperator) {
            case "groter dan":
                return attributeValue > value;
            case "kleiner dan":
                return attributeValue < value;
            default:
                return false;
        }
    }
}
