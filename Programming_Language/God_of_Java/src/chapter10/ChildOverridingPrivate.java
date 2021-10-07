package chapter10;

public class ChildOverridingPrivate extends ParentOverridingPrivate {
    public ChildOverridingPrivate() {
        System.out.println("ChildOverridingPrivate Constructor");
    }


    public void printName() {
        System.out.println("ChildOverridingPrivate printName");
    }
}
