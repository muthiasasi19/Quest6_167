package com.example.navigationcompose.ui.view.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.navigationcompose.R
import com.example.navigationcompose.model.Mahasiswa
import com.example.navigationcompose.model.RencanaStudi


@Composable
fun TampilView(
    mahasiswa: Mahasiswa,
    krs: RencanaStudi,
    onbackbuttonClicked: () -> Unit,
    onResetButtonClicked: () -> Unit,
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.primary)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.padding(top = 16.dp))
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.umy),
                contentDescription = "umy",
                modifier = Modifier.size(45.dp)
            )
            Spacer(modifier = Modifier.padding(start = 16.dp))
            Column {
                Text(
                    text = "Data KRS Mahasiswa",
                    color = Color.White,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "Universitas Muhammadiyah Yogyakarta",
                    color = Color.White,
                    fontWeight = FontWeight.Light
                )
            }
        }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Image(
                    painter = painterResource(id = R.drawable.umy),
                    contentDescription = "umy",
                    modifier = Modifier.size(45.dp)
                )
                Spacer(modifier = Modifier.padding(start = 16.dp))
                Column {
                    Text(text = "Data KRS Mahasiswa",
                        color = Color.White,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(text = "Universitas Muhammadiyah Yogyakarta",
                        color = Color.White,
                        fontWeight = FontWeight.Light
                    )
                }
            }


            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.White)
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column {
                        Text(
                            text = "Nim:",
                            fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
                            fontSize = 14.sp,
                            color = Color.Black
                        )
                        Text(
                            text = mahasiswa.nim,
                            fontStyle = androidx.compose.ui.text.font.FontStyle.Italic,
                            fontSize = 14.sp,
                            color = Color.Black
                        )
                        Text(
                            text = "Nama:",
                            fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
                            fontSize = 14.sp,
                            color = Color.Black
                        )
                        Text(
                            text = mahasiswa.nama,
                            fontStyle = androidx.compose.ui.text.font.FontStyle.Italic,
                            fontSize = 14.sp,
                            color = Color.Black
                        )


                        Text(
                            text = "Email:",
                            color = Color.Black,
                            fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
                            fontSize = 14.sp
                        )
                        Text(
                            text = mahasiswa.email,
                            fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
                            fontSize = 14.sp,
                            color = Color.Black
                        )
                    }
                }
                Spacer(modifier = Modifier.padding(16.dp))
                Column(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = "Matakuliah yang diambil:",
                        fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
                        fontSize = 14.sp,
                        color = Color.Black
                    )
                    Text(
                        text = krs.namaMK,
                        fontStyle = androidx.compose.ui.text.font.FontStyle.Italic,
                        fontSize = 14.sp,
                        color = Color.Black
                    )

                    Row {
                        Text(
                            text = "Kelas:",
                            fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
                            fontSize = 14.sp,
                            color = Color.Black

                        )
                        Text(
                            text = krs.kelas,
                            fontStyle = androidx.compose.ui.text.font.FontStyle.Italic,
                            fontSize = 14.sp,
                            color = Color.Black
                        )
                    }
                }
                Spacer(modifier = Modifier.padding(16.dp))

                Row (
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Button(onClick = { onbackbuttonClicked() }) {
                        Text(text = "Kembali",
                            color = Color.Black)
                    }

                }
            }
        }
    }
}



