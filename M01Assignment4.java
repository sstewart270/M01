public class M01Assignment4 {
    public static void main(String[] args) {
        // default polygon
        RegularPolygon p1 = new RegularPolygon();

        // 6 sided polygon, side length 4, center at 0,0
        RegularPolygon p2 = new RegularPolygon(6, 4);

        // 10 sided polygon, side length 4, center at (5.6, 7.8)
        RegularPolygon p3 = new RegularPolygon(10, 4, 5.6, 7.8);

        //print each ones perimeter and the area 
        System.out.printf("Polygon 1: perimeter = %.2f, area = %.2f%n",
        p1.getPerimeter(), p1.getArea());
        
        System.out.printf("Polygon 2: perimeter = %.2f, area = %.2f%n",
        p2.getPerimeter(), p2.getArea());

        System.out.printf("Polygon 3: perimeter = %.2f, area = %.2f%n",
        p3.getPerimeter(), p3.getArea());
    }
}