public class Primes {
    public static void main(String[] args) {
        int range = Integer.parseInt(args[0]);
        boolean[] arr = new boolean[range + 1];
        int count = 0;

        arr = setTrue(arr);
        int i = 2;

        System.out.println("Prime numbers up to " + range + ":");

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
        
        for (int index = 0; index < arr.length; index++) { //Print the prime numbers.
            if (arr[index] == true) {
                System.out.println(index);
                count++;
            }
        }
        double per = ((double) count / range) * 100; //Calculate the percentage of prime numbers.
        System.out.println("There are " + count + " primes between 2 and " + range + " (" + (int) per + "% are primes)");

        


    }

    public static boolean[] setTrue(boolean[] arr) {
        for (int i = 2; i < arr.length; i++) {
            arr[i] = true;
        }
        return arr;
    }
}