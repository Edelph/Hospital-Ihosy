
import com.edelph.dao.models.sex.Sex;
import org.junit.Test;


import static org.junit.jupiter.api.Assertions.*;


public class SexTest {

    @Test
    public void testOne() throws Exception {

        assertEquals('M','M');

    }

    @Test
    public void testtwo() throws Exception {
        Sex male = Sex.getInstance("m");
        assertEquals(1,1);
    }

}