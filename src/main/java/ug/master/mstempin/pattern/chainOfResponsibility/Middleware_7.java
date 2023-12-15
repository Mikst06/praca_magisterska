package ug.master.mstempin.pattern.chainOfResponsibility;

public class Middleware_7 extends Middleware{

    @Override
    public boolean check(Integer number) {
        if (number == 7) {
            return true;
        } else {
            return checkNext(number);
        }
    }
}
