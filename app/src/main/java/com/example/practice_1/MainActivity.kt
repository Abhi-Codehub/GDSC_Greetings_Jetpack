package com.example.practice_1

import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.practice_1.ui.theme.Practice_1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Practice_1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BirthdayGreetingWithImage(message = "Happy Birthday Abhishek", from = "From GDSC")
                }
            }
        }
    }
}

@Composable
fun BirthdayGreetingWithImage(message: String, from: String){
    val image = painterResource(id = R.drawable.birthday_gdsc)
    Box() {
        Image(painter = image, contentDescription = null,
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth(),
        contentScale = ContentScale.Crop)
        BirthdayGreetingWithText(message = message, from = from)
    }
}

@Composable
fun BirthdayGreetingWithText(message: String, from: String){
    Column() {
        Text(text = message, fontSize = 30.sp,
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentWidth(align = CenterHorizontally)
            .padding(top = 550.dp)
        )
        Text(text = from, fontSize = 24.sp,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(align = CenterHorizontally))
    }
}

@Preview(showBackground = true)
@Composable
fun BirthdayGreetingWithImagePreview() {
    Practice_1Theme {
        BirthdayGreetingWithImage(message = "Happy Birthday Abhishek", from = "From GDSC")

    }
}