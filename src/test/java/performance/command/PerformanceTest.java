package performance.command;

import ug.master.mstempin.pattern.command.CommandService;

public class PerformanceTest {

    private static final CommandService service = CommandService.getInstance();

    public static void main(String[] args){
        for(int i = 0; i < 1000000; i++) {
//            _300KB_WithCommand();
//            _300KB_WithoutCommand();
//            _500KB_WithCommand();
//            _500KB_WithoutCommand();
//            _800KB_WithCommand();
//            _800KB_WithoutCommand();

//            _800KB_WithCommand_5level();
//            _800KB_WithoutCommand_5level();
//            _800KB_WithCommand_10level();
//            _800KB_WithoutCommand_10level();
//            _800KB_WithCommand_15level();
            _800KB_WithoutCommand_15level();
        }
    }

    private static void _300KB_WithCommand() {
        service._300KB_WithCommand();
    }

    private static void _300KB_WithoutCommand() {service._300KB_WithoutCommand();}

    private static void _500KB_WithCommand() {
        service._500KB_WithCommand();
    }

    private static void _500KB_WithoutCommand() {service._500KB_WithoutCommand();}

    private static void _800KB_WithCommand() {
        service._800KB_WithCommand();
    }

    private static void _800KB_WithoutCommand() {service._800KB_WithoutCommand();}

    private static void _800KB_WithCommand_5level() {
        service._800KB_WithCommand_5level();
    }

    private static void _800KB_WithoutCommand_5level() {service._800KB_WithoutCommand_5level();}

    private static void _800KB_WithCommand_10level() {
        service._800KB_WithCommand_10level();
    }

    private static void _800KB_WithoutCommand_10level() {service._800KB_WithoutCommand_10level();}
    private static void _800KB_WithCommand_15level() {
        service._800KB_WithCommand_15level();
    }

    private static void _800KB_WithoutCommand_15level() {service._800KB_WithoutCommand_15level();}

}
