/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas_oop_170522_2a;

/**
 *
 * @author Lenovo X380 Yoga
 */
public class Circle extends MathLib {
    double radius;
    
    Circle(double r){
        radius = r;
    }
    
    double luas(){
        return super.pi * radius * radius;   
    }
    
}