public class routeExplore {
    public static void main(String[] args) {
        String givenDirect = "WWEENNN" ;
        int x=0, y=0 ;

        for (int i=0 ; i<givenDirect.length() ;i++){
            char direction = givenDirect.charAt(i) ;

            if (direction=='E')
                x++ ;
            else if (direction=='W')
                x-- ;
            else if (direction=='N')
                y++ ;
            else
                y-- ;

        }
            int X2 = x*x ;
            int Y2 = y*y ;

            float shortRoute =(float) Math.sqrt(X2+Y2) ;

        System.out.println("The Shortest Route For The Given Direction Is : "+shortRoute);
    }
}
