package com.example.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose.ui.theme.ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) { }
                    HeadImage(
                        text1 = stringResource(R.string.title),
                        text2 = stringResource(R.string.p1),
                        text3 = stringResource(R.string.p2),
                    )
                }
            }
        }
    }


@Composable
fun HeadImage(text1: String,text2: String,text3: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.bg_compose_background)

    Column(
        modifier = modifier
            .background(Color.White)
            .fillMaxSize()
    ) {
        Image(
            painter = image,
            contentDescription = "HEADING IMAGE",
            contentScale = ContentScale.FillWidth
        )
        Text(
            text = text1,
            fontSize = 24.sp,
            textAlign = TextAlign.Start,
            modifier = Modifier.padding(16.dp)
        )

        Text(
            text = text2,
            textAlign = TextAlign.Justify,
            lineHeight = 20.sp,
            modifier = Modifier.padding(start = 16.dp,end=16.dp)
        )

        Text(
            text = text3,
            textAlign = TextAlign.Justify,
            lineHeight = 20.sp,
            modifier = Modifier.padding(16.dp)

        )
    }

}



@Preview(name = "compose", showBackground = true)
@Composable
fun ComposePreview() {
    ComposeTheme {
        HeadImage(
            text1 = stringResource(R.string.title),
            text2 = stringResource(R.string.p1),
            text3 = stringResource(R.string.p2)
        )
    }
}