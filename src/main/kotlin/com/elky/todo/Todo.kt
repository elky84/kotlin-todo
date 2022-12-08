package com.elky.todo

import jakarta.persistence.*

@Entity
@Table(name = "todo")
class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

    var title: String? = null
    var description: String? = null
    var finished: Boolean? = false
}