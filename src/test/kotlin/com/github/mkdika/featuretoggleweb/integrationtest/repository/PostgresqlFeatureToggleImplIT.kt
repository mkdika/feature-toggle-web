package com.github.mkdika.featuretoggleweb.integrationtest.repository

import com.github.mkdika.featuretoggleweb.integrationtest.util.PostgresqlUtil
import com.github.mkdika.featuretoggleweb.repository.FeatureToggleRepository
import org.junit.Assert.assertTrue
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
class PostgresqlFeatureToggleImplIT {

    @Autowired
    private lateinit var postgresqlUtil: PostgresqlUtil

    @Autowired
    private lateinit var repository: FeatureToggleRepository

    @Test
    fun `when findAll should return all available data`() {
        postgresqlUtil.insertFeatureToggleData("sample-ping", true)
        postgresqlUtil.insertFeatureToggleData("sample-abc", true)

        val result = repository.findAll()
        assertTrue(result.isNotEmpty())
    }
}