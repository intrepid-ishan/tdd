import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

public class MinMonotonicStackTest {
    private MinMonotonicStack stack;

    @BeforeEach
    public void setupMinMonotonicStack() {
        stack = new MinMonotonicStack();
    }

    @Test
    public void testEmptyTop(){
        Assertions.assertThrows(EmptyStackException.class, stack::top);
    }

    @Test
    public void testEmptyPop(){
        Assertions.assertThrows(EmptyStackException.class, stack::pop);
    }

    @Test
    public void testReturnValueOfPush(){
        int num = 5;
        int returnVal = stack.push(num);
        Assertions.assertEquals(num, returnVal);
    }

    @Test
    public void testFirstPushAndTop(){
        int num = 5;
        stack.push(num);
        int topVal = stack.top();
        Assertions.assertEquals(num, topVal);
    }

    @Test
    public void testFirstPushAndPop(){
        int num = 5;
        stack.push(num);
        int poppedVal = stack.pop();
        Assertions.assertEquals(num, poppedVal);
    }

    @Test
    public void testDoubleDescendingPushAndPop(){
        int num1 = 2, num2 = 1;
        stack.push(num1);
        stack.push(num2);
        stack.pop(); // First pop
        int poppedVal = stack.pop(); // Second pop
        Assertions.assertEquals(num1, poppedVal);
    }

    @Test
    public void testMultiplePushRandomOrderAndPop(){
        stack.push(3);
        stack.push(2);
        stack.push(4);
        stack.push(1);
        stack.pop();
        stack.pop();
        stack.pop();
        int lastPoppedVal = stack.pop();
        Assertions.assertEquals(4, lastPoppedVal);
    }
}
