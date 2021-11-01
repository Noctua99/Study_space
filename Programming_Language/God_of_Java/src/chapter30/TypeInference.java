package chapter30;

public class TypeInference {
    public static void main(String[] args) {
        TypeInference type = new TypeInference();
        type.makeObjects1();
        type.makeObject2();
        type.makeObject3();
//        type.makeObject4();
    }

    public void makeObjects1() {
        GenericClass<Integer> generic1 = new GenericClass<>("String");
        generic1.setValue(999);
    }

    public void makeObject2() {
        GenericClass<Integer> generic1 = new GenericClass("String");
        generic1.setValue(999);
    }

    public void makeObject3() {
        GenericClass<Integer> generic1 = new <String>GenericClass<Integer>("String");
        generic1.setValue(999);
    }

    /*public void makeObject4() {
        GenericClass<Integer> generic1 = new <String>GenericClass<>("String");
        generic1.setValue(999);
    }*/
}
