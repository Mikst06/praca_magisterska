package ug.master.mstempin.pattern.creational.abstractF.model;

public enum AbstractObjectType {
    A("A"),
    B("B"),
    C("C");
    private final String name;

    public String getName() {
        return name;
    }

    AbstractObjectType(String name) {
        this.name = name;
    }
}
