package com.company;
/**
 * This session implement Circle  Class.
 *
 * @methods
 * Rectangle (int pixle_size , int x , int y , String color , boolean transparent_flag)
 * void Painting_shape( )
 * @support from the abstract class
 * void Update_shape(int pixle_size, int x, int y,String color,  boolean transparent_flag)
 * equals(Object o)
 * hashCode()
 */

public class Circle extends Shape {


    /**
     * Constructor
     *
     * @param pixle_size       the size required
     * @param x                coordinate x
     * @param y                coordinate y
     * @param color            the color of the shape
     * @param transparent_flag
     */

    public Circle(int pixle_size, int x, int y, String color, boolean transparent_flag) {
        super(pixle_size, x, y, color, transparent_flag);
    }

    /**
     * The function paint the shape of the object
     */
    @Override
    public void Painting_shape() {

        System.out.println("Circle was painted ");

    }

    /*
    * Optional not needed

    @Override
    public void Update_shape(int pixle_size, int x, int y, String color, boolean transparent_flag) {
        super.Update_shape(pixle_size, x, y, color, transparent_flag);
    }

 */

}
