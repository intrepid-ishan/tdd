import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class PostOrderTraversal {
    public static List<Integer> traverseRecursively(Node node) {
        List<Integer> result = new ArrayList<>();
        traverseRecursivelyHelper(node, result);
        return result;
    }

    private static void traverseRecursivelyHelper(Node node, List<Integer> result) {
        if(node == null) {
            return;
        }
        traverseRecursivelyHelper(node.left, result);
        traverseRecursivelyHelper(node.right, result);
        result.add(node.val);
    }

    public static List<Integer> traverseIteratively(Node root) {
        List<Integer> result = new ArrayList<>();

        // Using Deque class instead of Stack as suggested by the official Java 17 documentation
        Deque<Node> stack = new ArrayDeque<>();

        Node current = root;

        // Keep going to the left as much as possible
        while(current != null) {
            stack.push(current);
            current = current.left;
        }

        // Now we have iterated the complete subtree. Keep popping the elements from the stack and visit each.
        while(!stack.isEmpty()) {
            result.add(stack.pop().val);
        }

        return result;
    }
}
