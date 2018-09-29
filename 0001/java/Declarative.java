/**
 * Declarative
 */
public class Declarative implements Solution {
    public boolean allUnique(String string) {
        return string.length() == string.chars().distinct().count();
    }
}
