import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TestClassVerb {

    Verb verb = new Verb();

    @Test
    public void test_add_ending_verb_s(){
        String expectedVerb = "goes";
        String actualVerb = verb.returnEndingVerbS("go");
        assertEquals(expectedVerb, actualVerb);
    }
}