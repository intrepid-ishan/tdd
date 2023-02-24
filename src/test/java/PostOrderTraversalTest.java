import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PostOrderTraversalTest {
    @Test
    public void testRecursiveEmptyTree() {
        Node root = null;

        List<Integer> result = PostOrderTraversal.traverseRecursively(root);

        List<Integer> expected = new ArrayList<>();
        assertEquals(expected, result);
    }

    @Test
    public void testRecursiveSingleNodeTree() {
        Node root = new Node(5);

        List<Integer> result = PostOrderTraversal.traverseRecursively(root);

        List<Integer> expected = Arrays.asList(5);
        assertEquals(expected, result);
    }

    @Test
    public void testRecursiveLeftTree() {
        Node root = new Node(5);
        root.left = new Node(6);
        root.left.left = new Node(7);

        List<Integer> result = PostOrderTraversal.traverseRecursively(root);

        List<Integer> expected = Arrays.asList(7, 6, 5);
        assertEquals(expected, result);
    }

    @Test
    public void testRecursiveCompleteTree() {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        List<Integer> result = PostOrderTraversal.traverseRecursively(root);

        List<Integer> expected = Arrays.asList(4, 5, 2, 6, 7, 3, 1);
        assertEquals(expected, result);
    }

    @Test
    public void testIterativeEmptyTree() {
        Node root = null;

        List<Integer> result = PostOrderTraversal.traverseIteratively(root);

        List<Integer> expected = new ArrayList<>();
        assertEquals(expected, result);
    }

    @Test
    public void testIterativeSingleNodeTree() {
        Node root = new Node(5);

        List<Integer> result = PostOrderTraversal.traverseIteratively(root);

        List<Integer> expected = Arrays.asList(5);
        assertEquals(expected, result);
    }
}