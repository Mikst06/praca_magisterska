package ug.master.mstempin.pattern.mediator.without._2;

public class ComponentB_without {
    private ComponentA_without componentA;

    public void action() {
    }

    public void communicateWithComponentA(){
        componentA.action();
    }

    public void setComponentA(ComponentA_without componentA) {
        this.componentA = componentA;
    }
}
