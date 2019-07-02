package als.pbt.lab10;

import com.pholser.junit.quickcheck.generator.GenerationStatus;
import com.pholser.junit.quickcheck.generator.Generator;
import com.pholser.junit.quickcheck.random.SourceOfRandomness;

public class InRangeGenerator extends Generator<InRange> {

    public InRangeGenerator() {
        super(InRange.class);
    }

    @Override public InRange generate(final SourceOfRandomness random,
                        final GenerationStatus status) {
        int a = random.nextInt();
        int b = random.nextInt();
        
        return new InRange(Math.min(a, b), Math.max(a, b));
    }
}
