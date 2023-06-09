package com.blockyheadman.thirtydays

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.blockyheadman.thirtydays.data.Datasource
import com.blockyheadman.thirtydays.model.DailyTip
import com.blockyheadman.thirtydays.ui.theme.ThirtyDaysTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ThirtyDaysApp()
        }
    }
}

@Composable
fun ThirtyDaysApp() {
    ThirtyDaysTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            DailyTipList(tipList = Datasource.loadTips())
        }
    }

}

@Composable
fun DailyTipCard(dailyTip: DailyTip, modifier: Modifier = Modifier) {
    var expanded by remember { mutableStateOf(false) }
    Card(
        elevation = CardDefaults.cardElevation(8.dp),
        shape = MaterialTheme.shapes.medium,
        modifier = modifier
            .padding(8.dp)
            .animateContentSize(
                animationSpec = spring(
                    dampingRatio = Spring.DampingRatioMediumBouncy,
                    stiffness = Spring.StiffnessLow
                )
            )
    ) {
        Column {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column {
                    Text(
                        text = stringResource(id = dailyTip.day),
                        style = MaterialTheme.typography.headlineMedium
                    )
                    Text(
                        text = stringResource(id = dailyTip.tip),
                        style = MaterialTheme.typography.headlineSmall
                    )
                }
                Spacer(Modifier.weight(1f))
                ExpandTipButton(
                    expanded = expanded,
                    onClick = {expanded = !expanded}
                )
            }
            if (expanded) {
                Text(text = stringResource(id = dailyTip.tipDescription))
            }
        }
    }
}

@Composable
private fun ExpandTipButton(
    expanded: Boolean,
    onClick: () -> Unit,
    //modifier: Modifier = Modifier
) {
    IconButton(onClick = onClick) {
        Icon(
            imageVector = if(expanded) Icons.Filled.ExpandLess else Icons.Filled.ExpandMore,
            tint = MaterialTheme.colorScheme.secondary,
            contentDescription = stringResource(id = R.string.expand_button_content_description)
        )
    }
}

@Composable
private fun DailyTipList(
    tipList: List<DailyTip>,
    //modifier: Modifier = Modifier
) {
    LazyColumn(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        items(tipList) {dailyTip ->
            DailyTipCard(dailyTip = dailyTip)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ThirtyDaysTheme {
        ThirtyDaysApp()
    }
}