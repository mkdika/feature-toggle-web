package com.github.mkdika.featuretoggleweb.integrationtest.util

import com.github.mkdika.featuretoggleweb.config.FeatureToggleTable
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Component

@Component
class PostgresqlUtil {

    @Autowired
    private lateinit var jdbcTemplate: JdbcTemplate

    @Autowired
    private lateinit var table: FeatureToggleTable

    fun clearFeatureToggleData() {
        val sql = """
                  delete from ${table.name};
                  """
        jdbcTemplate.execute(sql)
    }

    fun insertFeatureToggleData(key: String, value: Boolean) {
        val sql = """
                  insert into ${table.name}(${table.key}, ${table.value})
                  values (?,?);
        """.trimIndent()

        jdbcTemplate.update(sql,
            key,
            value
        )
    }

}