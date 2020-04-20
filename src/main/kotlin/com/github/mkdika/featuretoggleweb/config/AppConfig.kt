package com.github.mkdika.featuretoggleweb.config

import com.github.mkdika.featuretoggleweb.repository.FeatureToggleRepository
import com.github.mkdika.featuretoggleweb.repository.PostgresqlFeatureToggleImpl
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate

@Configuration
class AppConfig {

    @Bean
    fun featureToggleRepository(namedParameterJdbcTemplate: NamedParameterJdbcTemplate): FeatureToggleRepository {
        return PostgresqlFeatureToggleImpl(namedParameterJdbcTemplate)
    }
}