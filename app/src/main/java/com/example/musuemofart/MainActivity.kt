package com.example.musuemofart

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.material.icons.outlined.ArrowForward
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.musuemofart.ui.theme.MusuemOfArtTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MusuemOfArtTheme {
                // A surface container using the 'background' color from the theme
                MainScreen()
            }
        }
    }
}

@Composable
fun MainScreen(
    modifier: Modifier = Modifier
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.beige))
    ) {
        ImageCompose(
            drawableResource = R.drawable.dice_3,
            contentDecriptionId = R.string.art_picture
        )
        Spacer(modifier.height(16.dp))
        ImageDescription()
        Spacer(modifier.height(16.dp))
        Buttons()
    }
}

@Composable
fun ImageCompose(
    drawableResource: Int,
    contentDecriptionId: Int,
    modifier: Modifier = Modifier
) {
    Image(
        painter = painterResource(drawableResource),
        contentDescription = stringResource(id = contentDecriptionId),
        modifier
            .size(250.dp)
            .clip(CircleShape)
            .border(
                2.dp, Color.Black, CircleShape
            )
            .padding(16.dp)
    )
}

@Composable
fun ImageDescription(
    modifier: Modifier = Modifier
) {
    Text(
        text = "Art Name"
        )
    Spacer(modifier = Modifier.height(4.dp))
    Text(
        text = "Artist / (Year)"
    )
}

@Composable
fun Buttons(
    modifier: Modifier = Modifier
){
    Row (
        horizontalArrangement = Arrangement.SpaceEvenly
            ) {
        Button(
            onClick = { /*TODO*/ },
            modifier
                .padding(end = 16.dp)
        ) {
            Icon(
                Icons.Outlined.ArrowBack,
                contentDescription = null,
                modifier.size(ButtonDefaults.IconSize)
            )
           Text(text = "Previous") 
        }

        Button(
            onClick = { /*TODO*/ },
            modifier
                .padding(start = 16.dp)
        ) {
            Text(text = "Next")
            Icon(
                Icons.Outlined.ArrowForward,
                contentDescription = null,
                modifier.size(ButtonDefaults.IconSize)
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MusuemOfArtTheme {
        MainScreen()
    }
}