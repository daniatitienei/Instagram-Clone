@file:OptIn(ExperimentalMaterial3Api::class)

package com.ad_coding.instagramclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.KeyboardArrowDown
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ad_coding.instagramclone.ui.theme.InstagramCloneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            InstagramCloneTheme {
                Scaffold(
                    topBar = {
                        TopAppBar(
                            title = {
                                Row(
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Text(
                                        text = "For you",
                                        fontWeight = FontWeight.Bold
                                    )
                                    Spacer(modifier = Modifier.width(6.dp))
                                    Icon(
                                        imageVector = Icons.Rounded.KeyboardArrowDown,
                                        contentDescription = null
                                    )
                                }
                            },
                            actions = {
                                IconButton(onClick = { /*TODO*/ }) {
                                    Icon(
                                        imageVector = Icons.Outlined.FavoriteBorder,
                                        contentDescription = null,
                                        modifier = Modifier.size(28.dp)
                                    )
                                }
                                IconButton(onClick = { /*TODO*/ }) {
                                    Icon(
                                        painter = painterResource(id = R.drawable.message),
                                        contentDescription = null,
                                        modifier = Modifier.size(24.dp)
                                    )
                                }
                            }
                        )
                    },
                    bottomBar = {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(Color.White)
                                .padding(
                                    horizontal = 10.dp,
                                    vertical = 6.dp
                                ),
                            horizontalArrangement = Arrangement.SpaceAround
                        ) {
                            IconButton(onClick = { /*TODO*/ }) {
                                Icon(
                                    painter = painterResource(id = R.drawable.home),
                                    contentDescription = null,
                                    modifier = Modifier.size(24.dp)
                                )
                            }

                            IconButton(onClick = { /*TODO*/ }) {
                                Icon(
                                    imageVector = Icons.Rounded.Search,
                                    contentDescription = null,
                                    modifier = Modifier.size(32.dp)
                                )
                            }

                            IconButton(onClick = { /*TODO*/ }) {
                                Icon(
                                    painter = painterResource(id = R.drawable.plus),
                                    contentDescription = null,
                                    modifier = Modifier.size(24.dp)
                                )
                            }

                            IconButton(onClick = { /*TODO*/ }) {
                                Icon(
                                    painter = painterResource(id = R.drawable.reels),
                                    contentDescription = null,
                                    modifier = Modifier.size(24.dp)
                                )
                            }

                            IconButton(onClick = { /*TODO*/ }) {
                                Image(
                                    painter = painterResource(id = R.drawable.profile_0),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .size(28.dp)
                                        .clip(CircleShape)
                                )
                            }
                        }
                    }
                ) { padding ->
                    LazyColumn(
                        contentPadding = padding,
                        verticalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        // Stories
                        item {
                            LazyRow(
                                contentPadding = PaddingValues(
                                    horizontal = 10.dp,
                                    vertical = 15.dp
                                ),
                                horizontalArrangement = Arrangement.spacedBy(14.dp)
                            ) {
                                item {
                                    Column(
                                        horizontalAlignment = Alignment.CenterHorizontally,
                                        verticalArrangement = Arrangement.spacedBy(4.dp)
                                    ) {
                                        Box(
                                            modifier = Modifier.size(88.dp)
                                        ) {
                                            Image(
                                                painter = painterResource(id = R.drawable.profile_0),
                                                contentDescription = null,
                                                modifier = Modifier.clip(CircleShape)
                                            )

                                            Box(
                                                modifier = Modifier.fillMaxSize(),
                                                contentAlignment = Alignment.BottomEnd
                                            ) {
                                                Box(
                                                    modifier = Modifier
                                                        .size(26.dp)
                                                        .border(
                                                            color = Color.White,
                                                            width = 2.dp,
                                                            shape = CircleShape
                                                        )
                                                        .background(
                                                            color = Color(0xFF2596be),
                                                            shape = CircleShape
                                                        ),
                                                    contentAlignment = Alignment.Center
                                                ) {
                                                    Icon(
                                                        imageVector = Icons.Rounded.Add,
                                                        contentDescription = null,
                                                        modifier = Modifier.size(16.dp),
                                                        tint = Color.White
                                                    )
                                                }
                                            }
                                        }
                                        Text(text = "Your story")
                                    }
                                }
                                item {
                                    StoryCard(image = R.drawable.profile_1, username = "mrbeast")
                                }
                                item {
                                    StoryCard(image = R.drawable.profile_2, username = "aztegramu")
                                }
                                item {
                                    StoryCard(image = R.drawable.profile_3, username = "rockstargames")
                                }
                            }
                        }

                        // Posts
                        item {
                            PostCard(
                                profilePicture = R.drawable.profile_1,
                                username = "mrbeast",
                                postedPhoto = R.drawable.post_1
                            )
                        }

                        item {
                            PostCard(
                                profilePicture = R.drawable.profile_0,
                                username = "danielatitienei",
                                postedPhoto = R.drawable.post_2
                            )
                        }
                    }
                }
            }
        }
    }
}