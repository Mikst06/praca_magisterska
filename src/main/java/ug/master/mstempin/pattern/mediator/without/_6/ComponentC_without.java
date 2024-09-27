package ug.master.mstempin.pattern.mediator.without._6;

public class ComponentC_without {

    private ComponentA_without componentA;
    private ComponentB_without componentB;
    private ComponentD_without componentD;
    private ComponentE_without componentE;
    private ComponentF_without componentF;

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
    public void communicateWithComponentE(){
        componentE.action();
    }
    public void communicateWithComponentF(){
        componentF.action();
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

    public void setComponentE(ComponentE_without componentE) {
        this.componentE = componentE;
    }

    public void setComponentF(ComponentF_without componentF) {
        this.componentF = componentF;
    }
}
