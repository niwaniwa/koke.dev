package dev.koke.Kinel.control

import org.springframework.http.HttpHeaders
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.net.URLEncoder


@Controller
@RequestMapping
class PublicPageController {

    // index
    @GetMapping("/")
    fun index() : String {
        return "public/index_koke"
    }


}