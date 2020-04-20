package com.github.mkdika.featuretoggleweb.repository

import com.github.mkdika.featuretoggleweb.model.FeatureToggle
import org.springframework.stereotype.Repository

interface FeatureToggleRepository {
    fun findAll(): List<FeatureToggle>
    fun create(featureToggle: FeatureToggle): FeatureToggle
    fun toggle(key: String): FeatureToggle
    fun delete(key: String): Boolean
}