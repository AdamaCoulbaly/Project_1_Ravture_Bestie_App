package com.example.project_1_ravture_bestie_app.model
import java.util.regex.Pattern

//class EmailChecker:TextFieldChecker(validator= :: isEmailValid, errorMessage=) {

//}

//Email validation
private const val EMAIL_VALIDATION_REGX = "^(.+)@(.+)\$"

private fun isEmailValid(email: String): Boolean {
return Pattern.matches(EMAIL_VALIDATION_REGX,email)
}


