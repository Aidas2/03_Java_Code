import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinMaxTest {

    @Test
    void minMax(){
        double[] x ={1.35, 2.45, 2.05, 1.20, 2.15, 1.70, 1.45, 1.95, 2.00, 1.65, 1.65, 2.05, 1.75, 1.25, 2.25, 1.40};

        //min = 1.20
        //max = 2.45
        //(1.20+2.45)/2 = 1.825

        assertEquals(1.825,MinMax.find(x),0.001);
    }

}