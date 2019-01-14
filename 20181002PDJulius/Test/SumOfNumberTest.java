import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumOfNumberTest {

    @Test
    void getSumOfNumbers(){

        assertEquals(494550,SumOfNumber.countSum(100,999));
    }

}

//k= 100(100+1)/2=5050


//SUMk = n(n-1)/2 = (n^2 - n) / 2;

//Sumk-Sumn = ((k-1)k)/2 =  k(k+1) / 2

//499500-5050