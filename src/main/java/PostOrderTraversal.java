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

        // Store previous node that was visited. This will be used later to determine if the right
        // subtree has already been visited.
        Node previousVisited = null;

        while(current != null || !stack.isEmpty()) {
            // Keep going to the left as much as possible
            while(current != null) {
                stack.push(current);
                current = current.left;
            }

            // Store the last left node, then check if we can go right from there
            Node node = stack.peekFirst();

            // If the right subtree is present but not yet visited
            if(node.right != null && previousVisited != node.right) {
                current = node.right;
            } else {
                // The right subtree has already been visited, so we visit the current node now
                // and remove it from the stack (as the full subtree of this node has been visited)
                result.add(node.val);
                previousVisited = stack.pop();
            }
        }

        return result;
    }
}
