package ducks;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm rocket powered flying beast!");
    }
}
