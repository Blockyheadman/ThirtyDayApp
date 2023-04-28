package com.blockyheadman.thirtydays.data

import com.blockyheadman.thirtydays.R
import com.blockyheadman.thirtydays.model.DailyTip

object Datasource {
    fun loadTips(): List<DailyTip> {
        return listOf(
            DailyTip(R.string.day_1, R.string.day_1_tip, R.string.day_1_desc),
            DailyTip(R.string.day_2, R.string.day_2_tip, R.string.day_2_desc),
            DailyTip(R.string.day_3, R.string.day_3_tip, R.string.day_3_desc),
            /*DailyTip(R.string.day_4, R.string.day_4_tip, R.string.day_4_desc),
            DailyTip(R.string.day_5, R.string.day_5_tip, R.string.day_5_desc),
            DailyTip(R.string.day_6, R.string.day_6_tip, R.string.day_6_desc),
            DailyTip(R.string.day_7, R.string.day_7_tip, R.string.day_7_desc),
            DailyTip(R.string.day_8, R.string.day_8_tip, R.string.day_8_desc),
            DailyTip(R.string.day_9, R.string.day_9_tip, R.string.day_9_desc),
            DailyTip(R.string.day_10, R.string.day_10_tip, R.string.day_10_desc),
            DailyTip(R.string.day_11, R.string.day_11_tip, R.string.day_11_desc),
            DailyTip(R.string.day_12, R.string.day_12_tip, R.string.day_12_desc),
            DailyTip(R.string.day_13, R.string.day_13_tip, R.string.day_13_desc),
            DailyTip(R.string.day_14, R.string.day_14_tip, R.string.day_14_desc),
            DailyTip(R.string.day_15, R.string.day_15_tip, R.string.day_15_desc),
            DailyTip(R.string.day_16, R.string.day_16_tip, R.string.day_16_desc),
            DailyTip(R.string.day_17, R.string.day_17_tip, R.string.day_17_desc),
            DailyTip(R.string.day_18, R.string.day_18_tip, R.string.day_18_desc),
            DailyTip(R.string.day_19, R.string.day_19_tip, R.string.day_19_desc),
            DailyTip(R.string.day_20, R.string.day_20_tip, R.string.day_20_desc),
            DailyTip(R.string.day_21, R.string.day_21_tip, R.string.day_21_desc),
            DailyTip(R.string.day_22, R.string.day_22_tip, R.string.day_22_desc),
            DailyTip(R.string.day_23, R.string.day_23_tip, R.string.day_23_desc),
            DailyTip(R.string.day_24, R.string.day_24_tip, R.string.day_24_desc),
            DailyTip(R.string.day_25, R.string.day_25_tip, R.string.day_25_desc),
            DailyTip(R.string.day_26, R.string.day_26_tip, R.string.day_26_desc),
            DailyTip(R.string.day_27, R.string.day_27_tip, R.string.day_27_desc),
            DailyTip(R.string.day_28, R.string.day_28_tip, R.string.day_28_desc),
            DailyTip(R.string.day_29, R.string.day_29_tip, R.string.day_29_desc),
            DailyTip(R.string.day_30, R.string.day_30_tip, R.string.day_30_desc),*/
        )
    }
}