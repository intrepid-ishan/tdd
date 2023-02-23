import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class MinMonotonicStack {
    private List<Integer> stack;

    public MinMonotonicStack() {
        stack = new ArrayList<>();
    }

    public int push(int element) {
        stack.add(element);

        return element;
    }

    public int top() {
        if(stack.isEmpty()){
            throw new EmptyStackException();
        }

        return stack.get(stack.size() - 1);
    }

    public int pop() {
        if(stack.isEmpty()){
            throw new EmptyStackException();
        }

        return stack.remove(stack.size() - 1);
    }
}
