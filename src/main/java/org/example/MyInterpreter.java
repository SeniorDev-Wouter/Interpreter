package org.example;

import org.example.gen.org.example.MyGrammarBaseListener;
import org.example.gen.org.example.MyGrammarParser;

import java.util.HashMap;
import java.util.Map;

public class MyInterpreter extends MyGrammarBaseListener {
    private Player player;
    private ActionDecisionMaker decisionMaker;

    public MyInterpreter(Player player) {
        this.player = player;
        this.decisionMaker = new ActionDecisionMaker(player);
    }

    @Override
    public void exitSpelsituatie(MyGrammarParser.SpelsituatieContext ctx) {
        String attribute = ctx.attribuut().getText();
        String comparisonOperator = ctx.vergelijkingsOperator().getText();
        int value = Integer.parseInt(ctx.INT().getText());
        String action = ctx.actie().getText();

        // Call performAction method of the decision maker
        decisionMaker.performAction(attribute, comparisonOperator, value, action);
    }
}
