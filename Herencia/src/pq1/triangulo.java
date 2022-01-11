package pq1;

public class triangulo extends forma2D{
	String estilo;
    double area() {
        return width * height / 2;
    }
    void showStyle() {
        System.out.println("Triangle is " + estilo);
    }
}
