package ug.master.mstempin.pattern.creational.abstractF.part.part2;

public enum Part2Type {
    A("A"),
    B("B"),
    C("C");
    private final String name;

    public String getName() {
        return name;
    }

    Part2Type(String name) {
        this.name = name;
    }
}
