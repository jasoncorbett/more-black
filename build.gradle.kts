plugins {
    id("org.jetbrains.intellij") version "1.16.1"
    java
}

group = "org.jcorbett"
version = "1.0.0-10"

repositories {
    maven("https://www.jetbrains.com/intellij-repository/releases")
    maven("https://www.jetbrains.com/intellij-repository/snapshots")
    maven("https://cache-redirector.jetbrains.com/intellij-dependencies")
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

// See https://github.com/JetBrains/gradle-intellij-plugin/
intellij {
    version.set("2023.2")
    updateSinceUntilBuild.set(false)
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

tasks {
  buildSearchableOptions {
    enabled = false
  }
}
