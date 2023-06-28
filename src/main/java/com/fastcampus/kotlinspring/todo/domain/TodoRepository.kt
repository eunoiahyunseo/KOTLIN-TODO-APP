package com.fastcampus.kotlinspring.todo.domain

import org.springframework.data.jpa.repository.JpaRepository

/**
 * @author ihyeonseo
 */
interface TodoRepository: JpaRepository<Todo, Long> {
    fun findAllByDoneIsFalseOrderByIdDesc(): List<Todo>?
}