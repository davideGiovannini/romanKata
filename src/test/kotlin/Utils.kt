import org.junit.Assert
import java.util.*

/**
 * Created by demiurgo on 3/18/16.
 */


fun <T, B> HashMap<T, B>.assertEntriesMatch(function: T.()->B) {
    forEach { i, s ->
        Assert.assertEquals(s, i.function())
    }
}