public class FigureTestDemo {
    int length;
    int breadth;
    public FigureTestDemo(int length, int breadth) {
        this.length=length;
        this.breadth=breadth;
    }
    public FigureTestDemo(int side){
        this.length=side;
        this.breadth=side;
    }

    public int area() {
        if(length==breadth)
            return length*length;
        else
            return length*breadth;
    }

    public int perimeter() {
        if(length==breadth)
            return 4*length;
        else
            return 2*(length+breadth);
    }
}
