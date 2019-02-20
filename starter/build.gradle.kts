/*
 *gradle init --type=kotlin-application --dsl=kotlin --project-name=micronaut-example --package=com.github.daggerok
 */

plugins {
    id("org.jetbrains.kotlin.jvm").version("1.3.21")
    application
}

application {
    mainClassName = "com.github.daggerok.AppKt"
}

defaultTasks("build", "installDist")

sourceSets {
    main {
        java.srcDir("src/main/kotlin")
    }
}

// gradle tests output stdOut workaround
tasks {
    test {
        testLogging {
            showExceptions = true
            showStandardStreams = true
            useJUnitPlatform()
            useJUnit()
        }
    }
}

repositories {
    jcenter()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}

sourceSets {
    main {
        java.srcDir("src/main/kotlin")
    }
}

// gradle tests output stdOut workaround
tasks {
    test {
        testLogging {
            showExceptions = true
            showStandardStreams = true
            useJUnitPlatform()
            useJUnit()
        }
    }
}
