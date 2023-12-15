package ug.master.mstempin.pattern.chainOfResponsibility;

public class Middleware_5 extends Middleware{

    @Override
    public boolean check(Integer number) {
        if (number == 5) {
            return true;
        } else {
            return checkNext(number);
        }
    }
}
