fun main(args: Array<String>)
{
    PrintInfo();
}
open class Point {
    constructor() {
        this.X = 0.0;
        this.Y = 0.0;
    }
    constructor(X: Double, Y: Double) {
        this.X = X;
        this.Y = Y;
    }

    var X: Double;
    var Y: Double;

    open fun Print(){
        println("X = $X\nY = $Y");
    }
}
class ColoredPoint: Point {
    constructor() : super() {
        this.Color = "#000000";
    }
    constructor(X: Double, Y: Double, Color: String) : super(X, Y) {
        this.Color = Color;
    }

    var Color: String

    override fun Print(){
        super.Print();
        println("Color = $Color");
    }
}
open class Line(A: Point, B: Point) {
    var A: Point = A;
    var B: Point = B;

    open fun Print(){
        println("A = $A\nB = $B");
    }
}
class ColoredLine(A: Point, B: Point, Color: String): Line(A, B) {
    var Color: String = Color;

    override fun Print(){
        super.Print()
        println("Color = $Color")
    }
}

class Polygon(points:Array<Point>){

    val _points:Array<Point>
    init {
        _points = points
    }
    fun Print(){
        _points.forEach { println(it) }
    }
}

    fun PrintInfo(){
        println("Точка:");
        Point().Print();
        println();

        println("Цветная точка:");
        val coloredPoint:ColoredPoint = ColoredPoint(1.0,3.5, "Нига");
        coloredPoint.Print();
        println();

        println("Линия:");
        val line:Line = Line(Point(4.6, 5.4), Point(2.1, 4.3));
        line.Print();
        println();

        println("Цветная линия:");
        val coloredLine:ColoredLine = ColoredLine(Point(4.6, 5.4), Point(2.1, 4.3), "НИга");
        coloredLine.Print();
        println();

        println("Многоугольник:");
        val polygon:Polygon = Polygon(arrayOf<Point>(Point(1.1,2.1), Point(3.2,4.6), Point(5.2,6.5)));
        polygon.Print();
    }