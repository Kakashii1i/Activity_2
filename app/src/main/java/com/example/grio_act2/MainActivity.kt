package com.example.grio_act2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight
import com.example.grio_act2.ui.theme.Griño_Act2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Griño_Act2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CenterContent {
                        Image(
                            painter = painterResource(id = R.drawable.verification),
                            contentDescription = null,
                            modifier = Modifier.size(150.dp),
                        )
                        Column(
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier.padding(16.dp)
                        ) {
                            Greeting(
                                "ALL TASKS COMPLETED!",
                                fontSize = 23.sp,
                                fontWeight = FontWeight.Bold,
                                paddingTop = 190.dp,
                                paddingBottom = 5.dp
                            )
                            Greeting(
                                "Nice Work!",
                                fontSize = 16.sp,
                                paddingTop = 10.dp
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun CenterContent(content: @Composable () -> Unit) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        content()
    }
}

@Composable
fun Greeting(
    text: String,
    fontSize: androidx.compose.ui.unit.TextUnit,
    fontWeight: FontWeight? = null,
    paddingTop: androidx.compose.ui.unit.Dp = 0.dp,
    paddingBottom: androidx.compose.ui.unit.Dp = 0.dp
) {
    Text(
        text = text,
        fontSize = fontSize,
        fontWeight = fontWeight,
        modifier = Modifier.padding(
            top = paddingTop,
            bottom = paddingBottom
        )
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Griño_Act2Theme {
        Greeting("Android", fontSize = 16.sp)
    }
}
