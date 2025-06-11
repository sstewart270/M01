public class RegularPolygon {
    // data fields 
    private int n = 3;
    private double side = 1.0;
    private double x = 0.0;
    private double y = 0.0;

    /** defualt polygon */
    public RegularPolygon() {
    }

    /** specific number of sides ad side length centered at 0,0 */
    public RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
    }

    /** specified number of side and side length and center coordinates */
    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    // getters
    public int    getN()    { return n; }
    public double getSide() { return side; }
    public double getX()    { return x; }
    public double getY()    { return y; }

    // Setters
    public void setN(int n)         { this.n = n; }
    public void setSide(double side){ this.side = side; }
    public void setX(double x)      { this.x = x; }
    public void setY(double y)      { this.y = y; }

    /** return the perimeter = n * side */
    public double getPerimeter() {
        return n * side;
    }

    /** return the area */
    public double getArea() {
        return (n * side * side) / (4 * Math.tan(Math.PI / n));
    }
}