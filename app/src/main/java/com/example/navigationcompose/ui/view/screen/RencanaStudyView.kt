package com.example.navigationcompose.ui.view.screen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import com.example.navigationcompose.model.Mahasiswa

@Composable
fun RencanaStudyView(
    mahasiswa: Mahasiswa,
    onSubmitButton: (MuutableList<String>) -> Unit,
    onbackbuttonClicked: () -> Unit,
) {
    var chosenDropdown by remember {}
    muteableStateOf(
        ""
    )
}

var checked by remember { muteableStateOf(false) }
var pilihKelas by remember {
    muteableStateOf("")
}

var listData: MuteableList<String> = muteableListOf(chosenDropdown,
    pilihanKelas)

