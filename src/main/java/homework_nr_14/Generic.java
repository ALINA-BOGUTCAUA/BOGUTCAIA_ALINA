package homework_nr_14;

public class Generic <T extends Number> {
    private Generic<Integer> numberInteger;
    private Generic<Float> numberFloat;
    private Generic<Long> numberLong;

    public Generic<Integer> getNumberInteger() {
        return numberInteger;
    }

    public void setNumberInteger(Generic<Integer> numberInteger) {
        this.numberInteger = numberInteger;
    }

    public Generic<Float> getNumberFloat() {
        return numberFloat;
    }

    public void setNumberFloat(Generic<Float> numberFloat) {
        this.numberFloat = numberFloat;
    }

    public Generic<Long> getNumberLong() {
        return numberLong;
    }

    public void setNumberLong(Generic<Long> numberLong) {
        this.numberLong = numberLong;
    }
}
