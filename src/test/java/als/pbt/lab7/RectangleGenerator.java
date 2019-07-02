package als.pbt.lab7;

import com.pholser.junit.quickcheck.generator.GenerationStatus;
import com.pholser.junit.quickcheck.generator.Generator;
import com.pholser.junit.quickcheck.random.SourceOfRandomness;

public class RectangleGenerator extends Generator<Rectangle> {

    public RectangleGenerator() {
        super(Rectangle.class);
    }

    @Override public Rectangle generate(final SourceOfRandomness random,
                        final GenerationStatus status) {
        int h = Math.abs(random.nextInt());
        int w = Math.abs(random.nextInt());
        
        return new Rectangle(w, h);
    }
}
