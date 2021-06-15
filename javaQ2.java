class Rectangle{
    double length,breadth;
    void setData(double l,double b){
        length=l;
        breadth=b;
    }
    double getArea(){
        return(length*breadth);
    }
}
class javaQ2{
    public static void main(String args[]) {
        Rectangle R1=new Rectangle();
        Rectangle R2=new Rectangle();
        Rectangle R3=new Rectangle();
        R1.setData(12.4,13);
        R2.setData(10.5,9);
        R3.setData(13,14);
        double area1=R1.getArea();
        double area2=R2.getArea();
        double area3=R3.getArea();
        System.out.println("Area of R1 is " +area1);
        System.out.println("Area of R2 is " +area2);
        System.out.println("Area of R3 is " +area3);
    }
}