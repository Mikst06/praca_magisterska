package ug.master.mstempin.pattern.chainOfResponsibility;

public class Middleware_10 extends Middleware{

    @Override
    public boolean check(Integer number) {
        if (number == 10) {
            return true;
        } else {
            return checkNext(number);
        }
    }
}
