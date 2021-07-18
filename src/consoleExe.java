import main.CLI.console;
import main.CLI.eventsImpl.ConsoleEventHandler;
import main.CLI.eventsImpl.ConsoleEventListener_Imp;
import main.CLI.observerPatternImpl.CapacityObserver;
import main.CLI.observerPatternImpl.ObservableCapacity;

/*
main und test-Klasse
 */
public class consoleExe
{
    public static void main(String[] args)
    {
        console con = new console();
        ConsoleEventHandler handler = new ConsoleEventHandler();
        ConsoleEventListener_Imp listener = new ConsoleEventListener_Imp("listener");
        handler.add(listener);
        con.setConsoleHandler(handler);
        ObservableCapacity capacity = new ObservableCapacity(0);
        CapacityObserver observer1 = new CapacityObserver(capacity,"O1");
        con.start();
    }
}
