package com.example.finalproject

import android.media.MediaRecorder
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import java.io.File
import java.io.IOException

@Composable
fun <MediaPlayer> Speaking(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
    ){
        Text("Speaking", fontSize = 20.sp)
        Spacer(modifier = Modifier
            .fillMaxWidth()
            .background(Color.Gray))
        Button(onClick = { navController.navigate("HomePage") }) {
            Text(text = "Back to HomePage", fontSize = 20.sp)

        }
    }
}

@Preview(showBackground = true)
@Composable
fun SpeakingPreview(){
    val navController = rememberNavController()
    Speaking<Any>(navController)
}