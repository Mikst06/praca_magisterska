package ug.master.mstempin.pattern.creational.factory.simple.model;

public enum BaseObjectType {
    A("A"),
    B("B"),
    C("C");
    private final String name;

    public String getName() {
        return name;
    }

    BaseObjectType(String name) {
        this.name = name;
    }
}
