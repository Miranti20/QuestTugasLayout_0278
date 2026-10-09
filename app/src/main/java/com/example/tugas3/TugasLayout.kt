package com.example.tugas3

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Text
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.Image
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun HalamanUtamaLayout(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(top = 40.dp, start = 16.dp, end = 16.dp)
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(id = R.string.prodi),
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = stringResource(id = R.string.univ),
            fontSize = 16.sp,
            fontWeight = FontWeight.SemiBold
        )

        Spacer(modifier = Modifier.height(20.dp))

        KartuProfilItem(
            bgResId = R.color.card_grey,
            namaResId = R.string.nama_1,
            useCursiveFont = true,
            phoneResId = null,
            alamatResId = R.string.alamat_1
        )

        Spacer(modifier = Modifier.height(12.dp))

        KartuProfilItem(
            bgResId = R.color.card_purple,
            namaResId = R.string.nama_2,
            useCursiveFont = false,
            phoneResId = R.string.phone_2,
            alamatResId = R.string.alamat_2
        )

        Spacer(modifier = Modifier.height(12.dp))

        KartuProfilItem(
            bgResId = R.color.card_blue,
            namaResId = R.string.nama_3,
            useCursiveFont = false,
            phoneResId = R.string.phone_3,
            alamatResId = R.string.alamat_3
        )

        Spacer(modifier = Modifier.height(12.dp))

        KartuProfilItem(
            bgResId = R.color.card_green,
            namaResId = R.string.nama_4,
            useCursiveFont = false,
            phoneResId = R.string.phone_4,
            alamatResId = R.string.alamat_4
        )
        Spacer(modifier = Modifier.height(30.dp))

        Text(
            text = stringResource(id = R.string.copy),
            fontSize = 12.sp,
            color = Color.Gray,
            modifier = Modifier.padding(bottom = 20.dp)
        )
    }
}

@Composable
fun KartuProfilItem(
    bgResId: Int,
    namaResId: Int,
    useCursiveFont: Boolean,
    phoneResId: Int?,
    alamatResId: Int
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(
            containerColor = colorResource(id = bgResId)
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo_umy),
                contentDescription = null,
                modifier = Modifier.size(65.dp)
            )

            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 12.dp),
                horizontalAlignment = Alignment.Start
            ) {
                Text(
                    text = stringResource(id = namaResId),
                    color = Color.White,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = if (useCursiveFont) FontFamily.Cursive else FontFamily.Default
                )

                if (phoneResId != null) {
                    Text(
                        text = stringResource(id = phoneResId),
                        color = colorResource(id = R.color.text_cyan),
                        fontSize = 13.sp
                    )
                }

                Text(
                    text = stringResource(id = alamatResId),
                    color = colorResource(id = R.color.text_yellow),
                    fontSize = 13.sp
                )
            }

            Image(
                painter = painterResource(id = R.drawable.logo_umy),
                contentDescription = null,
                modifier = Modifier.size(65.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HalamanUtamaLayoutPreview() {
    HalamanUtamaLayout()
}