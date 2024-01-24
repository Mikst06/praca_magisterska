package ug.master.mstempin.pattern.creational.abstractF.part.part1;

public enum Part1Type {
    A("A"),
    B("B"),
    C("C");
    private final String name;

    public String getName() {
        return name;
    }

    Part1Type(String name) {
        this.name = name;
    }
}
