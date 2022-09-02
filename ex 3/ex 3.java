public class test {
    public static void main(String[] args){
        System.out.println("SHAPE DETAILS");
        shape s = new shape("red",true);
        System.out.println(s);
        System.out.println("CIRCLE DETAILS");
        circle c = new circle(8.0,"red",true);
        System.out.println(c);
        System.out.println("RECTANGLE DETAILS");
        rectangle obj = new rectangle(2.0,4.0,"red",true);
        System.out.println(obj);
        System.out.println("SQUARE DETAILS");
        square obj1 = new square(4.0,"red",true);
        System.out.println(obj1);
       
    }
   
}
class shape{
    String color = "red";
    boolean filled = true;
    shape(){
    this.color = color;
    this.filled = filled;
    }
    shape(String x,boolean y){
        this.color = color;
        this.filled = filled;
    }
    String getcolor(){
        return color;
    }
    void setcolor(String color){
        color = "red";
    }
    boolean isfilled(){
        return filled;
    }
    void setfilled(boolean filled){
        filled = true;
    }
    public String toString(){
        return "color="+color+"\n"+"filled="+filled;
    }
   }
class circle extends shape{
    double radius = 1.0;
    circle(){
        this.radius = radius;
    }
    circle(double radius){
        this.radius = radius;
    }
    circle(double r,String c,boolean f){
        this.radius=r;
        this.color=c;
        this.filled=f;
    }
    double getradius(){
        return radius;
    }
    void setradius(double r){
        r = radius ;
    }
    double getarea(){
        return 3.14*radius*radius;
    }
    double getperimeter(){
        return 2*3.14*radius;
    }
    public String toString(){
        return "color="+color+"\n"+"filled="+filled+"\n"+"radius="+radius;
    }
   
}
class rectangle extends shape{
    double width = 1.0;
    double length =1.0;
    rectangle(){
        this.width = width;
        this.length = length;
    }
    rectangle(double width,double length){
        this.width = width;
        this.length = length;
    }
    rectangle(double w,double l,String c,boolean f){
        this.width=w;
        this.length = length;
        this.color=c;
        this.filled=f;
    }
    double getwidth(){
        return width;
    }
    void setwidth(double w){
        w = width;
    }
    double getlength(){
        return length;
    }
    void setlength(double l){
        l = length;
    }
    double getarea(){
        return length*width;
    }
    double getperimeter(){
        return 2*(length+width);
    }
    public String toString(){
        return "color="+color+"\n"+"filled="+filled+"\n"+"width="+width+"\n"+"length="+length;
    }
}
class square extends rectangle{
    double side = 1.0;
    square(){
        this.side = side;
    }
    square(double side){
        this.side = side;
    }
    square(double s,String c,boolean f){
        this.side=s;
        this.color=c;
        this.filled=f;
    }
    double getside(){
        return side;
    }
    void setside(double s){
        s = side;
    }
    void setwidth(double width){
        width = side;
    }
    void setlength(double length){
        length = side;
    }
    double getarea(){
        return length*width;
    }
    double getperimeter(){
        return 2*(length+width);
    }
    public String toString(){
        return "color="+color+"\n"+"filled="+filled+"\n"+"width="+width+"\n"+"length="+length;
    }
}
