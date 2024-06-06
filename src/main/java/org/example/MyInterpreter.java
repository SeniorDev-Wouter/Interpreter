package org.example;

import org.example.gen.org.example.MyGrammarBaseListener;
import org.example.gen.org.example.MyGrammarParser;

public class MyInterpreter extends MyGrammarBaseListener {
    private ActionDecisionMaker decisionMaker;

    public MyInterpreter(Player player) {
        this.decisionMaker = new ActionDecisionMaker(player);
    }

    @Override
    public void exitSpelsituatie(MyGrammarParser.SpelsituatieContext ctx) {
        String attribute = ctx.attribuut().getText();
        String comparisonOperator = ctx.vergelijkingsOperator().getText();
        int value = Integer.parseInt(ctx.INT().getText());
        String action = ctx.actie().getText();

        decisionMaker.performAction(attribute, comparisonOperator, value, action);
    }
}


