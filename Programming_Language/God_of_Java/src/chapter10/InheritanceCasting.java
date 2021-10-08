package chapter10;

public class InheritanceCasting {
    public static void main(String[] args) {
        InheritanceCasting inheritance = new InheritanceCasting();
        inheritance.objectCast();
        inheritance.objectCast2();
        inheritance.objectCastArray();
    }

    public void objectCast() {
        ParentCasting parent = new ParentCasting();
        ChildCasting child = new ChildCasting();

        ParentCasting parent2 = child;
//        ChildCasting child2 = parent; error
//        ChildCasting child2 = (ChildCasting) parent;  ClassCastException
    }

    public void objectCast2() {
        ChildCasting child = new ChildCasting();
        ParentCasting parent2 = child;
        ChildCasting child2 = (ChildCasting) parent2;
    }

    public void objectCastArray() {
        ParentCasting[] parentArray = new ParentCasting[3];
        parentArray[0] = new ChildCasting();
        parentArray[1] = new ParentCasting();
        parentArray[2] = new ChildCasting();
        objectTypeCheck(parentArray);
    }

    public void objectTypeCheck(ParentCasting[] parentArray) {
        for (ParentCasting temParent : parentArray) {
            if (temParent instanceof ChildCasting) {
                System.out.println("ChildCasting");
                ChildCasting tempChild = (ChildCasting) temParent;
                tempChild.printAge();
            } else if (temParent instanceof ParentCasting) {
                System.out.println("ParentCasting");
            }
        }
    }
}
