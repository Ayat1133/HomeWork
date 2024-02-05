package Traingle_Casification_class_1.Traingle_Casification_class_1;


/**
 * Hello world!
 * 211402367
 * 208036715
 */

enum Triangle_Types {
	  equilateral,
	  isosceles,
	  Scalene,
	  Nottriangle,
      ERROR
    
	} 

class TriangleClassifier {
	
	private static Triangle_Types triangle;
	
	public static void classifyTriangle(int a, int b, int c) {
			
	        
	        if (isEquilateral(a, b, c)) {
	        	triangle= Triangle_Types.equilateral;
	        }else if(isIsosceles(a, b, c)) {
	        	triangle= Triangle_Types.isosceles;
	        }else if(isTriangle(a, b, c)){
	        	triangle= Triangle_Types.Scalene;
	        }else {
	        	
	        	triangle=Triangle_Types.Nottriangle;
	        }

	       
	    }


    private static boolean isTriangle(int a, int b, int c) {
        return a > 0 && b > 0 && c > 0 && a + b > c && b + c > a && a + c > b;
    }


	    private static boolean isIsosceles(int a, int b, int c) {
	        return a + b > c && b + c > a && a + c > b && (a == b || b == c || c == a);
	    }



	    private static boolean isEquilateral(int a, int b, int c ) {
	        return a + b > c && b + c > a && a + c > b && a == b && b == c;
	    }
	    
	    public static Triangle_Types get_type() {
	    	return triangle;
	    }
}
