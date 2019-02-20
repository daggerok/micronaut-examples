/*
 * gradle init --type=kotlin-application --dsl=kotlin --project-name=micronaut-examples --package=com.github.daggerok
 */

plugins {
    id("idea")
    id("base")
}

tasks {
    "wrapper"(Wrapper::class) {
        gradleVersion = "5.2.1"
    }
}

allprojects {
    defaultTasks("build", "installDist")
}
