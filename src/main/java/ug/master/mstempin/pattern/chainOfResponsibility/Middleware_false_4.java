package ug.master.mstempin.pattern.chainOfResponsibility;

public class Middleware_false_4 extends Middleware{

    @Override
    public boolean check(byte[] byteOne) {
        if (false) {
            return true;
        } else {
            return checkNext(byteOne);
        }
    }
}
