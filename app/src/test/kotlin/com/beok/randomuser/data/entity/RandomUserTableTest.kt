package com.beok.randomuser.data.entity

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RandomUserTableTest {

    @Test
    fun `ResultsItem 을 Table 로 변환합니다`() {
        val resultsItem = ResultsItem(
            name = Name(last = "현석", title = "개발자", first = "강"),
        )
        val result = RandomUserTable.mapToTable(resultsItem)
        assertThat("개발자 강 현석").isEqualTo(result.name)
    }
}
