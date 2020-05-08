package dev.koke.Kinel.control

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import org.springframework.ui.Model

@RestController
@RequestMapping
class HelloController {

    @GetMapping("/hello")
    fun hello() : String {
        return "template"
    }

}

