import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.PlayArrow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun StopWatchDisplay(
    formattedTime: String,
    onStartClick: () -> Unit,
    onPauseClick: () -> Unit,
    onResetClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Box(modifier = Modifier.fillMaxSize().background(Color.DarkGray)) {
        Column(
            modifier = modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = formattedTime, fontWeight = FontWeight.Bold, fontSize = 55.sp, color = Color.White)
            Spacer(Modifier.height(16.dp))
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth().padding(25.dp)
            ) {
                Button(onClick = onStartClick, Modifier.weight(1f)) {
                    Icon(imageVector = Icons.Rounded.PlayArrow, "")
                    Spacer(Modifier.width(10.dp))
                    Text(text = "Start")
                }
                Spacer(Modifier.width(16.dp))
                Button(onClick = onPauseClick, Modifier.weight(1f)) {
                    Icon(painter = painterResource("drawable/pause.svg"), "")
                    Spacer(Modifier.width(10.dp))
                    Text(text = "Pause")
                }
                Spacer(Modifier.width(16.dp))
                Button(onClick = onResetClick, Modifier.weight(1f)) {
                    Icon(painter = painterResource("drawable/restart.svg"), "")
                    Spacer(Modifier.width(10.dp))
                    Text(text = "Reset")
                }
            }
        }
    }

}
