import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class ChickenTest {

    Chicken ginger;

// State the parameters
    @BeforeEach
    public void setUp(){
        ginger = new Chicken("Ginger", 3);
    }

// Need a getter
    @Test
    public void hasName(){
        assertThat(ginger.getName()).isEqualTo("Ginger");
    }

    @Test
    public void hasEggs(){
        assertThat(ginger.getEggs()).isEqualTo(3);
    }

// Need a setter
    @Test
    public void canSetEggs(){
        ginger.setEggs(5);
        assertThat(ginger.getEggs()).isEqualTo(5);
    }

}
