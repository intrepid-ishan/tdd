import java.util.ArrayList;
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
        return result;
    }
}
