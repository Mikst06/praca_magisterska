package ug.master.mstempin.pattern.chainOfResponsibility;

public class Middleware_4 extends Middleware{

    @Override
    public boolean check(Integer number) {
        if (number == 4) {
            return true;
        } else {
            return checkNext(number);
        }
    }
}
