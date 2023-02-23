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

    @Test
    void testFirstPushAndTop(){
        int num = 5;
        stack.push(num);
        int topVal = stack.top();
        Assertions.assertEquals(num, topVal);
    }

    @Test
    void testFirstPushAndPop(){
        int num = 5;
        stack.push(num);
        int poppedVal = stack.pop();
        Assertions.assertEquals(num, poppedVal);
    }
}
