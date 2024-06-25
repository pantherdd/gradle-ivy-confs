plugins {
    java
    application
}

group = "io.github.pantherdd"
version = "1.0"

repositories {
    ivy {
        url = uri(projectDir.parentFile.resolve("ivy-repo"))
        layout("ivy")
    }
}

dependencies {
    implementation("io.github.pantherdd", "datetime", "1.2.3", configuration = "format")
    runtimeOnly("io.github.pantherdd", "datetime", "1.2.3", configuration = "current")
}

application {
    mainClass.set("io.github.pantherdd.ivyapp.PrintTimestamp")
}
