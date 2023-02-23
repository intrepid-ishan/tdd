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
    void emptyTop(){
        Assertions.assertThrows(EmptyStackException.class, stack::top);
    }
}
