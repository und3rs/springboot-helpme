import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot") version "2.5.0"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    kotlin("jvm") version "1.5.31"
    kotlin("plugin.spring") version "1.5.31"
    kotlin("plugin.allopen") version "1.5.31"
    kotlin("plugin.noarg") version "1.5.31"
    kotlin("kapt") version "1.5.31"
    kotlin("plugin.jpa") version "1.5.31"
}


group = "com.example"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
    mavenCentral()
}

apply(plugin = "io.spring.dependency-management")

dependencies {
    //================================
    // Basic
    //================================
    //api("org.springframework.boot:spring-boot-starter")
    implementation("org.springframework.boot:spring-boot-starter-webflux")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("io.projectreactor.kotlin:reactor-kotlin-extensions")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-reactor")
    implementation("org.springframework.boot:spring-boot-starter-validation")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("org.json:json:20201115")

    kapt("org.springframework.boot:spring-boot-configuration-processor")
    annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")

    //================================
    // Validation
    //================================
    implementation("javax.validation:validation-api:2.0.1.Final")
    implementation("org.hibernate:hibernate-validator:7.0.1.Final")

    //================================
    // Authorization
    //================================
    implementation("org.springframework.boot:spring-boot-starter-security")

    implementation("org.springframework.cloud:spring-cloud-dependencies:Hoxton.SR8")
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "11"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
