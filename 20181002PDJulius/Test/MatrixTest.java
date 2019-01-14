import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MatrixTest {

    @Test
    void generateMatrixAndFindSum(){
        //1st column 0 1 2 3 4 5 6 7 8 9 = 45
        //2nd column 0 1 4 9 16 25 36 49 64 81 = 285
        //45 + 285 = 330
        //sum

        assertEquals(330,Matrix.findSum());
    }

}