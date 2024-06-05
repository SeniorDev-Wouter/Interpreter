package org.example;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.example.gen.org.example.MyGrammarLexer;
import org.example.gen.org.example.MyGrammarParser;

public class Main {
    public static void main(String[] args) {
        // Create a player
        Player player = new Player("John");
        player.setAttribute("gezondheid", 60);
        // Set other attributes as needed

        // Parse the input and interpret
        String input = "wanneer mijn gezondheid groter dan 50 dan val ik de kobold aan.";
        MyGrammarLexer lexer = new MyGrammarLexer(CharStreams.fromString(input));
        MyGrammarParser parser = new MyGrammarParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.agent();

        MyInterpreter interpreter = new MyInterpreter(player);
        ParseTreeWalker.DEFAULT.walk(interpreter, tree);
    }
}