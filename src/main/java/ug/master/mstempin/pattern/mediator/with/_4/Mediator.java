package ug.master.mstempin.pattern.mediator.with._4;

public class Mediator {

    private ComponentA componentA;
    private ComponentB componentB;
    private ComponentC componentC;
    private ComponentD componentD;

    public void registerComponent(Component component) {
        component.setMediator(this);

        switch (component.getName()) {
            case "ComponentA":
                componentA = (ComponentA) component;
                break;
            case "ComponentB":
                componentB = (ComponentB) component;
                break;
            case "ComponentC":
                componentC = (ComponentC) component;
                break;
            case "ComponentD":
                componentD = (ComponentD) component;
                break;
        }
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
}
