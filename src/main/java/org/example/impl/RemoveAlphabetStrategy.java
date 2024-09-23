package org.example.impl;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.example.service.AlphabetRepeatStrategy;

@Slf4j
public class RemoveAlphabetStrategy extends AlphabetRepeatStrategy {
    public  void logMethod(String current, StringBuilder sb, int start, int end) {
        //change current param to log
        String pre = current.substring(0, start);
        String post = current.substring(end);
        String newReplace = pre + post;
        log.info("-> {}",newReplace);
    }
}
