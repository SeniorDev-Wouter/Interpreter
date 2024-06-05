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

        // Check if the action should be performed based on the decision maker
        if (shouldPerformAction(attribute, comparisonOperator, value) && !action.isEmpty()) {
            // Perform action based on the action string
            if (action.startsWith("beweeg naar")) {
                String target = action.substring("beweeg naar".length()).trim();
                player.move(target);
            } else if (action.startsWith("val ik")) {
                String target = action.substring("val ik aan".length(), action.length() - 3).trim(); // Trim the "aan"
                player.attack(target);
            } else {
                System.out.println("Unknown action: " + action);
            }
            // Set the flag to true after performing the action
            actionPerformed = true;
        }
    }

    public boolean isActionPerformed() {
        return actionPerformed;
    }

    private boolean shouldPerformAction(String attribute, String comparisonOperator, int value) {
        int attributeValue = player.getAttribute(attribute);

        // Perform comparison dynamically based on the provided operator
        switch (comparisonOperator) {
            case "groter dan":
                return attributeValue > value;
            case "kleiner dan":
                return attributeValue < value;
            // Add more comparison operators if needed
            default:
                return false;
        }
    }
}
