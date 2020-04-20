package com.github.mkdika.featuretoggleweb.controller

import com.github.mkdika.featuretoggleweb.repository.FeatureToggleRepository
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping(value = arrayOf("", "/", "index"))
class FeatureToggleController(
    repository: FeatureToggleRepository
) {

    @GetMapping
    fun index(model: Model): String {
        model.addAttribute("name", "Maikel Chandika")
        return "feature-toggle/index"
    }

    @GetMapping(value = ["/new"])
    fun new(): String {
        return "feature-toggle/new"
    }

    @GetMapping(value = ["/{key}/toggle"])
    fun toggle(@PathVariable(value = "key") key: String): String {
        return "feature-toggle/index"
    }

    @GetMapping(value = ["/{key}/delete"])
    fun delete(@PathVariable(value = "key") key: String): String {
        return "feature-toggle/index"
    }
}