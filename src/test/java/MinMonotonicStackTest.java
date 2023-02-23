import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

public class MinMonotonicStackTest {
    private MinMonotonicStack stack;

    @BeforeEach
    void setupMinMonotonicStack() {
        stack = new MinMonotonicStack();
    }

    @Test
    void testEmptyTop(){
        Assertions.assertThrows(EmptyStackException.class, stack::top);
    }

    @Test
    void testEmptyPop(){
        Assertions.assertThrows(EmptyStackException.class, stack::pop);
    }

    @Test
    void testReturnValueOfPush(){
        int num = 5;
        int returnVal = stack.push(num);
        Assertions.assertEquals(num, returnVal);
    }
}
