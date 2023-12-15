package ug.master.mstempin.pattern.chainOfResponsibility;

public class Middleware_2 extends Middleware{

    @Override
    public boolean check(Integer number) {
        if (number == 2) {
            return true;
        } else {
            return checkNext(number);
        }
    }
}
