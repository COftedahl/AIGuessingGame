package main;

import java.io.Closeable;

public abstract class AbstractStreamManager implements Closeable {
    public abstract String  read();
    public abstract void print(String s);
    public abstract void println(String s);
}
