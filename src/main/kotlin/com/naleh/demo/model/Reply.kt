package com.naleh.demo.model


class Pointer(val user: User,val address:String)
class Reply(val text:String,
            val pointer:Pointer?,
            val user: User
            )
