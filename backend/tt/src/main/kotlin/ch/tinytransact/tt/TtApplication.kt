package ch.tinytransact.tt

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TtApplication

fun main(args: Array<String>) {
	runApplication<TtApplication>(*args)
}
