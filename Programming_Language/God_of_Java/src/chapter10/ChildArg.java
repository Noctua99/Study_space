package chapter10;

public class ChildArg extends ParentArg {
    public ChildArg() {
        super("ChildArg");
//        super(null)   reference to ParentArg is ambiguous
        System.out.println("Child Constructor");
    }
}
