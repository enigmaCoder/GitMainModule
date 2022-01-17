plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
}

gradlePlugin {
    plugins {
        create("BuildManager") {
            id = "com.satyam.plugin"
            implementationClass = "BuildManager"
            version = "1.0.0"
        }
    }
}