package com.ad_coding.instagramclone

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ad_coding.instagramclone.ui.theme.InstagramCloneTheme

@Composable
fun StoryCard(
    @DrawableRes image: Int,
    username: String
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        Box(
            modifier = Modifier
                .size(88.dp)
                .border(
                    brush = Brush.linearGradient(
                        colors = listOf(
                            Color(0xFFFFA500),
                            Color.Magenta
                        )
                    ),
                    width = 2.dp,
                    shape = CircleShape
                )
        ) {
            Image(
                painter = painterResource(id = image),
                contentDescription = null,
                modifier = Modifier.clip(CircleShape)
            )
        }
        Text(text = username)
    }
}

@Preview(showBackground = true)
@Composable
private fun StoryCardPreview() {
    InstagramCloneTheme {
        StoryCard(
            image = R.drawable.profile_1,
            username = "mrbeast"
        )
    }
}