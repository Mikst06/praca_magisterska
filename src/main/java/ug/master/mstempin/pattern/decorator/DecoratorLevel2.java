package ug.master.mstempin.pattern.decorator;

public class DecoratorLevel2 extends DataSourceDecorator{
    private byte[] field;

    public DecoratorLevel2(BaseDecorator baseDecorator, byte[] field) {
        super(baseDecorator);
        this.field = field;
    }

    @Override
    public void action() {}
}
