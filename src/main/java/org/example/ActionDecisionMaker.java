package org.example;

public class ActionDecisionMaker {
    private Player player;

    public ActionDecisionMaker(Player player) {
        this.player = player;
    }

    public void performAction(String attribute, String comparisonOperator, int value, String action) {
        // Check if the action should be performed based on the decision maker
        if (shouldPerformAction(attribute, comparisonOperator, value)) {
            // Perform action
            switch (action) {
                case "beweeg":
                    player.move("towards something");
                    break;
                case "val":
                    player.attack("some target");
                    break;
                // Add more cases for other actions
                default:
                    System.out.println("Unknown action: " + action);
            }
        }
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
