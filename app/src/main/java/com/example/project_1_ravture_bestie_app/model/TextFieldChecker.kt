package com.example.project_1_ravture_bestie_app.model

open class TextFieldChecker(
    private val validator:(String)->Boolean={true},
    private val errorMessage:(String)->String
) {


}