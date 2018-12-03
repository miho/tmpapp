package edu.gcsc.newton;

import org.junit.Test;
import static org.junit.Assert.*;

import edu.gcsc.newton.Newton.Function;

public class NewtonTest {

    @Test public void testFindRoot() {
        
        double tol = 1e-12;

        // LINEAR CASES

        Function f  = x -> x;
        Function df = x -> 1;
        double x0 = 0;
        double expected = 0;

        createFindRootTest(f, df, x0, expected, tol);

        f  = x -> x + 1;
        df = x -> 1;
        x0 = 0;
        expected = -1;

        createFindRootTest(f, df, x0, expected, tol);
        
    }

    private void createFindRootTest(Function f, Function df, double x0, double expected, double tol) {
        
        Newton newton = new Newton();

        assertEquals(expected, newton.findRoot(f,df,x0,tol), tol);

    }
}