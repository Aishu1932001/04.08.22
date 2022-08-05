package com.abstract class Shape.demo;

 public abstract class Shape {
    protected string color;
    protected  boolean filled;
    
    public shape (){
        
    }
    public  Shape( string color,boolean filled)
    {
        this.color= color;
        this.filled= filled;
    }
    public string getcolor()
    {
        return color;
    }
    public void setcolor( string.color)
    {
        this.color= color;
    }
    
   public boolean isfilled();
    {
        return= filled;
    }
    public void setfilled( filled.boolean)
    {
        this.filled= filled;
    }
    
   
    public  abstract double getArea();
    
    public  abstract double getPerimeter();
   
    //override//
    public string to string()
    {
        return Shape( color= "+ color + " , filled=  " + filled +");
    }
    
   
