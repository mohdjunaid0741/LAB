package com.company;

class Shape{
    void shape(){
        System.out.println("This is Shape");
    }
}

class Rectangle extends Shape{
    void rectangle(){
        System.out.println("This is rectangle shape");
    }
}

class Circle extends Shape{
    void circle(){
        System.out.println("This is circular shape");
    }
}

class Square extends Rectangle{
    void square(){
        System.out.println("Square is rectangle");
    }
}
public class Question2 {
    public static void main(String[] args) {
        Shape s = new Square();
        s.shape();
        Rectangle r = new Square();
        r.rectangle();
    }
}