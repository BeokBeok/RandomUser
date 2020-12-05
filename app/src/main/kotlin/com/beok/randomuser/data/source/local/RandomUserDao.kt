package com.beok.randomuser.data.source.local

import androidx.room.Dao
import com.beok.randomuser.base.BaseDao
import com.beok.randomuser.data.entity.RandomUserTable

@Dao
interface RandomUserDao : BaseDao<RandomUserTable>
