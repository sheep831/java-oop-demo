package com.desk.java.demo;

public class Vector {
    public int x;
    public int y;

    public Vector clone() {
        Vector result = new Vector();
        result.x = x;
        result.y = y;
        return result;
    }
}
