package ug.master.mstempin.pattern.mediator.with._6;

public class ComponentB implements Component {
    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public String getName() {
        return "ComponentB";
    }

    @Override
    public void action() {}

    public void communicateWithA(){
        mediator.communicateWithComponentA();
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
    public void communicateWithF(){
        mediator.communicateWithComponentF();
    }
}
