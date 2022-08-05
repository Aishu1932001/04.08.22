package com.abstract.Rectangle.demo;

public class Rectangle {
    
    protected double width;
    protected double length;
}
public Rectangle()
{
    
}
    public Rectangle ( double width,double length){
    this.width= width;
    this .length=length;
}
 public Rectangle extends Shape( string color,boolean filled,double width,double length)
{
    super( color,filled);
    this.width= width;
    this.length= length;
}
    
public double getWidth()
{
    return Width;
}
public void setWidth(double width){
    
    this.width=width;
}

public double getlength()
{
    return length;
}
public void setlength(double length)
{
    this.length= length;
    
}

@ override

public double getArea()
{
    return  length * width ;
}

@ override

public double getPerimeter()
{
    return 2 *( length+ width);
}

public string to string ()
{
    return Rectangle(color =" + color +" , filled= " + filled +" , width =" + width +" ,length= " + length +" );
}
}
