plugins {
    id("org.jetbrains.intellij") version "1.5.2"
    java
}

group = "org.jcorbett"
version = "1.0.0-5"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

// See https://github.com/JetBrains/gradle-intellij-plugin/
intellij {
    version.set("2022.1")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}
