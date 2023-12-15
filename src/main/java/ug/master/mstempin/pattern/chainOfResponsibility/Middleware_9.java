package ug.master.mstempin.pattern.chainOfResponsibility;

public class Middleware_9 extends Middleware{

    @Override
    public boolean check(Integer number) {
        if (number == 9) {
            return true;
        } else {
            return checkNext(number);
        }
    }
}
