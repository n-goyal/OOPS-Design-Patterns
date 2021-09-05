package adaptiveDucks;

public class TurkeyAdapter implements Duck {
    Turkey turkey;

    // intializing the turkey interface
    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    public void quack() {
        // calling right method from turkey interface from duck method
        turkey.gobble();
    }

    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}