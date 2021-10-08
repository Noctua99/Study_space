package chapter10;

public class ChildOther extends Parent {
    public ChildOther() {
        System.out.println("ChildOther Constructor");
    }

    @Override
    public void printName() {
        System.out.println("ChildOther - printName()");
    }
}
