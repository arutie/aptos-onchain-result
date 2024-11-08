package com.xg.w3.aptos.bean;

import java.util.Objects;

public class Pair<T1, T2> {
    private T1 item1;
    private T2 item2;

    public Pair() {
    }

    public Pair(T1 item1, T2 item2) {
        this.item1 = item1;
        this.item2 = item2;
    }

    public T1 getItem1() {
        return item1;
    }

    public void setItem1(T1 item1) {
        this.item1 = item1;
    }

    public T2 getItem2() {
        return item2;
    }

    public void setItem2(T2 item2) {
        this.item2 = item2;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "item1=" + item1 +
                ", item2=" + item2 +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(item1, pair.item1) && Objects.equals(item2, pair.item2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(item1, item2);
    }
}
