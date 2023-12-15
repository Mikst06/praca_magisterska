package ug.master.mstempin.pattern.chainOfResponsibility;

public class Middleware_1 extends Middleware{

    @Override
    public boolean check(Integer number) {
        if (number == 1) {
            return true;
        } else {
            return checkNext(number);
        }
    }
}
