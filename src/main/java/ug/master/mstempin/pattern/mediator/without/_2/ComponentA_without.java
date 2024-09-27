package ug.master.mstempin.pattern.mediator.without._2;

public class ComponentA_without {

    private ComponentB_without componentB;

    public void action() {
    }

    public void communicateWithComponentB(){
        componentB.action();
    }

    public void setComponentB(ComponentB_without componentB) {
        this.componentB = componentB;
    }
}
