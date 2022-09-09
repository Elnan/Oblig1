public class Oblig1 {

    public static void main(String[] args){

        int[] a = {8, 4, 17, 10, 6, 20, 1, 11, 15, 3, 18, 9, 2, 7, 19};
        int big = maks(a);
        System.out.println(big);

    }

        public static int maks(int[] a) {

           // int temp = 0;
            // temp = a[i];
            //a[i] = a[j];
            //a[j] = temp;
            //int value = a[0];

            for (int i=0; i< a.length-1; ++i) {

                if (a[i] < a[i+1]) {
                    int temp = a[0];
                    a[0] = a[i];
                    a[i] = temp;

                }




            }
            return a[14];

    }


}
