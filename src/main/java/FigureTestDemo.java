public class FigureTestDemo {
    int length;
    int breadth;
    public FigureTestDemo(int length, int breadth) {
        this.length=length;
        this.breadth=breadth;
    }

    public int area() {
        if(length!=breadth)
            return length*breadth;
        else
            return length*length;
    }
}
