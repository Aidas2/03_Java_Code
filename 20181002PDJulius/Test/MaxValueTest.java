import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxValueTest {
    @Test
    void findMaxValue(){
        int [] array ={5,9,8,9,1,44,12,2,99};
        assertEquals(44,MaxValue.getMaxValue(array));
    }

}