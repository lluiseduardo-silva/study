package cloud.tospendtime.firstproject

import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MathController {
    @RequestMapping("/sum/{one}/{two}")
    fun sum(
        @PathVariable("one") one: String?,
        @PathVariable("two") two: String?
    ) : Double {
        return convertToDouble(one) + convertToDouble(two)
    }

    fun convertToDouble(string: String?): Double {
        if(string.isNullOrBlank()) return 0.0
        val number = string.replace(",".toRegex(), ".")
        return if(isNumeric(number)) number.toDouble() else 0.0
    }

    fun isNumeric(string: String?): Boolean {
        if(string.isNullOrBlank()) return false
        val number = string.replace(",".toRegex(), ".")

        return number.matches("""[-+]?[0-9]*\.?[0-9]+""".toRegex())
    }
}