package ug.master.mstempin.pattern.chainOfResponsibility;

public class Middleware_6 extends Middleware{

    @Override
    public boolean check(Integer number) {
        if (number == 6) {
            return true;
        } else {
            return checkNext(number);
        }
    }
}
