package com.example.sunrisealarm
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sunrisealarm.ui.theme.SunriseAlarmTheme

class MainActivity : ComponentActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContent()
        {
            SunriseAlarmTheme()
            {
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background)
                {
                    Display(stringResource(R.string.header), stringResource(R.string.intro), stringResource(R.string.body))
                }
            }
        }
    }
}
@Composable
fun Text(header: String, fromTxt: String, modifier: Modifier = Modifier)
{
    Column(verticalArrangement = Arrangement.Center, modifier = modifier)
    {
        Text(text = header, fontSize = 100.sp, lineHeight = 116.sp, textAlign = TextAlign.Center)
        Text(text = fromTxt, fontSize = 36.sp, modifier = Modifier
            .padding(16.dp)
            .align(alignment = Alignment.CenterHorizontally))
    }
}
@Composable
fun Display(header: String, intro: String, body: String, modifier: Modifier = Modifier)
{
    val image = painterResource(R.drawable.liberalscantbullyme)
    Column(Modifier.padding(20.dp))
    {
        Column(Modifier.padding(15.dp))
        {
            Image(painter = image, null, contentScale = ContentScale.FillWidth, alignment = Alignment.Center)
            Text("John Michael Burnside")
            Text("JOHN MICHAEL")
        }
        Column(Modifier.padding(15.dp))
        {
            Row()
            {
                Icon(Icons.Rounded.Star, contentDescription = "Localized description")
                Text("JOHNMICHAEL.SHOP")
            }
            Row(horizontalArrangement = Arrangement.Center)
            {
                Icon(Icons.Rounded.Phone, contentDescription = "Localized description")
                Text("509-438-9315")
            }
            Row(horizontalArrangement = Arrangement.Center)
            {
                Icon(Icons.Rounded.Email, contentDescription = "Localized description")
                Text("JohnMBurnside21@gmail.com")
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun SunriseAlarmPreview()
{
    SunriseAlarmTheme()
    {
        Display(stringResource(R.string.header), stringResource(R.string.intro), stringResource(R.string.body))
    }
}
//Text(text = header, fontSize = 24.sp, modifier = Modifier.padding(16.dp))
//Text(text = intro, textAlign = TextAlign.Justify, modifier = Modifier.padding(16.dp))
//Text(text = intro, textAlign = TextAlign.Justify, modifier = Modifier.padding(16.dp))