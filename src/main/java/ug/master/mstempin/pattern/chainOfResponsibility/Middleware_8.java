package ug.master.mstempin.pattern.chainOfResponsibility;

public class Middleware_8 extends Middleware{

    @Override
    public boolean check(Integer number) {
        if (number == 8) {
            return true;
        } else {
            return checkNext(number);
        }
    }
}
