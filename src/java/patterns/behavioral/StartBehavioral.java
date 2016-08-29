package patterns.behavioral;

import patterns.behavioral.state.Context;
import patterns.behavioral.state.impl.StartState;
import patterns.behavioral.state.impl.StopState;

/**
 * Created on 25.08.16.
 */
public class StartBehavioral {

    public static void main(String[] args) {

//------------------------------------ Chain of responsibility -----------------------------------------------

//        AbstractLogger loggerChain = LoggerFactory.getChainOfLoggers();
//        loggerChain.logMessage(AbstractLogger.INFO,
//                "This is an information.");
//        System.out.println("");
//        loggerChain.logMessage(AbstractLogger.DEBUG,
//                "This is a debug level information.");
//        System.out.println("");
//        loggerChain.logMessage(AbstractLogger.ERROR,
//                "This is an error information.");


//-------------------------------------------- Command -------------------------------------------------------

//        Stock abcStock = new Stock();
//
//        BuyStock buyStock = new BuyStock(abcStock);
//        SellStock sellStock = new SellStock(abcStock);
//
//        Broker broker = new Broker();
//
//        broker.takeOrder(buyStock);
//        broker.takeOrder(sellStock);
//        broker.placeOrders();

//------------------------------------------ Interpreter -----------------------------------------------------

//        Expression isMale = CheckExpression.getMaleExpression();
//        Expression isMarriedWoman = CheckExpression.getMarriedWomanExpression();
//
//        System.out.println("John is male? " + isMale.interpret("John"));
//        System.out.println("Julia is married woman? " + isMarriedWoman.interpret("Married Julia"));

//--------------------------------------------- Iterator -----------------------------------------------------

//        NameRepository namesRepository = new NameRepository();
//
//        for (Iterator iterator = namesRepository.getIterator(); iterator.hasNext(); ) {
//            String name = (String) iterator.next();
//            System.out.println("Name : " + name);
//        }

//--------------------------------------------- Mediator ----------------------------------------------------

//        User john = new User("John");
//        User robert = new User("Robert");
//
//        john.sendMessage("Hi, Robert!");
//        robert.sendMessage("Hi, John!");

//----------------------------------------------- Memento ---------------------------------------------------

//        Originator originator = new Originator();
//        CareTaker careTaker = new CareTaker();
//
//        originator.setState("State #1");
//        originator.setState("State #2");
//        careTaker.add(originator.saveStateMemento());
//        originator.setState("State #3");
//        careTaker.add(originator.saveStateMemento());
//        originator.setState("State #4");
//        System.out.println("Current state : " + originator.getState());
//        originator.getStateFromMemento(careTaker.get(0));
//        System.out.println("First saved state : " + originator.getState());
//        originator.getStateFromMemento(careTaker.get(1));
//        System.out.println("Second saved state : " + originator.getState());

//----------------------------------------------- Observer -------------------------------------------------

//        Subject subject = new Subject();
//
//        new HexObserver(subject);
//        new OctalObserver(subject);
//        new BinaryObserver(subject);
//
//        System.out.println("First state change : 15");
//        subject.setState(15);
//        System.out.println("First state change : 10");
//        subject.setState(10);

//------------------------------------------------ State ---------------------------------------------------

        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);
        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);
        System.out.println(context.getState().toString());
    }
}