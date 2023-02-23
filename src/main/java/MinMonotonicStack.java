import java.util.EmptyStackException;

public class MinMonotonicStack {
    public int push(int element) {
        return element;
    }

    public int top() {
        throw new EmptyStackException();
    }

    public int pop() {
        throw new EmptyStackException();
    }
}
