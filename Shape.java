package com.company;

import InterFaces.Shape_interface;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Stack;

/**
 * This session implement Shape an abstract Class.
 * @interFace Shape_interface
 * @methods
 * Shape (int pixle_size , int x , int y , String color , boolean transparent_flag)
 * void Painting_shape( )
 * void Update_shape(int pixle_size, int x, int y,String color,  boolean transparent_flag)
 * equals(Object o)
 * hashCode()
 *
 * @subclasses
 * Line
 * Rectangle
 * Circle
 * Triangle
 * Square
 */
public abstract class Shape implements Shape_interface {

    static int shape_id = 0;

    protected int sizeofpixels;
    protected int x;
    protected int y;
    protected String color;
    protected boolean transparent_flag;
    protected int id;

    /**
     * Constructor
     * @param pixel_size the size required
     * @param x coordinate x
     * @param y coordinate y
     * @param color the color of the shape
     * @param transparent_flag
     */
    public Shape (int pixel_size , int x , int y , String color , boolean transparent_flag)
    {
        this.sizeofpixels = pixel_size;
        this.x = x;
        this.y = y;
        this.color =color;
        this.transparent_flag=transparent_flag;
        this.id = shape_id;
        shape_id++;

    }

    /**
     * the function get as input other shape object and check if they have the same fields include the id
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(this.id == ((Shape)o).id) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return sizeofpixels == shape.sizeofpixels &&
                x == shape.x &&
                y == shape.y &&
                transparent_flag == shape.transparent_flag &&
                color.equals(shape.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sizeofpixels, x, y, color, transparent_flag,id);
    }

    /**
     * The function paint the shape of the object
     */
    @Override
    public  abstract  void Painting_shape( );

    /**
     * The function Update the current object fields
     * @param pixel_size the size required
     * @param x coordinate x
     * @param y coordinate y
     * @param color the color of the shape
     * @param transparent_flag
     */


    public void Update_shape(int pixel_size, int x, int y,String color,  boolean transparent_flag)
    {
        this .sizeofpixels = pixel_size;
        this.x=x;
        this.y= y;
        this.transparent_flag=transparent_flag;
    }

}
