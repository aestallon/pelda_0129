import org.apache.log4j.Logger;

public class Utils {

    //visszaadja a legnagyobb elem indexét
    //üres tömb vagy null esetén -1
    private static final Logger logger = Logger.getLogger(Utils.class);

    /**
     * Finds the first index of the biggest element in the specified
     * {@code int} array.
     *
     * <p>If the specified array is null, or its length is 0,
     * -1 is returned.
     *
     * @param array an {@code int[]}
     * @return the first index of the biggest element, or -1 if the
     *         array is null or of length 0.
     */
    public static int maxker(int[] array) {
        int idx = -1;
        int max = Integer.MIN_VALUE;
        logger.info("Search is starting...");
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                idx = i;
                max = array[i];
            }
        }
        return idx;
    }

    public static void main(String[] args) {

        maxker(new int[]{1, 2, 3});
    }

}


