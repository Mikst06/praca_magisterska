package ug.master.mstempin.pattern.chainOfResponsibility;

import java.util.ArrayList;
import java.util.List;

public class Server {
    private final List<byte[]> bytes = new ArrayList<>();
    private Middleware middleware;

    public void setMiddleware(Middleware middleware) {
        this.middleware = middleware;
    }

    Boolean result;
    public void calculate() {
        for (byte[] byteOne: bytes) {
            if (middleware.check(byteOne)) {
                result = true;
            } else {
                result = false;
            }
        }
    }

    public void register(byte[] byteOne) {
        bytes.add(byteOne);
    }
}
