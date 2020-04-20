package com.github.mkdika.featuretoggleweb.model

import javax.validation.constraints.NotEmpty

data class FeatureToggle(
    @NotEmpty
    val key: String,
    @NotEmpty
    val value: String
)