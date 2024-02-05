package Traingle_Casification_class_1.Traingle_Casification_class_1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


import static org.junit.Assert.*;
import  org.junit.Test;

public class AppTest {
	
	TriangleClassifier triangle = new TriangleClassifier();
	
	@Test
  
	public void equilateralTriangle(){
        int a = 2;
        int b = 2;
        int c=2;
        triangle.classifyTriangle(a,b,c);
        String expected =Triangle_Types.equilateral.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result.toString());
    }

    @Test
    public void isoscelesTriangle() {
        int a = 7;
        int b = 5;
        int c = 5;
        triangle.classifyTriangle(a, b, c);
        String expected = Triangle_Types.isosceles.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result.toString());
    }
    @Test
    public void isoscelesTriangle1() {
        int a = 4;
        int b = 4;
        int c = 5;
        triangle.classifyTriangle(a, b, c);
        String expected = Triangle_Types.isosceles.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result.toString());
    }
    @Test
    public void isoscelesTriangle2() {
        int a = 3;
        int b = 4;
        int c = 3;
        triangle.classifyTriangle(a, b, c);
        String expected = Triangle_Types.isosceles.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result.toString());
    }
    @Test
    public void ScaleneTriangle() {
        int a = 8;
        int b = 17;
        int c = 15;
        triangle.classifyTriangle(a, b, c);
        String expected = Triangle_Types.Scalene.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result.toString());
    }
    @Test
    public void Nottriangle() {
        int a = 8;
        int b = 3;
        int c = 15;
        triangle.classifyTriangle(a, b, c);
        String expected = Triangle_Types.Nottriangle.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result.toString());
    }
    @Test
    public void Nottriangle1() {
        int a = 8;
        int b = 3;
        int c = 3;
        triangle.classifyTriangle(a, b, c);
        String expected = Triangle_Types.Nottriangle.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result.toString());
    }
    @Test
    public void Nottriangle2() {
        int a = 1;
        int b = 2;
        int c = 1;
        triangle.classifyTriangle(a, b, c);
        String expected = Triangle_Types.Nottriangle.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result.toString());
    }
    @Test
    public void Nottriangle3() {
        int a = 1;
        int b = 1;
        int c = 2;
        triangle.classifyTriangle(a, b, c);
        String expected = Triangle_Types.Nottriangle.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result.toString());
    }






}  