package com.example.services.models

import com.example.services.models.CovidData
import com.github.kittinunf.fuel.httpGet
import java.io.IOException
import java.io.StringReader
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse


class CoronavirusDataService {
    private val Virus_Data_Url = "https://raw.githubusercontent.com/CSSEGISandData/COVID-19/master/csse_covid_19_data/csse_covid_19_time_series/time_series_covid19_confirmed_global.csv"
    fun getAllStats(): List<CovidData> {
        return allStats
    }

    private var allStats: List<CovidData> = ArrayList()

    fun fetchVirusData() {
        val (_, _, result) =  Virus_Data_Url.httpGet().responseString()
        println(result)
        }

}