package com.beok.randomuser.main

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.beok.randomuser.data.RandomUserRepository
import kotlinx.coroutines.launch

class MainViewModel @ViewModelInject constructor(
    private val repository: RandomUserRepository
) : ViewModel() {

    private val _users = MutableLiveData<List<UserItem>>()
    val users: LiveData<List<UserItem>> get() = _users

    fun fetchUsers(numberOfUser: Int) = viewModelScope.launch {
        _users.value = repository.fetchUsers(numberOfUser = numberOfUser)
            .getOrNull()
            ?.results
            ?.map(UserItem::toItem)
            ?: emptyList()
    }
}
