package chapter17;

import java.lang.reflect.Method;

public class UserAnnotationCheck {
    public static void main(String[] args) {
        UserAnnotationCheck sample = new UserAnnotationCheck();
        sample.checkAnnotations(UserAnnotationSample.class);
    }

    public void checkAnnotations(Class useClass) {
        Method[] methods = useClass.getDeclaredMethods();
        for (Method tempMethod : methods) {
            UserAnnotation annotation = tempMethod.getAnnotation(UserAnnotation.class);
            if (annotation != null) {
                int number = annotation.number();
                String text = annotation.text();
                System.out.println(tempMethod.getName() + "() : number = " + number + " text = " + text);
            } else {
                System.out.println(tempMethod.getName() + "() : annotation is null");
            }
        }
    }
}
