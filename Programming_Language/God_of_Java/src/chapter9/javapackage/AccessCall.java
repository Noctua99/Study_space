package chapter9.javapackage;

import chapter9.javapackage.sub.AccessModifer;

public class AccessCall {
    public static void main(String[] args) {
        AccessModifer accessModifer = new AccessModifer();
        accessModifer.publicMethod();
//        accessModifer.protectedMethod();
//        accessModifer.packagePrivateMethod();
//        accessModifer.privateMethod();
    }
}
