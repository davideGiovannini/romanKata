import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Created by demiurgo on 3/18/16.
 */

class TestBoth {

    @Test
    fun testAllTo3000() = (1..3000).forEach {
        assertEquals(it, it.convertToRoman().convertFromRoman())
    }
}