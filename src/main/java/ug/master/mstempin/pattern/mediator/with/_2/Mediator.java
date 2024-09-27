package ug.master.mstempin.pattern.mediator.with._2;

public class Mediator {

    private ComponentA componentA;
    private ComponentB componentB;

    public void registerComponent(Component component) {
        component.setMediator(this);

        switch (component.getName()) {
            case "ComponentA":
                componentA = (ComponentA) component;
                break;
            case "ComponentB":
                componentB = (ComponentB) component;
                break;
        }
    }

    public void communicateWithComponentA(){
        componentA.action();
    }

    public void communicateWithComponentB(){
        componentB.action();
    }
}
