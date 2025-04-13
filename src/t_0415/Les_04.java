package t_0415;

public class Les_04 {

	public static void main( String [ ] args ) {
		
		for ( int i = 1 ; i <= 30 ; i++ ) {
			if( ( i % 3 == 0 ) && ( i % 5 == 0 ) ) {
				System.out.println( i + " : ワン・ニャン" );
			}
			else if( i % 3 == 0 ) {
				System.out.println( i + " : ニャン" );
			}
			else if( i % 5 == 0 ) {
				System.out.println( i + " : ワン" );
			}
			else {
				System.out.println( i );
			}
		}
	}

}
