package com.naleh.demo.model


data class UserDAO(val username:String,
           val password:String,
           val name:String,
           val lastname:String,
           val email:String,
           val birthday: String,
           val join:String,
           val gender:Boolean,
           val phone:String?=null
           )


class User(val username:String,
              val name:String,
              val lastname:String, )