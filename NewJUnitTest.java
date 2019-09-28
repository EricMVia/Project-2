import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import javax.swing.JTextField;

import org.junit.Test;

public class NewJUnitTest {
//we are testing to see if the algorithm from Solve works per design based on addition with simulated input 
    @SuppressWarnings("deprecation")
	@Test
    public void testMatchers() {
        assertThat("hello world", is("hello world"));            //sees if two items are matching
        assertThat(124.56777, is(124.56777));            
    }
    
}