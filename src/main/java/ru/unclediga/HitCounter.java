package ru.unclediga;

public class HitCounter {
    private int hits;

    public HitCounter() {
        System.out.println("HitCounter instantiated!");
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }
}
