package ug.master.mstempin.pattern.decorator;

public class DecoratorLevel3 extends DataSourceDecorator{
    private byte[] field;

    public DecoratorLevel3(BaseDecorator baseDecorator, byte[] field) {
        super(baseDecorator);
        this.field = field;
    }

    @Override
    public void action() {}
}
