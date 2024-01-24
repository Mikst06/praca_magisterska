package ug.master.mstempin.pattern.creational.abstractF.part.part3;

public enum Part3Type {
    A("A"),
    B("B"),
    C("C");
    private final String name;

    public String getName() {
        return name;
    }

    Part3Type(String name) {
        this.name = name;
    }
}
