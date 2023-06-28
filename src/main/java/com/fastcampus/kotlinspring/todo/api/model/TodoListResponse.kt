package com.fastcampus.kotlinspring.todo.api.model

import com.fastcampus.kotlinspring.todo.domain.Todo
import com.fasterxml.jackson.annotation.JsonIgnore

/**
 * @author ihyeonseo
 */
data class TodoListResponse(
    val items: List<TodoResponse>,
) {
    val size: Int
        @JsonIgnore
        get() = items.size

    fun get(index: Int) = items[index]

    companion object {
        fun of (todoList: List<Todo>) =
            TodoListResponse(todoList.map(TodoResponse::of))
    }
}