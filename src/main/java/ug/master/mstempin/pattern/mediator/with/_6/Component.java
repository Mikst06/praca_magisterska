package ug.master.mstempin.pattern.mediator.with._6;

public interface Component {
    void setMediator(Mediator mediator);
    String getName();

    void action();
}