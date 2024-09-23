package org.example;

import org.example.impl.RemoveAlphabetStrategy;
import org.example.impl.ReplaceAlphabetStrategy;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        //remove repeat characters
        String inputA = "aabcccbbad";
        RemoveAlphabetStrategy removeAlphabetStrategy = new RemoveAlphabetStrategy();
        Context removeAlphabetStrategyContext = new Context(removeAlphabetStrategy);
        removeAlphabetStrategyContext.executeStrategy(inputA,3);

        //replace repeat characters
        String inputB = "abcccbad";
        ReplaceAlphabetStrategy replaceAlphabetStrategy = new ReplaceAlphabetStrategy();
        Context context = new Context(replaceAlphabetStrategy);
        context.executeStrategy(inputB,3);
    }
}
