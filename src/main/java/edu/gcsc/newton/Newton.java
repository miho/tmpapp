package edu.gcsc.newton;

public class Newton {
    public double findRoot(Function f, Function df, double x, int maxIter, double tol) {
        
        double h = tol + 1;
        int iter = 0;

        while(Math.abs(h) > tol) {
            h = f.eval(x)/df.eval(x);
            x -= h;

            iter++;

            if(iter > maxIter) {
                throw new RuntimeException("Does not converge after max number of iterations. x = " + x);
            } else if(Double.isNaN(x)) {
                throw new RuntimeException("Does not converge. Cannot find root, x=NaN");
            }
        }

        return x;

    }

    static interface Function {
        double eval(double x);
    }
}