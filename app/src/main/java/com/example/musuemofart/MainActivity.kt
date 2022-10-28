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
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
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
fun MainScreen() {
    var state by remember {
        mutableStateOf(0)
    }

    when (state) {
        0 -> {
            ImageWithTextAndButtons(
                drawableResourceId = R.drawable._07381139_10218677195345223_3882050316924428690_n,
                contentDescriptionId = R.string.tunji,
                textResourceId = R.string.tunji,
                textResourceId2 = R.string.vancouver,
                onNextClick = {
                    state++
                },
                onPreviousClick = {
                    state = 9
                }
            )
        }
        1 -> {
            ImageWithTextAndButtons(
                drawableResourceId = R.drawable._09402599_10167412550900112_1354556559142952108_n,
                contentDescriptionId = R.string.james,
                textResourceId = R.string.james,
                textResourceId2 = R.string.vancouver,
                onNextClick = {
                    state++
                },
                onPreviousClick = {
                    state--
                }
            )
        }
        2 -> {
            ImageWithTextAndButtons(
                drawableResourceId = R.drawable._1543761_10160381216315344_7967030339690299392_n,
                contentDescriptionId = R.string.hodson,
                textResourceId = R.string.hodson,
                textResourceId2 = R.string.calgary,
                onNextClick = {
                    state++
                },
                onPreviousClick = {
                    state--
                }
            )
        }
        3 -> {
            ImageWithTextAndButtons(
                drawableResourceId = R.drawable._25789641_1769567636545738_6509833137908307045_n,
                contentDescriptionId = R.string.jerome,
                textResourceId = R.string.jerome,
                textResourceId2 = R.string.florida,
                onNextClick = {
                    state++
                },
                onPreviousClick = {
                    state--
                }
            )
        }
        4 -> {
            ImageWithTextAndButtons(
                drawableResourceId = R.drawable._49252568_4751062618278989_1019648691388204207_n,
                contentDescriptionId = R.string.dey,
                textResourceId = R.string.dey,
                textResourceId2 = R.string.surrey,
                onNextClick = {
                    state++
                },
                onPreviousClick = {
                    state--
                }
            )
        }
        5 -> {
            ImageWithTextAndButtons(
                drawableResourceId = R.drawable._5861028_2094453907274873_8393797561739116544_n,
                contentDescriptionId = R.string.patrick,
                textResourceId = R.string.patrick,
                textResourceId2 = R.string.sask,
                onNextClick = {
                    state++
                },
                onPreviousClick = {
                    state--
                }
            )
        }
        6 -> {
            ImageWithTextAndButtons(
                drawableResourceId = R.drawable._91094168_10227950187329109_6485941001199073343_n,
                contentDescriptionId = R.string.nathan,
                textResourceId = R.string.nathan,
                textResourceId2 = R.string.pittmeadows,
                onNextClick = {
                    state++
                },
                onPreviousClick = {
                    state--
                }
            )
        }
        7 -> {
            ImageWithTextAndButtons(
                drawableResourceId = R.drawable._9753806_10155992341962484_2049772545015545856_n,
                contentDescriptionId = R.string.benjamin,
                textResourceId = R.string.benjamin,
                textResourceId2 = R.string.coquitlam,
                onNextClick = {
                    state++
                },
                onPreviousClick = {
                    state--
                }
            )
        }
        8 -> {
            ImageWithTextAndButtons(
                drawableResourceId = R.drawable._9942042_10162307101790343_5053502780111585280_n,
                contentDescriptionId = R.string.nicholas,
                textResourceId = R.string.nicholas,
                textResourceId2 = R.string.coquitlam,
                onNextClick = {
                    state++
                },
                onPreviousClick = {
                    state--
                }
            )
        }
        9 -> {
            ImageWithTextAndButtons(
                drawableResourceId = R.drawable._94816709_6150304014984888_5584182100884946533_n,
                contentDescriptionId = R.string.lea,
                textResourceId = R.string.lea,
                textResourceId2 = R.string.surrey,
                onNextClick = {
                    state = 0
                },
                onPreviousClick = {
                    state--
                }
            )
        }
    }
}

@Composable
fun ImageWithTextAndButtons(
    drawableResourceId: Int,
    contentDescriptionId: Int,
    textResourceId: Int,
    textResourceId2: Int,
    onPreviousClick: () -> Unit,
    onNextClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.beige))
    ) {
        Image(
            painter = painterResource(drawableResourceId),
            contentDescription = stringResource(id = contentDescriptionId),
            modifier
                .size(250.dp)
                .clip(RectangleShape)
                .border(
                    2.dp, Color.Black, CircleShape
                )
                .padding(16.dp)
        )
        Text(
            text = stringResource(id = textResourceId)
        )
        Spacer(modifier.height(4.dp))
        Text(
            text = stringResource(id = textResourceId2)
        )
        Spacer(modifier.height(16.dp))
        Row(
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(
                onClick = onPreviousClick,
                modifier
                    .padding(end = 16.dp)
            ) {
                Icon(
                    Icons.Outlined.ArrowBack,
                    contentDescription = null,
                    modifier.size(ButtonDefaults.IconSize)
                )
                Text(stringResource(id = R.string.Previous))
            }

            Button(
                onClick = onNextClick,
                modifier
                    .padding(start = 16.dp)
            ) {
                Text(stringResource(id = R.string.Next))
                Icon(
                    Icons.Outlined.ArrowForward,
                    contentDescription = null,
                    modifier.size(ButtonDefaults.IconSize)
                )
            }
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