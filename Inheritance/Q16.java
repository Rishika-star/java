class Shape{
    public void area(){}
}

class Rectangle extends Shape{
    private int length;
    private int breadth;
    public Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }

    public void area(){
        int result=length*breadth;
        System.out.println("Area of Rectangle is"+result);
    }
}

class Triangle extends Shape{

    private int base;
    private int height;
    public Triangle(int base,int height){
        this.base=base;
        this.height=height;
    }

    public void area(){
        int result=0.5*base*height;
        System.out.println("Area of Triangle is"+result);
    }
}