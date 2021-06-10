
import com.pholser.junit.quickcheck.generator.GenerationStatus;
import com.pholser.junit.quickcheck.generator.Generator;
import com.pholser.junit.quickcheck.random.SourceOfRandomness;

import java.util.Arrays;


public class ListGenerator extends Generator<List> {

    public ListGenerator() {
        super(List.class); // Register the type of objects that we can create
    }

    // This method is invoked to generate a single test case
    @Override
    public List generate(SourceOfRandomness random, GenerationStatus __ignore__) {
        List ret = null;
        int size = random.nextInt(5);

        for (int i = 0; i < size; i++) {
            int value = random.nextInt(-100, 100);
            if (i > 0) {
                ret.addToEndRef(value);
            } else {
                ret = new List(value);
            }
        }

        return ret;
    }
}
