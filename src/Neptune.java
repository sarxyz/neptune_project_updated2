public class Neptune {
    /* Attributes/Data fields/Properties */
    // YOUR CODE HERE
    public static long triton(long index){
        if (index == 1)
            return 1;
        else if (index == 2)
            return 2;
        else if (index == 3)
            return 3;
        else
            return triton(index -1) + triton(index - 2) + triton(index -3);
    }
    /* Constructor(s) */
    // YOUR CODE HERE

    /* Method(s) */
    // YOUR CODE HERE
}