package ug.master.mstempin.pattern.mediator.with._4;

public class ComponentD implements Component {
    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public String getName() {
        return "ComponentD";
    }

    @Override
    public void action() {
    }

    public void communicateWithA(){
        mediator.communicateWithComponentA();
    }

    public void communicateWithB(){
        mediator.communicateWithComponentB();
    }

    public void communicateWithC(){
        mediator.communicateWithComponentC();
    }
}
