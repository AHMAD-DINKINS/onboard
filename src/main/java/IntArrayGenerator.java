
import com.pholser.junit.quickcheck.generator.GenerationStatus;
import com.pholser.junit.quickcheck.generator.Generator;
import com.pholser.junit.quickcheck.random.SourceOfRandomness;

import java.util.Arrays;


public class IntArrayGenerator extends Generator<int[]> {

    public IntArrayGenerator() {
        super(int[].class); // Register the type of objects that we can create
    }

    // This method is invoked to generate a single test case
    @Override
    public int[] generate(SourceOfRandomness random, GenerationStatus __ignore__) {
        int size = random.nextInt(5);
        int[] ret = new int[size];

        for (int i = 0; i < ret.length; i++) {
            ret[i] = random.nextInt(-100, 100);
        }

        return ret;
    }
}
