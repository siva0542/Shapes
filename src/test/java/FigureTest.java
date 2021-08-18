import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FigureTest {

    @Test
    public void toCalculateAreaOfRectangleWhenBothDimensionsArePositive(){
        FigureTestDemo obj=new FigureTestDemo(4,5);
        int actualArea=obj.area();
        int expectedArea=20;
        assertEquals(actualArea,expectedArea);
    }

    @Test
    public void toCalculateAreaOfRectangleWhenBothDimensionsAreNegative(){
        FigureTestDemo obj=new FigureTestDemo(-4,-5);
        int actualArea=obj.area();
        int expectedArea=20;
        assertEquals(actualArea,expectedArea);
    }

    @Test
    public void toCalculateAreaOfRectangleWhenLengthIsPositiveAndBreadthIsNegative(){
        FigureTestDemo obj=new FigureTestDemo(4,-5);
        int actualArea=obj.area();
        int expectedArea=-20;
        assertEquals(actualArea,expectedArea);
    }

    @Test
    public void toCalculateAreaOfRectangleWhenLengthIsNegativeAndBreadthIsPositive(){
        FigureTestDemo obj=new FigureTestDemo(-4,5);
        int actualArea=obj.area();
        int expectedArea=-20;
        assertEquals(actualArea,expectedArea);
    }
}
