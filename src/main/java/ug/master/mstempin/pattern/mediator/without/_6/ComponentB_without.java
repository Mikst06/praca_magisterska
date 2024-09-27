package ug.master.mstempin.pattern.mediator.without._6;

public class ComponentB_without {
    private ComponentA_without componentA;
    private ComponentC_without componentC;
    private ComponentD_without componentD;
    private ComponentE_without componentE;
    private ComponentF_without componentF;

    public void action() {
    }

    public void communicateWithComponentA(){
        componentA.action();
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
    public void communicateWithComponentF(){
        componentF.action();
    }

    public void setComponentA(ComponentA_without componentA) {
        this.componentA = componentA;
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

    public void setComponentF(ComponentF_without componentF) {
        this.componentF = componentF;
    }
}
