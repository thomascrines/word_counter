package com.example.user.wordcounter;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by user on 08/11/2016.
 */

public class WordCounterTest {

    String string;

        @Test
        public void testWordCounter() {
            assertEquals(4, "My name is Tom.".trim().split(" ").length);
        }

}
