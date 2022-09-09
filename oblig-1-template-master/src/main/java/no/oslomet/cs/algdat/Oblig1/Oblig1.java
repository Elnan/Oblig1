package no.oslomet.cs.algdat.Oblig1;

////// Løsningsforslag Oblig 1 ////////////////////////

import java.lang.UnsupportedOperationException;

public class Oblig1 {
    private Oblig1() {}

    ///// Oppgave 1 //////////////////////////////////////
    public static int maks(int[] a) {
        throw new UnsupportedOperationException();
    }

    public static int ombyttinger(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 2 //////////////////////////////////////
    public static int antallUlikeSortert(int[] a) {
        throw new UnsupportedOperationException();
    }{

        int antallUlike = 0;
        int value = a[0];

        for (int i=0; i<a.length; ++i) {
            int thisValue = a[i];

            if (thisValue != value) {

                ++antallUlike;
            }
        }
        return antallUlike+1;
    }


    ///// Oppgave 3 //////////////////////////////////////
    public static int antallUlikeUsortert(int[] a) {
        throw new UnsupportedOperationException();
    }{

        int antallUlike = 1;
        int value = a[0];

        for (int i=0; i<a.length; ++i) {
            int thisValue = a[i];

            if (thisValue != value) {

                ++antallUlike;
            }
        }
        return antallUlike;
    }

    ///// Oppgave 4 //////////////////////////////////////
    public static void delsortering(int[] a) {
        throw new UnsupportedOperationException();
    }{

        //Indeks for venstre og høyre
        int v = 0;
        int h = n - 1;
        //Teller oddetall
        int o = 0;

        while (v < h) {

            // Finner første heltall fra venstre
            while(a[v] % 2 !=0){

                ++v;
                ++o;
            }
            // Finner første oddetall fra høyre
            while(a[h] % 2 == 0 && v < h){

                --h;
            }

            if (v < h){

                int temp = a[v];
                a[v] = a[h];
                a[h] = temp;
            }
        }

        //Mangler å sortere i forhold til størelse

    }

    ///// Oppgave 5 //////////////////////////////////////
    public static void rotasjon(char[] a) {
        throw new UnsupportedOperationException();
    }{

        //Roterer elementene i array a én gang mot høyre
        for (int i=0; i < 1; ++i) {

            char siste;
            //Lagrer siste element i array
            siste = a[a.length-1];

            for (int j = a.length-1; j>0; j--) {
                //Flytter alle element ett hakk
                a[j] = a[j-1];
            }
            //Det tidligere siste elementet blir tildelt første plass i Array
            a[0] = siste;
        }

        System.out.println("Array etter rotasjon: ");
        for (int i=0; i<a.length; ++i) {
            System.out.print(a[i]+ ", ");
        }
    }

    ///// Oppgave 6 //////////////////////////////////////
    public static void rotasjon(char[] a, int k) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 7 //////////////////////////////////////
    /// 7a)
    public static String flett(String s, String t) {
        throw new UnsupportedOperationException();
    }{


        if (s.length() == 1) {
            return s + t;
        }
        //initsialliserer hjelpevariabler
        int i = 0
        int j = 0
        int k = 0;

        //Oppretter array som skal inneholde svaret
        char[] svar = new char[s.length() + t.length()];

        //Går gjennom begge ord og legger til annenhver bokstav i svaret
        while (i < s.length() || j < t.length()) {
            if (i < s.length()) {
                svar[k++] = s.charAt(i++);
            }
            if (j < t.length()) {
                svar[k++] = t.charAt(j++);
            }
        }
        return new String(svar);
    }

    /// 7b)
    public static String flett(String... s) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 8 //////////////////////////////////////
    public static int[] indekssortering(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 9 //////////////////////////////////////
    public static int[] tredjeMin(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 10 //////////////////////////////////////
    public static int bokstavNr(char bokstav) {
        throw new UnsupportedOperationException();
    }

    public static boolean inneholdt(String a, String b) {
        throw new UnsupportedOperationException();
    }

}  // Oblig1
