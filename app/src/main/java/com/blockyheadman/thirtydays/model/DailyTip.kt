package com.blockyheadman.thirtydays.model

import androidx.annotation.StringRes

data class DailyTip(
    @StringRes val day: Int,
    @StringRes val tip: Int,
    @StringRes val tipDescription: Int
)
