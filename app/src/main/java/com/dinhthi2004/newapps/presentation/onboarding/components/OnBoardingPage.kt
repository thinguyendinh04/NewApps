package com.dinhthi2004.newapps.presentation.onboarding.components

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import coil.compose.AsyncImage
import com.dinhthi2004.newapps.R
import com.dinhthi2004.newapps.presentation.Dimens.Mediumpading1
import com.dinhthi2004.newapps.presentation.Dimens.Mediumpading2
import com.dinhthi2004.newapps.presentation.onboarding.Page
import com.dinhthi2004.newapps.presentation.onboarding.pages
import com.dinhthi2004.newapps.ui.theme.NewAppsTheme

@Composable
fun OnBoardingPage(
    modifier: Modifier = Modifier,
    page: Page
) {
    Column(modifier = modifier) {
        Image(
            painter = painterResource(id = page.image), contentDescription = "", modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(fraction = 0.6f),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(Mediumpading1))
        Text(
            page.title,
            modifier.padding(horizontal = Mediumpading2),
            style = MaterialTheme.typography.displaySmall.copy(fontWeight = FontWeight.Bold),
            color = colorResource(id = R.color.display_small)
        )
        Text(
            page.description,
            modifier.padding(horizontal = Mediumpading2),
            style = MaterialTheme.typography.bodyMedium,
            color = colorResource(id = R.color.text_medium)
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun OnBoardingPagePreview() {
    NewAppsTheme {
        OnBoardingPage(
            page = pages[0]
        )
    }
}