public class Main {

    public static void main(String[] args) {

        //Aufgabe 1:
        //Deklarieren Sie ein Array mit 10 Doublewerten
        // Ermitteln Sie mit Hilfe einer for-Schleife den Durchschnitt
        // der Werte im Array
        double[] values = { 3.6, 8.6, 1.3, 2.6, 9.0, 4.2, 4.6, 1.2, 10.4, 32.4 };
        double average = getAverage(values);
        System.out.println( "Durchschnitt der Zahlen: "+ average);



//       //Alternativ mit foreach
//       for( double value : values){
//
//           sum += value;
//       }
//
//        average = sum / values.length;
//        System.out.println( "Durchschnitt der Zahlen: "+ average);


        //Aufgabe2: Deklarieren Sie ein String Array mit groß geschrieben Vornamen
        //ducrchlaufen Sie die mit einer Forschleife und ändern Sie alle Namen
        //in Kleinschreibung ( Tipp: String.ToLowerCase() )


        





    }

    private static double getAverage( double[] values ){

        double sum = 0;

        for( int i = 0; i < values.length; i++){
            sum += values[i];
        }

        double average = sum / values.length;
        return sum;
    }
}