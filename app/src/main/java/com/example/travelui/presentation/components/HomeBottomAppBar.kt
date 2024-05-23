import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HomeBottomAppBar(
    onHomeClicked:() -> Unit,
    onMessageClicked:() ->Unit,
    onSearchClicked: () -> Unit,
    onFavouriteClicked:() -> Unit
){
    BottomAppBar(
        modifier = Modifier
            .padding(10.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround) {
            Icon(imageVector = Icons.Outlined.Home, contentDescription ="Home" )
            Icon(imageVector = Icons.Default.MailOutline, contentDescription ="Message" )
            Icon(imageVector = Icons.Outlined.FavoriteBorder, contentDescription = "Favourite")
            Icon(imageVector = Icons.Outlined.Search ,contentDescription = "Search")
    }}
}