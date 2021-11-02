package chapter32;

public class DefaultImplementedChild implements DefaultStaticInterface{
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSince() {
        return since;
    }
}
