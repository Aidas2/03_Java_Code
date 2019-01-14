package lt.vtvpmc.acalc;

public class InkCalculator {

    //DEMESIO - spresta analogiskai kaip ir ashop, o tikrasis destytojo sprendimas yra toliau, 2018-10-15printer
    private Shape[] shapes = new Shape[100];
    private int figureCount = 0;

    public void add(Shape shape) {
        shapes[figureCount++] = shape;
    }

    public int getFigureCount() {
        return this.figureCount;
    }

    public double getFinalQuantity() {
        double finalQuantity = 0;

        for (int i = 0; i < figureCount; i++) {
            finalQuantity += shapes[i].getPaintQuantity();
        }

        return finalQuantity;
    }

}
