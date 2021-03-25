package Classes.methods.ObjectClass;

public class ObjectOverride {
    public ObjectOverride(int i) {
        instanceVar = i;
    }
    public int getInstanceVar() {
        return instanceVar;
    }
    public void setInstanceVar(int instanceVar) {
        this.instanceVar = instanceVar;
    }
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ObjectOverride))
            return false;
        ObjectOverride param = (ObjectOverride) o;
        return param.getInstanceVar() == this.getInstanceVar();
    }
    private int instanceVar;
}
