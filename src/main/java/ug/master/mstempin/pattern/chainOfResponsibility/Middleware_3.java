package ug.master.mstempin.pattern.chainOfResponsibility;

public class Middleware_3 extends Middleware{

    @Override
    public boolean check(Integer number) {
        if (number == 3) {
            return true;
        } else {
            return checkNext(number);
        }
    }
}
