package eu.sig.training.ch04;

public class Money {
	private int value;
	
    @SuppressWarnings("unused")
    public boolean greaterThan(int limit) {
        return this.value > limit;
    }

    @SuppressWarnings("unused")
    public Money multiply(float factor) {
        return this;
    }

    @SuppressWarnings("unused")
    public void add(Money money) {}

    @SuppressWarnings("unused")
    public void substract(Money interest) {}
}