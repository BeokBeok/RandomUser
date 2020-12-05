package com.beok.randomuser.data.source.local

import androidx.room.Dao
import androidx.room.Query
import com.beok.randomuser.base.BaseDao
import com.beok.randomuser.data.entity.RandomUserTable

@Dao
interface RandomUserDao : BaseDao<RandomUserTable> {

    @Query("SELECT * FROM user WHERE :name = name")
    suspend fun findUserByName(name: String): RandomUserTable
}
