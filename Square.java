package com.abstract.Square.demo;

public class Square {
    
    public Square(){
        
    }
    public  Square(double side) {
        width= side;
        length=side;
    }
  
   public Square(string color,boolean filled,width,length,double side){
      //  super( color,filled)//
           width= side;
           length= side;
           this.color= color;
           this.filled= filled;
    }
    
     public double getSide()
    {
         return side;
        }
    public void setSide( double side)
    {
         this.side= side;
        }
    
   
     //@override//
    public string to string(){
       return Square( color=" + color +" , filled= " + filled + " , width= " + width +" , length= " + length +" ,side= " + side + );
      }