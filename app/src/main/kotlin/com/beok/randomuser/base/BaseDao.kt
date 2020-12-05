package com.beok.randomuser.base

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Update

interface BaseDao<T> {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(obj: T)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(obj: List<T>)

    @Update
    fun update(obj: T)

    @Delete
    fun delete(obj: T)
}
