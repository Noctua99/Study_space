package chapter8;

public class ReferenceStaticVariable {
//    static String name;
    String name;

    public ReferenceStaticVariable() {
    }

    public ReferenceStaticVariable(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        ReferenceStaticVariable reference = new ReferenceStaticVariable();
        reference.checkName();
    }

    public void checkName() {
        ReferenceStaticVariable reference1 = new ReferenceStaticVariable("Sangmin");
        System.out.println(reference1.name);
        ReferenceStaticVariable reference2 = new ReferenceStaticVariable("Sungchoon");
        System.out.println(reference1.name);
    }
}
