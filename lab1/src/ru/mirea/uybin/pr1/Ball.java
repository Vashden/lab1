package ru.mirea.uybin.pr1;
import java.lang.*;

public class Ball {
        private double size;
        private String kind;

    public Ball(double size, String kind) {
        this.size = size;
        this.kind = kind;
    }

    public Ball(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "size=" + size +
                ", kind='" + kind + '\'' +
                '}';
    }
}
