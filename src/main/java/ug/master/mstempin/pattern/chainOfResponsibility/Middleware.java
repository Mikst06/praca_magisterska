package ug.master.mstempin.pattern.chainOfResponsibility;

public abstract class Middleware {
    private Middleware next;

    public static Middleware link(Middleware first, Middleware... chain) {
        Middleware head = first;
        for (Middleware nextInChain: chain) {
            head.next = nextInChain;
            head = nextInChain;
        }
        return first;
    }

    public abstract boolean check(Integer number);

    protected boolean checkNext(Integer number) {
        if (next == null) {
            return true;
        }
        return next.check(number);
    }
}
