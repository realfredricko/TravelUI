import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.travelui.R
// @stringRes
// val appBarTitle by stringResource(R.string.app_bar_title)
//  @stringRes
//   val whatWouldYouLike by stringResource(R.string. what_would_you_like)
//   @stringRes
//   val viewAll by stringResource(R.string.view_all)
//   @stringRes
//val experiences by stringResource(R.string.experiences)
//@stringRes
//   val appBarTitle by stringResource(R.string.app_bar_title)
@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen(){
    Scaffold {
        TopAppBar(title = { Text(text = R.string.find_your_experience)},
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(painter = painterResource(id = R.drawable.messi), contentDescription ="Profile" )
                }
            }),
        con

    }

}

/*
@Preview(showBackground = true)
@Composable
fun ProfileCardPreview(){
    ProfileCard(imageResource = R.drawable.messi)
}*/
