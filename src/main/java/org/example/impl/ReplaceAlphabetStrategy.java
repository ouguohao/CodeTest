package org.example.impl;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.example.service.AlphabetRepeatStrategy;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Stream;


@Slf4j
public class ReplaceAlphabetStrategy extends AlphabetRepeatStrategy {


    @Override
    public void logMethod(String current, StringBuilder sb, int start, int end) {
        //change current param to log
        char changeChar = current.charAt(start);
        String replaced = current.substring(start, end);
        String pre = current.substring(0, start);
        String post = current.substring(end);
        String newReplace = pre + post;
        //skip 'a' and set replaced param
        if (!(changeChar == 'a')){
            //changeToPreChar
            char previousChar = findPreviousChar(changeChar);
            sb.append(previousChar);
            newReplace = pre + previousChar + post;
            log.info("-> {},{} is replaced by {}",newReplace,replaced,previousChar);
        }else {
            log.info("-> {}",newReplace);
        }
    }

    public static char findPreviousChar(char c) {
        if (Character.isLowerCase(c)) {
            return (char)(c - 1);
        } else {
            return c;
        }
    }

}
