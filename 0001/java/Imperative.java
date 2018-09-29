/**
 * AllUniqueImperative
 */
public class Imperative implements Solution {
    public boolean allUnique(String string) {
        int[] counts = new int[256];
        
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            counts[c] += 1;

            if (counts[c] > 1) {
                return false;
            }
        }

        return true;
    }
    
}
