package no.oslomet.cs.algdat.Oblig1;

////// Løsningsforslag Oblig 1 ////////////////////////

import java.lang.UnsupportedOperationException;

public class Oblig1 {
    private Oblig1() {}

    ///// Oppgave 1 //////////////////////////////////////
    public static int maks(int[] a) {

        if (a.length == 0) throw new NoSuchElementException("Det er ingen elementer i array 'a', dvs Tabellen er tom");

        int temp = 0;

        //Sorterer array i stigende rekkefølge
        for (int i = 0; i <a.length; i++) {
            for (int j = i+1; j <a.length; j++) {

                //Bytter plass
                if(a[i] >a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        return a[a.length - 1];
    }
    public static int ombyttinger(int[] a) {

        if (a.length == 0) throw new NoSuchElementException("Det er ingen elementer i array 'a', dvs Tabellen er tom");

        int temp = 0;
        int ombyttinger = 0;

        //Sorterer array i stigende rekkefølge
        for (int i = 0; i <a.length; i++) {
            for (int j = i+1; j <a.length; j++) {

                //Bytter plass
                if(a[i] >a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                    //Oppdaterer hjelpevariablen for å telle antall ombyttinger
                    ++ombyttinger;
                }
            }
        }

        return ombyttinger;
    }

    ///// Oppgave 2 //////////////////////////////////////
    public static int antallUlikeSortert(int[] a) {

        //Sjekker om tabellen er tom
        if (a.length == 0) {
            return 0;
        }

        //Om tabellen ikke er tom, vil antall ulike starte på 1, da ett enkelt tall forsatt telles som "én ulik".
        int antallUlike = 1;
        int value = a[0];

        for (int i=0; i<a.length; ++i) {
            int thisValue = a[i];

            //Om en tidligere verdi noen gang er større enn den nye, vil tabellen ikke være sortert
            if (value > thisValue) throw new IllegalStateException("Tabellen er ikke sortert stigende");

            else
                ++antallUlike;
            value = thisValue;

        }
        return antallUlike;
    }


    ///// Oppgave 3 //////////////////////////////////////
    public static int antallUlikeUsortert(int[] a) {

        //Sjekker om det er 0 elementer i tabellen
        if (a.length == 0) {
            return 0;
        }

        //Om tabellen ikke er tom, vil antall ulike starte på 1, da ett enkelt tall forsatt telles som "én ulik".
        int antallUlike = 1;

        //Går gjennom alle elementene i tabellen
        for (int i=1; i<a.length; ++i) {

            int j = 0;
            for (j=0; j<i; ++j)
                if (a[i] == a[j])
                    break;

            //Legger til antall ulike om elementet ikke er lagt til fra før
            if (i == j)
                ++antallUlike;

        }
        return antallUlike;
    }

    ///// Oppgave 4 //////////////////////////////////////
    public static void delsortering(int[] a) {

        //Sjekker om det er 0 elementer i tabellen
        if (a.length == 0) {
            System.out.println("Tabellen er tom");
        }

        else {

            int i = -1;
            int j = 0;
            int n = a.length;

            //Sorterer oddetall først i array
            while (j < n) {

                if (a[j] % 2 != 0) {
                    ++i;
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
                ++j;
            }

            System.out.println(i);

            //Sorterer oddetallene, også partallene
            Arrays.sort(a, i+1, n);
            Arrays.sort(a, 0, i+1);
        }

    }

    ///// Oppgave 5 //////////////////////////////////////
    public static void rotasjon(char[] a) {

        //Sjekker om tabellen er tom
        if (a.length == 0) {
            System.out.println("Tabellen er tom");
        }

        else {
            //Roterer elementene i array a én gang mot høyre
            for (int i = 0; i < 1; ++i) {

                //Lagrer siste element i array
                char siste = a[a.length - 1];

                for (int j = a.length - 1; j > 0; j--) {
                    //Flytter alle element ett hakk
                    a[j] = a[j - 1];
                }
                //Det tidligere siste elementet blir tildelt første plass i Array
                a[0] = siste;
            }

            System.out.println("Array etter rotasjon: ");
            for (int i = 0; i < a.length; ++i) {
                System.out.print(a[i] + " ");
            }
        }
    }

        ///// Oppgave 7 //////////////////////////////////////
    /// 7a)
    public static String flett(String s, String t) {


        if (s.length() == 1) {
            return s + t;
        }
        //initsialliserer hjelpevariabler
        int i = 0;
        int j = 0;
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

}  // Oblig1
