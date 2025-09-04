// Sara Mansouri
// This program will calculate the date easter falls on in the years after 1583


public class Easter{
    public static void main(String[] args){
        
        int y = 2026;
        System.out.println( "y = " + y );
        int a = y % 19;
        System.out.println( "a = " + a );
        int c = y % 100;
        System.out.println( "c = " + c );
        int b = y / 100;
        System.out.println( "b = " + b );
        int d = b / 4;
        System.out.println( "d = " + d );
        int e = b % 4;
        System.out.println( "e = " +e );
        int f = (b+8) / 25;
        System.out.println( "f = " + f );
        int g = (b - f + 1) / 3;
        System.out.println( "g = " + g );
        int h = (19* a + b - d - g + 15) % 30;
        System.out.println( "h = " + h );
        int k = c % 4;
        System.out.println( "k = " + k );
        int i = c / 4;
        System.out.println( "i = " + i );
        int r = (32+2*e+2*i-h-k) % 7;
        System.out.println( "r = " + r );
        int m = (a+11*h+22*r) / 451;
        System.out.println( "m = " + m );
        int n = (h+r-7*m+114) / 31;
        System.out.println( "n = " + n );
        int p = (h+r-7*m+114) % 31;
        System.out.println( "p = " + p );

        System.out.println("During the year " + y + " Easter will be on " + n + "/" + (p+1) + ".");




    }
}
