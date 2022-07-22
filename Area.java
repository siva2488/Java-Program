package own;
import java.util.*;
class Area{
    private double length;
    private double breadth;
    double setDim(double length, double  breadth){
        this.length = length;
        this.breadth = breadth;
      return length*breadth;
    }
    double getArea1(){
        return length;//breadth
    }
    double getArea(){
        return breadth;//
    }
}