package cloud.tospendtime.firstproject

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class Startup

fun main(args: Array<String>) {
    runApplication<Startup>(*args)
}
