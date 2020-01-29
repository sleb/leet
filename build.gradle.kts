import org.gradle.api.tasks.testing.logging.TestLogEvent.*

plugins {
    `java-library`
    groovy
}

java {
    sourceCompatibility = JavaVersion.VERSION_13
    targetCompatibility = JavaVersion.VERSION_13
}

repositories {
    // Use jcenter for resolving dependencies.
    // You can declare any Maven/Ivy/file repository here.
    jcenter()
}

dependencies {
    // Use the latest Groovy version for Spock testing
    testImplementation("org.codehaus.groovy:groovy-all:2.5.9")

    // Use the awesome Spock testing and specification framework even with Java
    testImplementation("org.spockframework:spock-core:1.3-groovy-2.5")
    testImplementation("junit:junit:4.12")
}

tasks.test {
    testLogging {
        events = setOf(FAILED, SKIPPED, PASSED)
    }
}
