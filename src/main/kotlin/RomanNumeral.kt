/**
 * Created by demiurgo on 3/18/16.
 */


fun Int.convertToRoman(): String = when (this) {
    0 -> ""
    1 -> "I"
    5 -> "V"
    10 -> "X"
    50 -> "L"
    100 -> "C"
    500 -> "D"
    1000 -> "M"
    else -> {
        val tens = "$this".length - 1
        val unit = (Math.pow(10.0, tens.toDouble())).toInt()
        val u_count = this / unit

        val str = when (u_count) {
            1 -> unit.convertToRoman()
            2 -> unit.convertToRoman() + unit.convertToRoman()
            3 -> unit.convertToRoman() + unit.convertToRoman() + unit.convertToRoman()
            4 -> unit.convertToRoman() + (5 * unit).convertToRoman()
            5 -> (unit * 5).convertToRoman()
            6 -> (5 * unit).convertToRoman() + unit.convertToRoman()
            7 -> (5 * unit).convertToRoman() + unit.convertToRoman() + unit.convertToRoman()
            8 -> (5 * unit).convertToRoman() + unit.convertToRoman() + unit.convertToRoman() + unit.convertToRoman()
            9 -> unit.convertToRoman() + (10 * unit).convertToRoman()
            else -> {
                throw Exception("This case should be unreachable")
            }
        }
        "$str${(this - (u_count * unit)).convertToRoman()}"
    }
}


fun String.convertFromRoman(): Int = when (this) {
    "" -> 0
    "I" -> 1
    "V" -> 5
    "X" -> 10
    "L" -> 50
    "C" -> 100
    "D" -> 500
    "M" -> 1000
    else -> {
        val chars = length
        if (chars < 2) {
            throw Exception("All 1 char cases are catched before this clause")
        }

        val pos = "${this[0]}".convertFromRoman()
        val next = "${this[1]}".convertFromRoman()

        if (next > pos) {
            next - pos + this.substring(2).convertFromRoman()
        } else {
            pos + this.substring(1).convertFromRoman()
        }
    }
}

