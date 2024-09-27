package ug.master.mstempin.pattern.mediator.with._2;

public class ComponentA implements Component {
    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public String getName() {
        return "ComponentA";
    }

    @Override
    public void action() {
    }

    public void communicateWithB(){
        mediator.communicateWithComponentB();
    }
}
