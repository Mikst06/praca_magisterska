package ug.master.mstempin.pattern.chainOfResponsibility;

public class Middleware_false extends Middleware{

    @Override
    public boolean check(byte[] byteOne) {
        if (false) {
            return true;
        } else {
            return checkNext(byteOne);
        }
    }
}
