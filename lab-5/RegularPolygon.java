import java.util.*;
public class RegularPolygon {
    private int n ;
    private double side ;
    private double x ;
    private double y ;

RegularPolygon(){
    this.n = 3 ;
    this.side = 1 ;
    this.x = 0 ;
    this.y = 0 ;

}
RegularPolygon(int n, double side) {
    this.n = n ;
    this.side = side ;
    this.x = 0 ;
    this.y = 0 ;
}
RegularPolygon(int n, double side, double x, double y){
    this.n = n ;
    this.side = side ;
    this.x = x ;
    this.y = y ;
}
public int getN(){
    return this.n ;
}
public void setN(int n){
    this.n = n ;
}
public double getSide(){
    return this.side ;
}
public void setSide(double side){
    this.side = side ;
}
public double getX(){
    return this.x;
}
public void setX(double x){
    this.x = x ;
}
public double getY(){
    return this.y ;
}
public void setY(double y){
    this.y = y ;
}
public double getPerimeter(){
    return this.side*this.n ;
}
public double getArea(){
    return (this.n * this.side * this.side) / (4 * Math.tan(Math.PI / this.n));
}

}
