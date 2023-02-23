import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class MinMonotonicStack {
    private List<Integer> stack;

    public MinMonotonicStack() {
        stack = new ArrayList<>();
    }

    public int push(int element) {
        int size = stack.size();

        if(size == 0 || element <= stack.get(size - 1)){
            stack.add(element);
        } else{
            stack.add(size, element);

            for(int i = size; i > 0; i--){
                int currElement = stack.get(i);
                int prevElement = stack.get(i-1);

                if(currElement > prevElement){
                    int temp = prevElement;
                    stack.set(i-1,currElement);
                    stack.set(i,temp);
                } else{
                    break;
                }
            }
        }

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
