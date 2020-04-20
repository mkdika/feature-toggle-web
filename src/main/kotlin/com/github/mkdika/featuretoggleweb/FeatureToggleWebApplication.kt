package com.github.mkdika.featuretoggleweb

import com.github.mkdika.featuretoggleweb.config.FeatureToggleTable
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(FeatureToggleTable::class)
class FeatureToggleWebApplication

fun main(args: Array<String>) {
	runApplication<FeatureToggleWebApplication>(*args)
}
