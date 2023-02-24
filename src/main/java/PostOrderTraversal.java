import java.util.ArrayList;
import java.util.List;

public class PostOrderTraversal {
    public static List<Integer> traverse(Node root, boolean recursive) {
        List<Integer> result = new ArrayList<>();
        recursiveTraversal(root, result);
        return result;
    }

    private static void recursiveTraversal(Node node, List<Integer> result) {
        if(node == null) {
            return;
        }
        recursiveTraversal(node.left, result);
        recursiveTraversal(node.right, result);
        result.add(node.val);
    }
}
