package ug.master.mstempin.pattern.chainOfResponsibility;

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

    private Boolean checkEmpty(byte[] bytes, Integer condition) {
        return bytes.length == condition;
    }
    private Boolean checkFalse(byte[] bytes, Integer condition) {
        return false;
    }

    public void withChain_100KB(){
        Server server = new Server();
        server.register(new byte[100000]);
        server.register(new byte[0]);

        Middleware middleware = Middleware.link(
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_empty()
        );

        server.setMiddleware(middleware);
        server.calculate();
    }

    public void withoutChain_100KB() {
        List<byte[]> bytes = new ArrayList<>();
        bytes.add(new byte[100000]);
        bytes.add(new byte[0]);

        Boolean result = null;

        for (byte[] byteOne : bytes) {
            if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkEmpty(byteOne, 0)) {
                result = true;
            }
        }
    }

    public void withChain_300KB(){
        Server server = new Server();
        server.register(new byte[100000]);
        server.register(new byte[100000]);
        server.register(new byte[100000]);
        server.register(new byte[0]);

        Middleware middleware = Middleware.link(
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_empty()
        );

        server.setMiddleware(middleware);
        server.calculate();
    }

    public void withoutChain_300KB() {
        List<byte[]> bytes = new ArrayList<>();
        bytes.add(new byte[100000]);
        bytes.add(new byte[100000]);
        bytes.add(new byte[100000]);
        bytes.add(new byte[0]);

        Boolean result = null;

        for (byte[] byteOne : bytes) {
            if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkEmpty(byteOne, 0)) {
                result = true;
            }
        }
    }

    public void withChain_500KB(){
        Server server = new Server();
        server.register(new byte[100000]);
        server.register(new byte[100000]);
        server.register(new byte[100000]);
        server.register(new byte[100000]);
        server.register(new byte[100000]);
        server.register(new byte[0]);

        Middleware middleware = Middleware.link(
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_empty()
        );

        server.setMiddleware(middleware);
        server.calculate();
    }

    public void withoutChain_500KB() {
        List<byte[]> bytes = new ArrayList<>();
        bytes.add(new byte[100000]);
        bytes.add(new byte[100000]);
        bytes.add(new byte[100000]);
        bytes.add(new byte[100000]);
        bytes.add(new byte[100000]);
        bytes.add(new byte[0]);

        Boolean result = null;

        for (byte[] byteOne : bytes) {
            if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkEmpty(byteOne, 0)) {
                result = true;
            }
        }
    }

    public void withChain_800KB(){
        Server server = new Server();
        server.register(new byte[100000]);
        server.register(new byte[100000]);
        server.register(new byte[100000]);
        server.register(new byte[100000]);
        server.register(new byte[100000]);
        server.register(new byte[100000]);
        server.register(new byte[100000]);
        server.register(new byte[100000]);
        server.register(new byte[0]);

        Middleware middleware = Middleware.link(
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_empty()
        );

        server.setMiddleware(middleware);
        server.calculate();
    }

    public void withoutChain_800KB() {
        List<byte[]> bytes = new ArrayList<>();
        bytes.add(new byte[100000]);
        bytes.add(new byte[100000]);
        bytes.add(new byte[100000]);
        bytes.add(new byte[100000]);
        bytes.add(new byte[100000]);
        bytes.add(new byte[100000]);
        bytes.add(new byte[100000]);
        bytes.add(new byte[100000]);
        bytes.add(new byte[0]);

        Boolean result = null;

        for (byte[] byteOne : bytes) {
            if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkEmpty(byteOne, 0)) {
                result = true;
            }
        }
    }

    //-------------------------------------------------------------------------------------------------------------
    public void withChain_800KB_10levels(){
        Server server = new Server();
        server.register(new byte[100000]);
        server.register(new byte[100000]);
        server.register(new byte[100000]);
        server.register(new byte[100000]);
        server.register(new byte[100000]);
        server.register(new byte[100000]);
        server.register(new byte[100000]);
        server.register(new byte[100000]);
        server.register(new byte[0]);

        Middleware middleware = Middleware.link(
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_empty()
        );

        server.setMiddleware(middleware);
        server.calculate();
    }

    public void withoutChain_800KB_10levels() {
        List<byte[]> bytes = new ArrayList<>();
        bytes.add(new byte[100000]);
        bytes.add(new byte[100000]);
        bytes.add(new byte[100000]);
        bytes.add(new byte[100000]);
        bytes.add(new byte[100000]);
        bytes.add(new byte[100000]);
        bytes.add(new byte[100000]);
        bytes.add(new byte[100000]);
        bytes.add(new byte[0]);

        Boolean result = null;

        for (byte[] byteOne : bytes) {
            if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkEmpty(byteOne, 0)) {
                result = true;
            }
        }
    }

    public void withChain_800KB_30levels(){
        Server server = new Server();
        server.register(new byte[100000]);
        server.register(new byte[100000]);
        server.register(new byte[100000]);
        server.register(new byte[100000]);
        server.register(new byte[100000]);
        server.register(new byte[100000]);
        server.register(new byte[100000]);
        server.register(new byte[100000]);
        server.register(new byte[0]);

        Middleware middleware = Middleware.link(
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_empty()
        );

        server.setMiddleware(middleware);
        server.calculate();
    }

    public void withoutChain_800KB_30levels() {
        List<byte[]> bytes = new ArrayList<>();
        bytes.add(new byte[100000]);
        bytes.add(new byte[100000]);
        bytes.add(new byte[100000]);
        bytes.add(new byte[100000]);
        bytes.add(new byte[100000]);
        bytes.add(new byte[100000]);
        bytes.add(new byte[100000]);
        bytes.add(new byte[100000]);
        bytes.add(new byte[0]);

        Boolean result = null;

        for (byte[] byteOne : bytes) {
            if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            }  else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            }  else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            }  else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkEmpty(byteOne, 0)) {
                result = true;
            }
        }
    }

    public void withChain_800KB_50levels(){
        Server server = new Server();
        server.register(new byte[100000]);
        server.register(new byte[100000]);
        server.register(new byte[100000]);
        server.register(new byte[100000]);
        server.register(new byte[100000]);
        server.register(new byte[100000]);
        server.register(new byte[100000]);
        server.register(new byte[100000]);
        server.register(new byte[0]);

        Middleware middleware = Middleware.link(
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_false(),
                new Middleware_empty()
        );

        server.setMiddleware(middleware);
        server.calculate();
    }

    public void withoutChain_800KB_50levels() {
        List<byte[]> bytes = new ArrayList<>();
        bytes.add(new byte[100000]);
        bytes.add(new byte[100000]);
        bytes.add(new byte[100000]);
        bytes.add(new byte[100000]);
        bytes.add(new byte[100000]);
        bytes.add(new byte[100000]);
        bytes.add(new byte[100000]);
        bytes.add(new byte[100000]);
        bytes.add(new byte[0]);

        Boolean result = null;

        for (byte[] byteOne : bytes) {
            if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            }  else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            }  else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            }  else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            }  else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            }  else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            }  else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkFalse(byteOne, 0)) {
                result = true;
            } else if (checkEmpty(byteOne, 0)) {
                result = true;
            }
        }
    }
}
