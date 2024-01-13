package beenary.dev;

class Pair<T, U> {
    private T first;
    private U second;

    public void add(T first, U second) {
        this.first = first;
        this.second = second;
    }
    // other actions
}

class PairDemo{
    public static void main(String[] args) {
        Pair<Double, Integer> pair = new Pair();
        pair.add(15.48, 30);
    }
}
