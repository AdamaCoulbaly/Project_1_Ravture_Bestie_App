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
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
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
        //.background(colorResource(id = R.color.colorPrimary))
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
@Preview(showBackground = true)
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
            //.background(colorResource(id = R.color.purple_700))
            .background(Color.DarkGray)
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
                placeholder = {Text(text="", color = Color.White, style = TextStyle(fontWeight = FontWeight.Bold, letterSpacing = TextUnit.Unspecified,color = Color.White),
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
                modifier = Modifier
                    .fillMaxWidth(0.8f)
                    .height(50.dp)
                    .background(Color.Blue)
            ){
                Text(text="Submit", color = Color.White, style = TextStyle(fontWeight = FontWeight.Bold, letterSpacing = TextUnit.Unspecified),
                    fontSize = TextUnit.Unspecified)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun InfoScreenPreview(){
    InfoScreen()
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
            .fillMaxWidth()
            .fillMaxHeight(15.60f)
            .clip(RoundedCornerShape(30.dp, 0.dp))
            .background(Color.DarkGray)
            //.background(colorResource(id = R.color.teal_200))
            .wrapContentSize(Alignment.Center)
            .padding(10.dp)
    ){
        Text(
            text="Sign In",
            fontWeight = FontWeight.Bold,
            color= Color.White,
            modifier = Modifier.align(Alignment.CenterHorizontally),
            textAlign = TextAlign.Center,
            fontSize = 25.sp
        )
        Spacer(modifier = Modifier.padding(10.dp))
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            OutlinedTextField(value = emailAddress.value, onValueChange = {emailAddress.value=it},
                label = {Text(text="Email Address", color = Color.White, style = TextStyle(fontWeight = FontWeight.Bold, letterSpacing = TextUnit.Unspecified),
                    fontSize = TextUnit.Unspecified)},
                placeholder = {Text(text="Email Address", color = Color.White, style = TextStyle(fontWeight = FontWeight.Bold, letterSpacing = TextUnit.Unspecified),
                    fontSize = TextUnit.Unspecified)},
                singleLine = true,
                modifier = Modifier.fillMaxWidth(0.8f))
            OutlinedTextField(value = password.value, onValueChange = {password.value=it},
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
            Button(onClick = {},
                modifier = Modifier
                    .fillMaxWidth(0.8f)
                    .height(50.dp)
                    .background(Color.Blue)
            ){
                Text(text="Sign in", color = Color.White, style = TextStyle(fontWeight = FontWeight.Bold, letterSpacing = TextUnit.Unspecified),
                    fontSize = TextUnit.Unspecified)
            }
            Spacer(modifier = Modifier.padding(20.dp))
            Text(text="", color = Color.White, style = TextStyle(fontWeight = FontWeight.Bold, letterSpacing = TextUnit.Unspecified),
                fontSize = TextUnit.Companion.Unspecified,modifier = Modifier.clickable (onClick = {} ))
            Spacer(modifier = Modifier.padding(20.dp))


        }
    }
}
@Preview(showBackground = true)
@Composable
fun SignInScreenPreview(){
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
            .fillMaxWidth()
            .fillMaxHeight(15.60f)
            .clip(RoundedCornerShape(30.dp, 0.dp))
            .background(Color.DarkGray)
            //.background(colorResource(id = R.color.teal_200))
            .wrapContentSize(Alignment.Center)
            .padding(10.dp)
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
                modifier = Modifier
                    .fillMaxWidth(0.8f)
                    .height(50.dp)
                    .background(Color.Blue)
            ){
                Text(text="Sign Up", color = Color.White, style = TextStyle(fontWeight = FontWeight.Bold, letterSpacing = TextUnit.Unspecified),
                    fontSize = TextUnit.Companion.Unspecified)
            }
            Spacer(modifier = Modifier.padding(20.dp))
            Text(text="Thank you",color = Color.White, style = TextStyle(fontWeight = FontWeight.Bold, letterSpacing = TextUnit.Unspecified),
                fontSize = TextUnit.Companion.Unspecified, modifier = Modifier.clickable (onClick = {} ))
            Spacer(modifier = Modifier.padding(20.dp))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SignUpScreenPreview() {
    SignUpScreen()
}
