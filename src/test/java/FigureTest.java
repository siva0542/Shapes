import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FigureTest {

    @Test
    public void toCalculateAreaOfRectangleWhenBothDimensionsArePositive(){
        FigureTestDemo obj=new FigureTestDemo(5,4);
        int actualArea=obj.area();
        int expectedArea=20;
        assertEquals(actualArea,expectedArea);
    }

    @Test
    public void toCalculateAreaOfRectangleWhenBothDimensionsAreNegative(){
        FigureTestDemo obj=new FigureTestDemo(-5,-4);
        int actualArea=obj.area();
        int expectedArea=20;
        assertEquals(actualArea,expectedArea);
    }

    @Test
    public void toCalculateAreaOfRectangleWhenLengthIsPositiveAndBreadthIsNegative(){
        FigureTestDemo obj=new FigureTestDemo(5,-4);
        int actualArea=obj.area();
        int expectedArea=-20;
        assertEquals(actualArea,expectedArea);
    }

    @Test
    public void toCalculateAreaOfRectangleWhenLengthIsNegativeAndBreadthIsPositive(){
        FigureTestDemo obj=new FigureTestDemo(-5,4);
        int actualArea=obj.area();
        int expectedArea=-20;
        assertEquals(actualArea,expectedArea);
    }

    @Test
    public void toCalculatePerimeterOfRectangleWhenBothDimensionsArePositive(){
        FigureTestDemo obj=new FigureTestDemo(5,4);
        int actualArea=obj.perimeter();
        int expectedArea=18;
        assertEquals(actualArea,expectedArea);
    }

    @Test
    public void toCalculatePerimeterOfRectangleWhenBothDimensionsAreNegative(){
        FigureTestDemo obj=new FigureTestDemo(-5,-4);
        int actualArea=obj.perimeter();
        int expectedArea=-18;
        assertEquals(actualArea,expectedArea);
    }

    @Test
    public void toCalculatePerimeterOfRectangleWhenLengthIsPositiveAndBreadthIsNegative(){
        FigureTestDemo obj=new FigureTestDemo(5,-4);
        int actualArea=obj.perimeter();
        int expectedArea=2;
        assertEquals(actualArea,expectedArea);
    }

    @Test
    public void toCalculatePerimeterOfRectangleWhenLengthIsNegativeAndBreadthIsPositive(){
        FigureTestDemo obj=new FigureTestDemo(-5,4);
        int actualArea=obj.area();
        int expectedArea=-20;
        assertEquals(actualArea,expectedArea);
    }
}
