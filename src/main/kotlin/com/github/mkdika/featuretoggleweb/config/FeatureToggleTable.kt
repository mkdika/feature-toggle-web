package com.github.mkdika.featuretoggleweb.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@Component
@ConfigurationProperties(prefix = "feature-toggle-table")
data class FeatureToggleTable(
    val name: String = "",
    val key: String = "",
    val value: Boolean = false
)

