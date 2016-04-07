import org.junit.Test


/**
 * Created by demiurgo on 3/18/16.
 */


class TestConvertFromRomanNumbers {

    @Test
    fun simpleTest() {
        hashMapOf(
                "I"  to  1,
                "V"  to  5,
                "X"  to  10,
                "L"  to  50,
                "C"  to  100,
                "D"  to  500,
                "M"  to  1000
        ).assertEntriesMatch { convertFromRoman() }
    }

    @Test
    fun test1_10() {
        hashMapOf(
                "I"    to   1,
                "II"   to   2,
                "III"  to   3,
                "IV"   to   4,
                "V"    to   5,
                "VI"   to   6,
                "VII"  to   7,
                "VIII" to   8,
                "IX"   to   9,
                "X"    to  10
        ).assertEntriesMatch { convertFromRoman() }
    }

    @Test
    fun test1990_2008() {
        hashMapOf(
                "MCMXC"  to  1990,
                "MMVIII" to  2008
        ).assertEntriesMatch { convertFromRoman() }
    }
}
