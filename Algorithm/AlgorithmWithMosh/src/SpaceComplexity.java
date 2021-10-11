public class SpaceComplexity {
    public void greet(String[] names) {
        // O(1) space
        for (int i = 0; i < names.length; i++) {
            System.out.println("Hi " + names[i]);
        }
        // O(n) space
        String[] copy = new String[names.length];
    }
}
