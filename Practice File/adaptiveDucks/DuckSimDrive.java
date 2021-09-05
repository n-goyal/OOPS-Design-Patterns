package adaptiveDucks;

public class DuckSimDrive {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();

        Turkey turkey = new WildTurkey();
        
        // Turkey Adapter with create an interface between
        // Duck and Turkey and returns a Duck object 
        // which will behave like a Turkey
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("\nThe Duck says...");
        testDuck(duck);

        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
