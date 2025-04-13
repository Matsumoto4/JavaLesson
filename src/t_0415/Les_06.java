package t_0415;

public class Les_06 {

	public static void main( String [ ] args ) {
		
		double height = 175.5 ;
		double weight = 63.5 ;
		
		double result ;
		result = bmi_check( height , weight ) ;
		
		System.out.println( result ) ;

	}
	
	public static double bmi_check( double h , double w ) {
		
		double result ;
		h /= 100 ;
		result = w / ( h * h ) ;
		
		return result ;
	}

}
