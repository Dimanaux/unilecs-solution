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
        assertTrue(!solution.allUnique("hello world"));
        assertTrue(!solution.allUnique("some string"));
        assertTrue(!solution.allUnique("two spaces :)"));
        assertTrue(!solution.allUnique("abcdefg ah"));
        
        assertTrue(solution.allUnique("0123456789"));
        assertTrue(solution.allUnique("uniq chars!"));
        assertTrue(solution.allUnique("qwertyuiop"));
        assertTrue(solution.allUnique("QqWeRrTtYy"));
    }

    public static void assertTrue(boolean expression) {
        if (!expression) {
            throw new AssertionError();
        }
    }
}