package com.abstract.Circle.demo;

    
   public class Circle extends Shape{
        
        protected double radius;
    }
public Circle()
    {
   
        }
    
    public Circle( string color,boolean filled,double radius){
        super( color,filled);
        this.radius= radius;
        }
    
    public  double getRadius()
    {
        return radius;
    }
    public void setRadius(  double radius)
    {
        
        this.radius= radius;
    }
   
   @ override
   
    public double getArea()
    {
        return Math.PI * radius * radius;
    }
   
    @ override
   
    public  double getPerimeter()
   {
        return 2 * Math.PI  * radius;
    }
    //override//
    public string to string(){
        
        return Circle(  color= " + color +" , filled= " + filled +" , radius= " + radius +")
    }
}
    