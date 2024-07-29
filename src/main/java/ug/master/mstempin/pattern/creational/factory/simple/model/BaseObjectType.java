package ug.master.mstempin.pattern.creational.factory.simple.model;

public enum BaseObjectType {
    A("A"),
    B("B"),
    C("C"),

    D2("D2"),
    D3("D3"),
    D4("D4"),
    D6("D6"),
    D7("D7"),
    D8("D8"),
    D9("D9");
    private final String name;

    public String getName() {
        return name;
    }

    BaseObjectType(String name) {
        this.name = name;
    }
}
