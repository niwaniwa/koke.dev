package dev.koke.Kinel

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.RequestMapping




@SpringBootApplication
class KinelApplication

	fun main(args: Array<String>) {
		runApplication<KinelApplication>(*args)
	}
