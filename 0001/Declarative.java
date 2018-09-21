/**
 * Declarative
 */
public class Declarative {
    public static boolean allUnique(String string) {
        return string.length() == string.chars().distinct().count();
    }
}
