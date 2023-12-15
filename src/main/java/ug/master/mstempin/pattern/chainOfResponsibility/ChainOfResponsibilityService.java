package ug.master.mstempin.pattern.chainOfResponsibility;

import ug.master.mstempin.pattern.adapter.AdapterService;

import java.util.ArrayList;
import java.util.List;

public class ChainOfResponsibilityService {

    private static ChainOfResponsibilityService instance;

    public static ChainOfResponsibilityService getInstance() {
        if ( instance == null ) {
            instance = new ChainOfResponsibilityService();
        }
        return instance;
    }

    private Boolean check(Integer number, Integer condition) {
        return number == condition;
    }

    public void withChain_three_numbers(){
        Server server = new Server();
        server.register(5);
        server.register(2);
        server.register(10);

        Middleware middleware = Middleware.link(
                new Middleware_1(),
                new Middleware_2(),
                new Middleware_3(),
                new Middleware_4(),
                new Middleware_5(),
                new Middleware_6(),
                new Middleware_7(),
                new Middleware_8(),
                new Middleware_9(),
                new Middleware_10()
        );

        server.setMiddleware(middleware);
        server.calculate();
    }

    public void withoutChain_three_numbers(){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(10);

        Boolean result = null;

        for (Integer number: numbers) {
            if (check(number, 1)) {
                result = true;
            } else if (check(number, 2)) {
                result = true;
            } else if (check(number, 3)) {
                result = true;
            } else if (check(number, 4)) {
                result = true;
            } else if (check(number, 5)) {
                result = true;
            } else if (check(number, 6)) {
                result = true;
            } else if (check(number, 7)) {
                result = true;
            } else if (check(number, 8)) {
                result = true;
            } else if (check(number, 9)) {
                result = true;
            } else if (check(number, 10)) {
                result = true;
            }
        }
    }

    public void withChain_ten_numbers(){
        Server server = new Server();
        server.register(5);
        server.register(2);
        server.register(10);
        server.register(8);
        server.register(4);
        server.register(10);
        server.register(7);
        server.register(3);
        server.register(9);
        server.register(10);

        Middleware middleware = Middleware.link(
                new Middleware_1(),
                new Middleware_2(),
                new Middleware_3(),
                new Middleware_4(),
                new Middleware_5(),
                new Middleware_6(),
                new Middleware_7(),
                new Middleware_8(),
                new Middleware_9(),
                new Middleware_10()
        );

        server.setMiddleware(middleware);
        server.calculate();
    }

    public void withoutChain_ten_numbers(){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(10);
        numbers.add(8);
        numbers.add(4);
        numbers.add(10);
        numbers.add(7);
        numbers.add(3);
        numbers.add(9);
        numbers.add(10);

        Boolean result = null;

        for (Integer number: numbers) {
            if (check(number, 1)) {
                result = true;
            } else if (check(number, 2)) {
                result = true;
            } else if (check(number, 3)) {
                result = true;
            } else if (check(number, 4)) {
                result = true;
            } else if (check(number, 5)) {
                result = true;
            } else if (check(number, 6)) {
                result = true;
            } else if (check(number, 7)) {
                result = true;
            } else if (check(number, 8)) {
                result = true;
            } else if (check(number, 9)) {
                result = true;
            } else if (check(number, 10)) {
                result = true;
            }
        }
    }
}
