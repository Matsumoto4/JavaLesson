package t_0415;

public class Les_05 {

	public static void main( String [ ] args ) {
		morning_greetings( ) ;
		night_greetings( "村林" , "野崎" ) ;
	}
	
	public static void morning_greetings( ) {
		System.out.println( "おはようございます。" ) ;
	}
	
	public static void night_greetings( String name_me , String name_you ) {
		System.out.println( name_you + "さん、こんばんは。" ) ;
		System.out.println( name_me + "より。" ) ;
	}

}
