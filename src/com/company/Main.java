package com.company;
import java.io.File;
import org.w3c.dom.Document;
public class Main {

    public static void main(String[] args) {
        Pair<Integer, String> pair = Pair.of(1, "hello");
        Pair<Integer, String> pair2 = Pair.of(1, "hello");
        Integer i = pair.getF();
        String s = pair.getS();
        boolean mustBeTrue = pair.equals(pair2);
        boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode();
        System.out.println(mustAlsoBeTrue);
        System.out.println(mustBeTrue);
    }
}


