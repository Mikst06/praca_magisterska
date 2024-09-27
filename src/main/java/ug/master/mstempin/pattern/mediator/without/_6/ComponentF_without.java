package ug.master.mstempin.pattern.mediator.without._6;

public class ComponentF_without {

    private ComponentA_without componentA;
    private ComponentB_without componentB;
    private ComponentC_without componentC;

    private ComponentD_without componentD;
    private ComponentE_without componentE;

    public void action() {
    }

    public void communicateWithComponentA(){
        componentA.action();
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
    public void communicateWithComponentE(){
        componentE.action();
    }

    public void setComponentA(ComponentA_without componentA) {
        this.componentA = componentA;
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

    public void setComponentE(ComponentE_without componentE) {
        this.componentE = componentE;
    }
}
