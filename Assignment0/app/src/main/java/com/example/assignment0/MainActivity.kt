package com.example.assignment0

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.assignment0.ui.theme.Assignment0Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            Assignment0Theme {
                Scaffold( modifier = Modifier.fillMaxSize() ) { innerPadding ->
                    DecisionScreenShow()
                }
            }
        }
    }
}

@Composable
fun DecisionScreenShow() {

    var output by remember { mutableStateOf("") }
    var clicks by remember { mutableIntStateOf(0) }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) { Text("Should we go?")

        Button(
            onClick = {
                clicks = clicks + 1

                if (Math.random() < 0.50) {
                    output = "Yes"
                } else {
                    output = "No"
                }
            }
        ) {
            Text("Ok!")
        }

        Button(
            onClick = {
                clicks = clicks + 1

                if (Math.random() < 0.25) {
                    output = "Yes"
                } else {
                    output = "No"
                }
            }
        ) {
            Text("Meh")
        }

        Button(
            onClick = {
                clicks = clicks + 1

                if (Math.random() < 0.10) {
                    output = "Yes"
                } else {
                    output = "No"
                }
            }
        ) {
            Text("Nah")
        }

        Text(output)

        Text("Clicks: $clicks")


        Text("Student ID: 1880173")
        Text("CCID: ahernan3")

    }

}
