package com.github.mkdika.featuretoggleweb.repository

import com.github.mkdika.featuretoggleweb.model.FeatureToggle
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate
import org.springframework.stereotype.Repository

@Repository
class PostgresqlFeatureToggleImpl(
    private val namedJdbcTemplate: NamedParameterJdbcTemplate
) : FeatureToggleRepository {

    override fun findAll(): List<FeatureToggle> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun create(featureToggle: FeatureToggle): FeatureToggle {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun toggle(key: String): FeatureToggle {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun delete(key: String): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}