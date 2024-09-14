package ug.master.mstempin.pattern.chainOfResponsibility;

public class Middleware_empty extends Middleware{

    @Override
    public boolean check(byte[] byteOne) {
        if (byteOne.length == 0) {
            return true;
        } else {
            return checkNext(byteOne);
        }
    }
}
