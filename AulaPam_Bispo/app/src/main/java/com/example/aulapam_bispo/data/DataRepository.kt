package com.example.aulapam_bispo.data

val userDefault = User(
    userId = "aluno",
    name = "Aluo DS",
    avatarUrl = null,
    age = 16,
    score = 75,
    registerDate = "20/03/2025",
    email = "aluno@etec.sp.gov.br",
    bio = "Estou aprendendo passar parametros no JETPACK",
)

val marcelo = User(

    userId = "Marcelo",
    name = "Marcelo",
    avatarUrl = null,
    age = 51,
    score = 90,
    registerDate = "15/06/1973",
    email = "marcelo.collado@etec.sp.gov.br",
    bio = "Pasei os parametros de usuarios",
)

fun getUserData(userName: String): User {
    return if (userName == "Marcelo"){
        marcelo
    } else{
        userDefault
        }
    }
