package edu.gcsc.newton;

public class Newton {
    public double findRoot(Function f, Function df, double x, double tol) {
        
        double h = tol + 1;

        while(Math.abs(h)> tol) {
            h = f.eval(x)/df.eval(x);
            x -= h;
        }

        return x;

    }

    static interface Function {
        double eval(double x);
    }
}