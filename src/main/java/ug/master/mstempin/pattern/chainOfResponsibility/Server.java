package ug.master.mstempin.pattern.chainOfResponsibility;

import java.util.ArrayList;
import java.util.List;

public class Server {
    private final List<Integer> numbers = new ArrayList<>();
    private Middleware middleware;

    public void setMiddleware(Middleware middleware) {
        this.middleware = middleware;
    }

    Boolean result;
    public void calculate() {
        for (Integer number: numbers) {
            if (middleware.check(number)) {
                result = true;
            } else {
                result = false;
            }
        }
    }

    public void register(Integer number) {
        numbers.add(number);
    }
}
