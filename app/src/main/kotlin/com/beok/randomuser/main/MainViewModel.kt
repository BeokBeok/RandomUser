package com.beok.randomuser.main

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.beok.randomuser.data.RandomUserRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class MainViewModel @ViewModelInject constructor(
    private val repository: RandomUserRepository
) : ViewModel() {

    private val _users = MutableStateFlow<List<UserItem>>(emptyList())
    val users: StateFlow<List<UserItem>> get() = _users

    fun fetchUsers(numberOfUser: Int) = viewModelScope.launch {
        _users.value = repository.fetchUsers(numberOfUser = numberOfUser)
            .getOrNull()
            ?.results
            ?.map(UserItem::toItem)
            ?: emptyList()
    }
}
