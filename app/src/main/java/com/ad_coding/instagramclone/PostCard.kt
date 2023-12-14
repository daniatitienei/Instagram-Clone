package com.ad_coding.instagramclone

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.FavoriteBorder
import androidx.compose.material.icons.rounded.MoreVert
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ad_coding.instagramclone.ui.theme.InstagramCloneTheme

@Composable
fun PostCard(
    @DrawableRes profilePicture: Int,
    username: String,
    @DrawableRes postedPhoto: Int
) {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(6.dp)
            ) {
                Box(
                    modifier = Modifier
                        .size(32.dp)
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
                        painter = painterResource(id = profilePicture),
                        contentDescription = null,
                        modifier = Modifier.clip(CircleShape)
                    )
                }

                Text(text = username)
            }

            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Rounded.MoreVert,
                    contentDescription = null
                )
            }
        }
        Spacer(modifier = Modifier.height(4.dp))

        Image(
            painter = painterResource(id = postedPhoto),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.8f),
            contentScale = ContentScale.FillWidth
        )

        Spacer(modifier = Modifier.width(4.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Rounded.FavoriteBorder,
                        contentDescription = null
                    )
                }

                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        painter = painterResource(id = R.drawable.comment),
                        contentDescription = null,
                        modifier = Modifier.size(28.dp)
                    )
                }

                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        painter = painterResource(id = R.drawable.send),
                        contentDescription = null,
                        modifier = Modifier.size(22.dp)
                    )
                }
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    painter = painterResource(id = R.drawable.save),
                    contentDescription = null,
                    modifier = Modifier.size(26.dp)
                )
            }
        }

        Text(
            text = "442.429 likes",
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 10.dp)
        )

        Spacer(modifier = Modifier.height(8.dp))
    }
}

@Preview(showBackground = true)
@Composable
private fun PostCardPreview() {
    InstagramCloneTheme {
        PostCard(
            profilePicture = R.drawable.profile_1,
            username = "mrbeast",
            postedPhoto = R.drawable.post_2
        )
    }
}