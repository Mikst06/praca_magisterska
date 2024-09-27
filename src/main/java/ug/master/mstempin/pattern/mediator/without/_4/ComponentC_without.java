package ug.master.mstempin.pattern.mediator.without._4;

public class ComponentC_without {

    private ComponentA_without componentA;
    private ComponentB_without componentB;
    private ComponentD_without componentD;

    public void action() {
    }

    public void communicateWithComponentA(){
        componentA.action();
    }
    public void communicateWithComponentB(){
        componentB.action();
    }
    public void communicateWithComponentD(){
        componentD.action();
    }

    public void setComponentA(ComponentA_without componentA) {
        this.componentA = componentA;
    }

    public void setComponentB(ComponentB_without componentB) {
        this.componentB = componentB;
    }

    public void setComponentD(ComponentD_without componentD) {
        this.componentD = componentD;
    }
}
