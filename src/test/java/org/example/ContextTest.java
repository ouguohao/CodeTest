package org.example;

import org.example.impl.RemoveAlphabetStrategy;
import org.example.impl.ReplaceAlphabetStrategy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.in;

@ExtendWith(MockitoExtension.class)
public class ContextTest {

    @Test
    @DisplayName("removeAlphabet")
    void testRemoveAlphabet() throws Exception{
        //param
        RemoveAlphabetStrategy removeAlphabetStrategy = new RemoveAlphabetStrategy();
        Context context = new Context(removeAlphabetStrategy);
        String input = "aabcccbbad";
        //test
        String executeResult = context.executeStrategy(input,3);
        //assert
        assertThat(executeResult).isEqualTo("d");
    }

    @Test
    @DisplayName("removeAlphabet empty param")
    void testRemoveAlphabetEmptyParam() throws Exception{
        //param
        RemoveAlphabetStrategy removeAlphabetStrategy = new RemoveAlphabetStrategy();
        Context context = new Context(removeAlphabetStrategy);
        String input = "";
        //test
        String executeResult = context.executeStrategy(input,3);
        //assert
        assertThat(executeResult).isEqualTo("");
    }

    @Test
    @DisplayName("removeAlphabet not alphabet param")
    void testRemoveAlphabetNotAlphabetParam() throws Exception{
        //param
        RemoveAlphabetStrategy removeAlphabetStrategy = new RemoveAlphabetStrategy();
        Context context = new Context(removeAlphabetStrategy);
        String input = "abbbc5__jjj";
        //test
        String executeResult = context.executeStrategy(input,3);
        //assert
        assertThat(executeResult).isEqualTo("abbbc5__jjj");
    }

    @Test
    @DisplayName("replaceAlphabet")
    void testReplaceAlphabet(){
        //param
        ReplaceAlphabetStrategy strategy = new ReplaceAlphabetStrategy();
        Context context = new Context(strategy);
        String input = "abcccbad";
        //test
        String executeStrategy = context.executeStrategy(input,3);
        //assert
        assertThat(executeStrategy).isEqualTo("d");
    }

    @Test
    @DisplayName("replaceAlphabet empty param")
    void testReplaceAlphabetEmptyParam() throws Exception{
        //param
        ReplaceAlphabetStrategy replaceAlphabetStrategy = new ReplaceAlphabetStrategy();
        Context context = new Context(replaceAlphabetStrategy);
        String input = "";
        //test
        String executeResult = context.executeStrategy(input,3);
        //assert
        assertThat(executeResult).isEqualTo("");
    }

    @Test
    @DisplayName("replaceAlphabet not alphabet param")
    void testReplaceAlphabetNotAlphabetParam() throws Exception{
        //param
        ReplaceAlphabetStrategy replaceAlphabetStrategy = new ReplaceAlphabetStrategy();
        Context context = new Context(replaceAlphabetStrategy);
        String input = "abbbc5__jjj";
        //test
        String executeResult = context.executeStrategy(input,3);
        //assert
        assertThat(executeResult).isEqualTo("abbbc5__jjj");
    }


}
