package org.example.service;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;


@Slf4j

public abstract class AlphabetRepeatStrategy {

    public String execute(String str,Integer length){
        if (!checkParam(str)){
            return str;
        }
        return dealString(str,length);
    }

    Boolean checkParam(String str){
        //check empty param
        if (StringUtils.isBlank(str)){
            log.info("param is empty :{}",str);
            return false;
        }
        //check not alphabet param
        char[] chars = str.toCharArray();
        boolean anyMatch = str.chars()
                .mapToObj(c -> (char) c)
                .anyMatch(cr -> !Character.isLetter(cr));
        if (anyMatch){
            log.error("param has a char which is not a alphabet");
            return false;
        }
        return true;
    }



    String dealString(String input,Integer changeLength){
        String current = input;
        boolean hasChange;
        do {
            hasChange = false;
            StringBuilder sb = new StringBuilder();
            int start = 0;
            while (start<current.length()){
                int end = start;
                while (end<current.length()&&current.charAt(end) == current.charAt(start)){
                    end++;
                }
                if (end - start < changeLength){
                    sb.append(current,start,end);
                }else {
                    logMethod(current, sb, start, end);
                    hasChange = true;
                }
                start = end;
            }
            current = sb.toString();
        }while (hasChange);
        return current;
    }

    protected abstract void logMethod(String current, StringBuilder sb,
                                      int start, int end);

}
