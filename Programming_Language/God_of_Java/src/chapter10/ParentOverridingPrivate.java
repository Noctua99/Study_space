package chapter10;

public class ParentOverridingPrivate {
    public ParentOverridingPrivate() {
        System.out.println("ParentOverridingPrivate Constructor");
    }

    private void printName() {
        System.out.println("printName() - ParentOverridingPrivate");
    }
}
