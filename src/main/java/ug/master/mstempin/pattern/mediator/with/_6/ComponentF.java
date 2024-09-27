package ug.master.mstempin.pattern.mediator.with._6;

public class ComponentF implements Component {
    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public String getName() {
        return "ComponentF";
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

    public void communicateWithD(){
        mediator.communicateWithComponentD();
    }

    public void communicateWithE(){
        mediator.communicateWithComponentE();
    }
}
