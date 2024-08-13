package ug.master.mstempin.pattern.decorator;

public class DataSourceDecorator implements BaseDecorator{
    private BaseDecorator source;

    DataSourceDecorator(BaseDecorator source) {
        this.source = source;
    }

    @Override
    public void action() {}
}
