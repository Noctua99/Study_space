package chapter9.javapackage;

//import chapter9.javapackage.sub.SubStatic;

import static chapter9.javapackage.sub.SubStatic.CLASS_NAME;
import static chapter9.javapackage.sub.SubStatic.subStaticMethod;

public class PackageSubStatic {
    public static void main(String[] args) {
//        SubStatic.subStaticMethod();
//        System.out.println(SubStatic.CLASS_NAME);
        subStaticMethod();
        System.out.println(CLASS_NAME);
    }
}
