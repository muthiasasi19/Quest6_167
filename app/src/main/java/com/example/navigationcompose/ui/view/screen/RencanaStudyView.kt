package com.example.navigationcompose.ui.view.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
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

@Composable
fun RencanaStudyView(
    mahasiswa: Mahasiswa,
    onSubmitButton: (MutableList<String>) -> Unit,
    onbackbuttonClicked: () -> Unit,
){
    var chosenDropdown by remember {
        mutableStateOf(
            ""
        )
    }
    var checked by remember { mutableStateOf(false) }
    var pilihanKelas by remember {
        mutableStateOf("")}

    var listData: MutableList<String> = mutableListOf(chosenDropdown, pilihanKelas)

    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(color = colorResource(id = R.color.primary))
    ) {
        Row (modifier = Modifier
            .fillMaxWidth()
            .padding(40.dp),
            verticalAlignment = Alignment.CenterVertically,
        ){
            Image(
                painter = painterResource(
                    id = R.drawable.umy
                ),
                contentDescription = ""
            )

            Spacer(modifier = Modifier.padding(start = 30.dp))

            Column (modifier = Modifier.weight(1f)) {
                Text(
                    text = mahasiswa.nama,
                    color = Color.White,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = mahasiswa.nim,
                    color = Color.White,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }

}