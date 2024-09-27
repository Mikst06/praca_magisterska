package ug.master.mstempin.pattern.mediator.without._4;

public class ComponentB_without {
    private ComponentA_without componentA;
    private ComponentC_without componentC;
    private ComponentD_without componentD;

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

    public void setComponentA(ComponentA_without componentA) {
        this.componentA = componentA;
    }

    public void setComponentC(ComponentC_without componentC) {
        this.componentC = componentC;
    }

    public void setComponentD(ComponentD_without componentD) {
        this.componentD = componentD;
    }
}
