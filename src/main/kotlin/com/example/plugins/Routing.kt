package com.example.plugins

import com.example.services.models.CovidData
import io.ktor.server.routing.*
import io.ktor.http.*
import io.ktor.server.http.content.*
import io.ktor.server.application.*
import io.ktor.server.freemarker.*
import io.ktor.server.response.*
import io.ktor.server.request.*

fun Application.configureRouting() {


    routing {
        get("/") {
            call.respondText("Hello World!")
        }
        get("/") {
            call.respondRedirect("Covid")
        }

        route("Covid") {
            get {
                // Show a list of articles
                call.respond(FreeMarkerContent("index.ftl", mapOf("Covid" to CovidData)))


            }
            // Static plugin. Try to access `/static/index.html`
            static("/static") {

                resources("files")
            }
        }
    }

}