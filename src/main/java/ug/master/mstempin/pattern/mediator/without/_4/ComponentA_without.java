package ug.master.mstempin.pattern.mediator.without._4;

public class ComponentA_without {

    private ComponentB_without componentB;
    private ComponentC_without componentC;
    private ComponentD_without componentD;

    public void action() {
    }

    public void communicateWithComponentB(){
        componentB.action();
    }
    public void communicateWithComponentC(){
        componentC.action();
    }
    public void communicateWithComponentD(){
        componentD.action();
    }

    public void setComponentB(ComponentB_without componentB) {
        this.componentB = componentB;
    }

    public void setComponentC(ComponentC_without componentC) {
        this.componentC = componentC;
    }

    public void setComponentD(ComponentD_without componentD) {
        this.componentD = componentD;
    }
}
