package com.example.surfhomework2

object Rockets {
    fun getLaunchedRockets(): Array<Rocket> {
        return arrayOf(
            Rocket(
                R.drawable.falconsat01,
                "Starlink 2",
                "CCAES SLC 40",
                "16-12-2014"
            ),
            Rocket(
                R.drawable.falcon9,
                "DemoSat",
                "AAAES SLC 40",
                "06-07-2018"
            ),
            Rocket(
                R.drawable.demosat02,
                "Falcon 9 Test",
                "CCAES SEC 40",
                "18-03-2019"
            ),
            Rocket(
                R.drawable.crs,
                "CRS - 2",
                "CAAES SLC 40",
                "18-12-2019"
            )
        )
    }

    fun getRockets(): Array<Rocket> {
        return arrayOf(
            Rocket(
                R.drawable.falconsat01,
                "Falcon 1",
                "",
                "",
                false
            ),
            Rocket(
                R.drawable.falcon09,
                "Falcon 9",
                "",
                "",
                true
            ),Rocket(
                R.drawable.demosat02,
                "Big Falcon Rocket",
                "",
                "",
                false
            )
        )
    }
}