public class Primes {
    public static void main(String[] args) {
        int range = Integer.parseInt(args[0]);
        boolean[] arr = new boolean[range];
        int count = 0;

        arr = setTrue(arr);
        int i = 2;

        while (i < arr.length) { //Find the prime numbers according to the algoritem.
            int j = i + 1;
            while (j < arr.length) {

                if (arr[j] != false) {

                    if (j % i == 0) {
                        arr[j] = false;
                    }
                }
                j++;
            }
            i++;
        }
        
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == true) {
                System.out.println(index);
                count++;
            }
        }
        double per = (count / (double) range) * 100;
        System.out.println("There are " + count + " primes between 2 and " + range + " (" + (int) per + "% are primes)");

        


    }

    public static boolean[] setTrue(boolean[] arr) {
        for (int i = 2; i < arr.length; i++) {
            arr[i] = true;
        }
        return arr;
    }
}