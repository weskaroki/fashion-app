package com.wes.sleekfashion.models

class User {
    var email :String = ""
    var pass: String= ""
    var userid : String = "0"

    constructor(email:String,pass:String,userid:String){
        this.email =email
        this.pass = pass
        this.userid =userid
    }
    constructor()
}
