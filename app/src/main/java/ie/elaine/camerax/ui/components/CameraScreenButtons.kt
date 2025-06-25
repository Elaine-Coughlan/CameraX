package ie.elaine.camerax.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun CameraScreenButtons(name: String, modifier: Modifier = Modifier) {
    Row(Modifier.fillMaxSize()) {
        Button(onClick = { }) {
            Text(
                text = "Start Capture"
            )
        }
        Button(onClick = { }) {
            Text(
                text = "Take Photo"
            )
        }
    }
}