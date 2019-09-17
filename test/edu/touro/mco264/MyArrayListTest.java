package edu.touro.mco264;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayListTest {

    @org.junit.jupiter.api.Test
    void size0() {
        // AAA
        MyArrayList mal = new MyArrayList();

        int size = mal.size();

        assertEquals(0,size);
    }


    @org.junit.jupiter.api.Test
    void size1() {
        // AAA
        MyArrayList mal = new MyArrayList();
        mal.add("A");

        int size = mal.size();

        assertEquals(1,size);
    }

    @org.junit.jupiter.api.Test
    void isEmpty0() {
        MyArrayList mal = new MyArrayList();

        assertEquals(true, mal.isEmpty());
    }

    @org.junit.jupiter.api.Test
    void isEmpty1() {
        MyArrayList mal = new MyArrayList();
        mal.add("A");
        assertEquals(false, mal.isEmpty());
    }


    @org.junit.jupiter.api.Test
    void add11() {
        MyArrayList mal = new MyArrayList();
        for (int i=0;i<1111;i++)
            mal.add("A" + i);
        assertEquals("A1110", mal.get(1110));
    }

    @org.junit.jupiter.api.Test
    void get() {
        MyArrayList mal = new MyArrayList();
        mal.add("A");
        assertEquals("A", mal.get(95));
    }

    @org.junit.jupiter.api.Test
    void remove() {
    }
}