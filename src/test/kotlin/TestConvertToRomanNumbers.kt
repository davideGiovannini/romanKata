import org.junit.Test

/**
 * Created by demiurgo on 3/18/16.
 */


class TestConvertToRomanNumbers {

    @Test
    fun simpleTest() {
        hashMapOf(1 to "I",
                5 to "V",
                10 to "X",
                50 to "L",
                100 to "C",
                500 to "D",
                1000 to "M"
        ).assertEntriesMatch { convertToRoman() }
    }

    @Test
    fun test1_10() {
        hashMapOf(1 to "I",
                2 to "II",
                3 to "III",
                4 to "IV",
                5 to "V",
                6 to "VI",
                7 to "VII",
                8 to "VIII",
                9 to "IX",
                10 to "X"
        ).assertEntriesMatch { convertToRoman() }
    }

    @Test
    fun test1990_2008() {
        hashMapOf(1990 to "MCMXC",
                2008 to "MMVIII"
        ).assertEntriesMatch { convertToRoman() }
    }
}
