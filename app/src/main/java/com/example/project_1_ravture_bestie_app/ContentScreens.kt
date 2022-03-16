package com.example.project_1_ravture_bestie_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.project_1_ravture_bestie_app.ui.theme.Project_1_Ravture_Bestie_AppTheme

class ContentScreens : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Project_1_Ravture_Bestie_AppTheme {
                // A surface container using the 'background' color from the theme

            }
        }
    }
}


@Composable
fun HomeScreen(){
    Column( horizontalAlignment=Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(0.dp)
            .background(colorResource(id = R.color.white))
        //.wrapContentSize(Alignment.Center)
    ) {
        Card(
            elevation = 15.dp
        ){
            Image(painter= painterResource(id = R.drawable.backgroung), contentDescription = null)
            Column(modifier=Modifier
                .padding(5.dp)){
                Text(
                    text = "Welcome!",
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    modifier = Modifier.align(Alignment.CenterHorizontally),
                    textAlign = TextAlign.Center,
                    fontSize = 25.sp
                )
            }
        }

    }
}
@Preview(showSystemUi = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen()
}

@Composable
fun InfoScreen(){
    val FirstName = remember{ mutableStateOf("")}
    val LastName = remember{ mutableStateOf("")}
    val EmailAdrres = remember{ mutableStateOf("")}
    val Message = remember{ mutableStateOf("")}

    Column(
        modifier= Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.BestieSecondaryBackground))
            .wrapContentSize(Alignment.Center)
    ){
        Text(
            text="Contact Us",
            fontWeight = FontWeight.Bold,
            color= Color.White,
            modifier = Modifier.align(Alignment.CenterHorizontally),
            textAlign = TextAlign.Center,
            fontSize = 25.sp
        )
        Spacer(modifier = Modifier.padding(10.dp))
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            OutlinedTextField(value = FirstName.value, onValueChange = {FirstName.value=it},
                label = {Text(text="First Name", color = Color.White, style = TextStyle(fontWeight = FontWeight.Bold, letterSpacing = TextUnit.Unspecified),
                    fontSize = TextUnit.Unspecified)},
                placeholder = {Text(text="First Name", color = Color.White, style = TextStyle(fontWeight = FontWeight.Bold, letterSpacing = TextUnit.Unspecified,color = Color.White),
                    fontSize = TextUnit.Unspecified)},
                singleLine = true,
                modifier = Modifier.fillMaxWidth(0.8f))
            //Spacer(modifier = Modifier.padding(10.dp))
            OutlinedTextField(value = LastName.value, onValueChange = {LastName.value=it},
                label = {Text(text="Last Name", color = Color.White, style = TextStyle(fontWeight = FontWeight.Bold, letterSpacing = TextUnit.Unspecified),
                    fontSize = TextUnit.Unspecified)},
                placeholder = {Text(text="Last Name", color = Color.White, style = TextStyle(fontWeight = FontWeight.Bold, letterSpacing = TextUnit.Unspecified),
                    fontSize = TextUnit.Unspecified)},
                singleLine = true,
                modifier = Modifier.fillMaxWidth(0.8f))
            //Spacer(modifier = Modifier.padding(10.dp))
            OutlinedTextField(value = Message.value, onValueChange = {Message.value=it},
                label = {Text(text="Message", color = Color.White, style = TextStyle(fontWeight = FontWeight.Bold, letterSpacing = TextUnit.Unspecified),
                    fontSize = TextUnit.Unspecified)},
                placeholder = {Text(text="Message", color = Color.White, style = TextStyle(fontWeight = FontWeight.Bold, letterSpacing = TextUnit.Unspecified),
                    fontSize = TextUnit.Unspecified)},
                singleLine = true,
                modifier = Modifier.fillMaxWidth(0.8f))
            Spacer(modifier = Modifier.padding(10.dp))
            Button(onClick = {},
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.White,
                    contentColor = Color.Red),
                modifier = Modifier
                    .fillMaxWidth(0.8f)
                    .height(50.dp)
                    .background(Color.Black)

            ){
                Text(text="Submit", color = Color.Black, style = TextStyle(fontWeight = FontWeight.Bold, letterSpacing = TextUnit.Unspecified),
                    fontSize = TextUnit.Unspecified)
            }
        }
    }
}

@Preview(showSystemUi=true)
@Composable
fun InfoScreenPreview(){
    InfoScreen()
}


//Login Control Method
fun LoginCheck(userEmail:String,userPassword:String):String{
    var status:String=""
    if(userEmail.equals("ada@ada.com")&&userPassword.equals("adama")){
        status="Login Successful"
    }else{
        status="Login UnSuccessful"
    }
    return status
}

//SignUp Method
fun SignUpSaver(firstName:String, lastName:String,EmailAddress:String, Password:String, Password2:String):String{
    var regStatus:String=""
    if(firstName.isEmpty()||firstName.isBlank()){
        regStatus="First Name is required witn no space"
    }else if(lastName.isEmpty()||lastName.isBlank()){
        regStatus="Last Name is required witn no space"
    }else if(EmailAddress.isEmpty()||EmailAddress.isBlank()){
        regStatus="Email Address is required witn no space"
    }else if(Password.isEmpty()||Password.isBlank()){
        regStatus="Password is required witn no space"
    }else if(Password2.isEmpty()||Password2.isBlank()){
        regStatus="Second Password is required witn no space"
    }else if(Password!=Password2){
        regStatus="Paswords must be the same"
    }else{
        regStatus="SignedUp Successful"
    }
        return regStatus
}

@Composable
fun SignInScreen(){
    val context = LocalContext.current
    //val image = Image(painter = painterResource(id = R.drawable.project1backgroung), contentDescription = null)
    val emailAddress = remember{ mutableStateOf("")}
    val password = remember{ mutableStateOf("")}
    val passwordVisibilty = remember{ mutableStateOf(false)}
    val focusRequester: FocusRequester = remember { FocusRequester() }
    val scrollState= rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.BestieSecondaryBackground))
            .wrapContentSize(Alignment.Center)
    ){
        Text(
            text="Sign In",
            fontWeight = FontWeight.Bold,
            color= Color.White,
            modifier = Modifier.align(Alignment.CenterHorizontally),
            textAlign = TextAlign.Center,
            fontSize = 25.sp
        )
            var emailAddress by rememberSaveable{mutableStateOf("")}
            var Password by rememberSaveable{mutableStateOf("")}
        Spacer(modifier = Modifier.padding(10.dp))
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            OutlinedTextField(value = emailAddress, onValueChange = {emailAddress=it},
                label = {Text(text="Email Address", color = Color.White, style = TextStyle(fontWeight = FontWeight.Bold, letterSpacing = TextUnit.Unspecified),
                    fontSize = TextUnit.Unspecified)},
                placeholder = {Text(text="Email Address", color = Color.White, style = TextStyle(fontWeight = FontWeight.Bold, letterSpacing = TextUnit.Unspecified),
                    fontSize = TextUnit.Unspecified)},
                singleLine = true,
                modifier = Modifier.fillMaxWidth(0.8f))
            OutlinedTextField(value = Password, onValueChange = {Password=it},
                trailingIcon = {
                    IconButton(onClick = { /*TODO*/
                        passwordVisibilty.value= !passwordVisibilty.value
                    }) {

                        Image(painterResource(id = R.drawable.eye_password), contentDescription = null)
                        if(passwordVisibilty.value) Color.Red else Color.Gray
                    }
                },
                label = {Text(text="Password", color = Color.White, style = TextStyle(fontWeight = FontWeight.Bold, letterSpacing = TextUnit.Unspecified),
                    fontSize = TextUnit.Unspecified)},
                placeholder = {Text(text="Password", color = Color.White, style = TextStyle(fontWeight = FontWeight.Bold, letterSpacing = TextUnit.Unspecified),
                    fontSize = TextUnit.Unspecified)},
                singleLine = true,
                visualTransformation = if(passwordVisibilty.value) VisualTransformation.None
                else PasswordVisualTransformation(),
                modifier = Modifier.fillMaxWidth(0.8f)
            )
            Spacer(modifier = Modifier.padding(10.dp))

            //Email and Password Check Button
            var status by rememberSaveable{mutableStateOf("")}
            Button(onClick = {status=LoginCheck(emailAddress, Password)},
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.White,
                    contentColor = Color.Red),
                modifier = Modifier
                    .fillMaxWidth(0.8f)
                    .height(50.dp)
                    .background(colorResource(id = R.color.BestieSecondaryBackground))
            ){  //Text(text = "$status")
                Text(text="Login", color = Color.Black, style = TextStyle(fontWeight = FontWeight.Bold, letterSpacing = TextUnit.Unspecified),
                   fontSize = TextUnit.Unspecified)
            }
            Spacer(modifier = Modifier.padding(20.dp))
            Text(text="$status", color = Color.Red, style = TextStyle(fontWeight = FontWeight.Bold, letterSpacing = TextUnit.Unspecified),
                fontSize = TextUnit.Companion.Unspecified,modifier = Modifier.clickable (onClick = {} ))
            Spacer(modifier = Modifier.padding(20.dp))


        }
    }
}
@Preview(showSystemUi = true)
@Composable
fun SignInScreenPreview(){
    SignInScreen()
}

@Composable
fun SignUpScreen() {
    val firstName = remember{ mutableStateOf("")}
    val lastName = remember{ mutableStateOf("")}
    val Email = remember{ mutableStateOf("")}
    val password = remember{ mutableStateOf("")}
    val confirmPassword = remember{ mutableStateOf("")}

    val passwordVisibilty = remember{ mutableStateOf(false)}
    val confirmationOfPasswordVisibilty = remember{ mutableStateOf(false)}

    val scrollSate= rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.BestieSecondaryBackground))
            .wrapContentSize(Alignment.Center)
    ) {
        Text(
            text="Sign Up", fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier.align(Alignment.CenterHorizontally),
            textAlign = TextAlign.Center,
            fontSize = 25.sp
        )
        Spacer(modifier = Modifier.padding(10.dp))
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            OutlinedTextField(value = firstName.value, onValueChange = {firstName.value=it},
                label = {Text(text="First Name", color = Color.White, style = TextStyle(fontWeight = FontWeight.Bold, letterSpacing = TextUnit.Unspecified),
                    fontSize = TextUnit.Companion.Unspecified)},
                placeholder = {Text(text="First Name", color = Color.White, style = TextStyle(fontWeight = FontWeight.Bold, letterSpacing = TextUnit.Unspecified),
                    fontSize = TextUnit.Companion.Unspecified )},
                singleLine = true,
                modifier = Modifier.fillMaxWidth(0.8f))
            OutlinedTextField(value = lastName.value, onValueChange = {lastName.value=it},
                label = {Text(text="Last Name", color = Color.White, style = TextStyle(fontWeight = FontWeight.Bold, letterSpacing = TextUnit.Unspecified),
                    fontSize = TextUnit.Companion.Unspecified)},
                placeholder = {Text(text="Last Name", color = Color.White, style = TextStyle(fontWeight = FontWeight.Bold, letterSpacing = TextUnit.Unspecified),
                    fontSize = TextUnit.Companion.Unspecified)},
                singleLine = true,
                modifier = Modifier.fillMaxWidth(0.8f))
            OutlinedTextField(value = Email.value, onValueChange = {Email.value=it},
                label = {Text(text="Email Address", color = Color.White, style = TextStyle(fontWeight = FontWeight.Bold, letterSpacing = TextUnit.Unspecified),
                    fontSize = TextUnit.Companion.Unspecified)},
                placeholder = {Text(text="Email Address", color = Color.White, style = TextStyle(fontWeight = FontWeight.Bold, letterSpacing = TextUnit.Unspecified),
                    fontSize = TextUnit.Companion.Unspecified)},
                singleLine = true,
                modifier = Modifier.fillMaxWidth(0.8f))

            OutlinedTextField(value = password.value, onValueChange = {password.value=it},
                label = {Text(text="Password", color = Color.White, style = TextStyle(fontWeight = FontWeight.Bold, letterSpacing = TextUnit.Unspecified),
                    fontSize = TextUnit.Companion.Unspecified)},
                placeholder = {Text(text="Password", color = Color.White, style = TextStyle(fontWeight = FontWeight.Bold, letterSpacing = TextUnit.Unspecified),
                    fontSize = TextUnit.Companion.Unspecified)},
                singleLine = true,
                modifier = Modifier.fillMaxWidth(0.8f),
                trailingIcon = {
                    IconButton(onClick = { /*TODO*/
                        passwordVisibilty.value= !passwordVisibilty.value
                    }) {

                        Image(painterResource(id = R.drawable.eye_password), contentDescription = null)
                        if(passwordVisibilty.value) Color.Red else Color.Gray
                    }
                },
                visualTransformation = if(passwordVisibilty.value) VisualTransformation.None
                else PasswordVisualTransformation()
            )

            OutlinedTextField(value = confirmPassword.value, onValueChange = {confirmPassword.value=it},
                label = {Text(text="Password Confirmation", color = Color.White, style = TextStyle(fontWeight = FontWeight.Bold, letterSpacing = TextUnit.Unspecified),
                    fontSize = TextUnit.Companion.Unspecified)},
                placeholder = {Text(text="Password Confirmation", color = Color.White, style = TextStyle(fontWeight = FontWeight.Bold, letterSpacing = TextUnit.Unspecified),
                    fontSize = TextUnit.Companion.Unspecified)},
                singleLine = true,
                modifier = Modifier.fillMaxWidth(0.8f),
                trailingIcon = {
                    IconButton(onClick = {
                        confirmationOfPasswordVisibilty.value= !confirmationOfPasswordVisibilty.value
                    }) {

                        Image(painterResource(id = R.drawable.eye_password), contentDescription = null)
                        if(confirmationOfPasswordVisibilty.value) Color.Red else Color.Gray
                    }
                },
                visualTransformation = if(confirmationOfPasswordVisibilty.value) VisualTransformation.None
                else PasswordVisualTransformation()
            )

            Spacer(modifier = Modifier.padding(10.dp))
            Button(onClick = {},
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.White,
                    contentColor = Color.White),
                modifier = Modifier
                    .fillMaxWidth(0.8f)
                    .height(50.dp)
                    .background(Color.Black)
            ){
                Text(text="Sign Up", color = Color.Black, style = TextStyle(fontWeight = FontWeight.Bold, letterSpacing = TextUnit.Unspecified),
                    fontSize = TextUnit.Companion.Unspecified)
            }
            Spacer(modifier = Modifier.padding(20.dp))
            Text(text="Thank you",color = Color.White, style = TextStyle(fontWeight = FontWeight.Bold, letterSpacing = TextUnit.Unspecified),
                fontSize = TextUnit.Companion.Unspecified, modifier = Modifier.clickable (onClick = {} ))
            Spacer(modifier = Modifier.padding(20.dp))
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun SignUpScreenPreview() {
    SignUpScreen()
}
