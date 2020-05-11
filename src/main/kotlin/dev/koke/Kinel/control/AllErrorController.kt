package dev.koke.Kinel.control

import org.springframework.boot.web.servlet.error.ErrorController
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.ModelAndView
import javax.servlet.http.HttpServletRequest


@Controller
@RequestMapping("/error")
class AllErrorController : ErrorController {

    override fun getErrorPath(): String {
        return "error"
    }

    @RequestMapping
    fun error(req: HttpServletRequest?, modelAndView: ModelAndView): ModelAndView? {

        modelAndView.status = HttpStatus.NOT_FOUND

        modelAndView.viewName = "public/system/error"
        return modelAndView
    }


}