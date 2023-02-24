import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PostOrderTraversalTest {
    @Test
    public void testRecursiveEmptyTree() {
        Node root = null;

        List<Integer> result = PostOrderTraversal.traverse(root, true);

        List<Integer> expected = new ArrayList<>();
        assertEquals(expected, result);
    }

    @Test
    public void testRecursiveSingleNodeTree() {
        Node root = new Node(5);

        List<Integer> result = PostOrderTraversal.traverse(root, true);

        List<Integer> expected = Arrays.asList(5);
        assertEquals(expected, result);
    }
}