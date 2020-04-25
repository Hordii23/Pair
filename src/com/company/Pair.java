


package com.company;

public class Pair<I, S> {
    I f;

    S s;

    public Pair(I f, S s) {
        this.s = s;
        this.f = f;
    }

    public static Pair of(int f, String s) {
        return new Pair(f, s);
    }

    public I getF() {
        return f;
    }

    public S getS() {
        return s;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Pair p = (Pair) obj;
        return s == p.s && f == p.f;
    }

    @Override
    public int hashCode() {
        final int pr = 31;
        int r = 1;
        r = pr * r + f.hashCode();
        r = pr * r + s.hashCode();
        return r;
    }
}



