package org.example;

import org.example.service.AlphabetRepeatStrategy;

public class Context {

    private AlphabetRepeatStrategy strategy;

    public Context(AlphabetRepeatStrategy strategy){
        this.strategy = strategy;
    }

    public String executeStrategy(String str,Integer length){
        return strategy.execute(str,length);
    }


}
