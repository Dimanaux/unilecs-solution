/**
 * Test
 */
public class Test {
    public static void main(String[] args) {
        test(new Declarative());
        test(new Imperative());
        System.out.println("success!");
    }

    public static void test(Solution solution) {
        assertFalse(solution.allUnique("hello world"));
        assertFalse(solution.allUnique("some string"));
        assertFalse(solution.allUnique("two spaces :)"));
        assertFalse(solution.allUnique("abcdefg ah"));

        assertTrue(solution.allUnique("0123456789"));
        assertTrue(solution.allUnique("uniq chars!"));
        assertTrue(solution.allUnique("qwertyuiop"));
        assertTrue(solution.allUnique("QqWeRrTtYy"));
    }

    public static void assertFalse(boolean expression) {
        assertTrue(!expression);
    }

    public static void assertTrue(boolean expression) {
        if (!expression) {
            throw new AssertionError();
        }
    }
}
