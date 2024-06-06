package org.example;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.example.gen.org.example.MyGrammarLexer;
import org.example.gen.org.example.MyGrammarParser;

public class Agent {

   public void doAction(){
        Player player = new Player("John");
        player.setAttribute("gezondheid", 60);

        String input = """
                wanneer mijn gezondheid groter dan 50 dan beweeg ik naar de kist.
                 wanneer mijn gezondheid groter dan 50 dan val ik de grote boze pinda aan.
                 wanneer mijn gezondheid groter dan 50 dan val ik de grote boze pinda aan.
                 wanneer mijn gezondheid groter dan 50 dan val ik de grote boze pinda aan.
                 wanneer mijn gezondheid groter dan 50 dan val ik de grote boze pinda aan.
                 wanneer mijn gezondheid groter dan 50 dan beweeg ik naar de kist.
                 wanneer mijn gezondheid groter dan 50 dan val ik de grote boze pinda aan.
                 wanneer mijn gezondheid groter dan 50 dan val ik de grote boze pinda aan.
                 wanneer mijn gezondheid groter dan 50 dan val ik de grote boze pinda aan.
                 wanneer mijn gezondheid groter dan 50 dan val ik de grote boze pinda aan.
                 wanneer mijn gezondheid groter dan 50 dan beweeg ik naar de kist.
                 wanneer mijn gezondheid groter dan 50 dan val ik de grote boze pinda aan.
                 wanneer mijn gezondheid groter dan 50 dan val ik de grote boze pinda aan.
                 wanneer mijn gezondheid groter dan 50 dan val ik de grote boze pinda aan.
                 wanneer mijn gezondheid groter dan 50 dan val ik de grote boze pinda aan.
                 wanneer mijn gezondheid groter dan 50 dan beweeg ik naar de kist.
                 wanneer mijn gezondheid groter dan 50 dan val ik de grote boze pinda aan.
                 wanneer mijn gezondheid groter dan 50 dan val ik de grote boze pinda aan.
                 wanneer mijn gezondheid groter dan 50 dan val ik de grote boze pinda aan.
                 wanneer mijn gezondheid groter dan 50 dan val ik de grote boze pinda aan.
                 wanneer mijn gezondheid groter dan 50 dan beweeg ik naar de kist.
                 wanneer mijn gezondheid groter dan 50 dan val ik de grote boze pinda aan.
                 wanneer mijn gezondheid groter dan 50 dan val ik de grote boze pinda aan.
                 wanneer mijn gezondheid groter dan 50 dan val ik de grote boze pinda aan.
                 wanneer mijn gezondheid groter dan 50 dan val ik de grote boze pinda aan.
                 wanneer mijn gezondheid groter dan 50 dan beweeg ik naar de kist.
                 wanneer mijn gezondheid groter dan 50 dan val ik de grote boze pinda aan.
                 wanneer mijn gezondheid groter dan 50 dan val ik de grote boze pinda aan.
                 wanneer mijn gezondheid groter dan 50 dan val ik de grote boze pinda aan.
                 wanneer mijn gezondheid groter dan 50 dan val ik de grote boze pinda aan.
                 wanneer mijn gezondheid groter dan 50 dan beweeg ik naar de kist.
                 wanneer mijn gezondheid groter dan 50 dan val ik de grote boze pinda aan.
                 wanneer mijn gezondheid groter dan 50 dan val ik de grote boze pinda aan.
                 wanneer mijn gezondheid groter dan 50 dan val ik de grote boze pinda aan.
                 wanneer mijn gezondheid groter dan 50 dan val ik de grote boze pinda aan.
                 wanneer mijn gezondheid groter dan 50 dan beweeg ik naar de kist.
                 wanneer mijn gezondheid groter dan 50 dan val ik de grote boze pinda aan.
                 wanneer mijn gezondheid groter dan 50 dan val ik de grote boze pinda aan.
                 wanneer mijn gezondheid groter dan 50 dan val ik de grote boze pinda aan.
                 wanneer mijn gezondheid groter dan 50 dan val ik de grote boze pinda aan.
                 wanneer mijn gezondheid groter dan 50 dan beweeg ik naar de kist.
                 wanneer mijn gezondheid groter dan 50 dan val ik de grote boze pinda aan.
                 wanneer mijn gezondheid groter dan 50 dan val ik de grote boze pinda aan.
                 wanneer mijn gezondheid groter dan 50 dan val ik de grote boze pinda aan.
                 wanneer mijn gezondheid groter dan 50 dan val ik de grote boze pinda aan.
                 wanneer mijn gezondheid groter dan 50 dan beweeg ik naar de kist.
                 wanneer mijn gezondheid groter dan 50 dan val ik de grote boze pinda aan.
                 wanneer mijn gezondheid groter dan 50 dan val ik de grote boze pinda aan.
                 wanneer mijn gezondheid groter dan 50 dan val ik de grote boze pinda aan.
                 wanneer mijn gezondheid groter dan 50 dan val ik de grote boze pinda aan.
                """;
        MyGrammarLexer lexer = new MyGrammarLexer(CharStreams.fromString(input));
        MyGrammarParser parser = new MyGrammarParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.agent();

        MyInterpreter interpreter = new MyInterpreter(player);
        long milis = System.currentTimeMillis();
        ParseTreeWalker.DEFAULT.walk(interpreter, tree);
        System.out.println(System.currentTimeMillis() - milis);

    }
}
