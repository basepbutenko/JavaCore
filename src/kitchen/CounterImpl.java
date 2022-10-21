package kitchen;

public class CounterImpl implements Counter {

    int i = 0;

    @Override
    public void increment() {
        i++;
    }

    @Override
    public void reset() {
        i = 0;
    }
}
