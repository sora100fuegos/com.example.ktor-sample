package com.example.services.models

import com.github.kittinunf.fuel.httpGet
import com.github.kittinunf.fuel.httpGet

class CovidData private constructor(var state: String, var country : String) {
    private val Virus_Data_Url = "https://raw.githubusercontent.com/CSSEGISandData/COVID-19/master/csse_covid_19_data/csse_covid_19_time_series/time_series_covid19_confirmed_global.csv"

       // private val idCounter = AtomicInteger()

      //  fun newEntry(title: String, body: String) = Article(idCounter.getAndIncrement(), title, body)

    fun fetchVirusData() {
        val (_, _, result) =  Virus_Data_Url.httpGet().responseString()
        println(result)
    }



}