public class Main {
    public static void main(String[] args) {
        Neptune neptune = new Neptune();

        long index = 5;
        long result = neptune.triton(index); //
        System.out.println("\nResult of index " + index + " is "
            + result);

        index = 10;
        result = neptune.triton(index); //
        System.out.println("\nResult of index " + index + " is "
               + result);
    }
}
