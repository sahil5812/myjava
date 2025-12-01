public class Triangle extends shape{
    double base ;
    double height;
    Triangle(double base,double height){
        this.base = base;
        this.height = height;
    }
    //@Override
    double area(){
        return 0.5 * base * height;
    }

}
