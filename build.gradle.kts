buildscript {
    repositories {
        mavenCentral()
        mavenLocal()
        jcenter()
    }
    ext {
        serenityVersion = '2.0.43'
        serenityCucumberVersion = '1.0.5'
        cucumberVersion = '4.2.0'
    }
    dependencies {
        classpath("net.serenity-bdd:serenity-gradle-plugin:$rootProject.ext.serenityVersion")
    }
}

plugins {
    id 'java'
    id 'idea'
    id 'eclipse'
}

apply plugin: 'net.serenity-bdd.aggregator'

group 'com.davidcast27'
version '1.0.0'

configurations.all {
    resolutionStrategy {
        force "io.cucumber:cucumber-core:$rootProject.ext.cucumberVersion"
    }
}

repositories {
    mavenCentral()
    mavenLocal()
    jcenter()
}

dependencies {
    testImplementation "net.serenity-bdd:serenity-core:$rootProject.ext.serenityVersion"
    testImplementation "net.serenity-bdd:serenity-junit:$rootProject.ext.serenityVersion"
    implementation "net.serenity-bdd:serenity-screenplay:$rootProject.ext.serenityVersion"
    implementation "net.serenity-bdd:serenity-screenplay-webdriver:$rootProject.ext.serenityVersion"
    testImplementation "net.serenity-bdd:serenity-cucumber4:$rootProject.ext.serenityCucumberVersion"
    testImplementation "io.cucumber:cucumber-core:$rootProject.ext.cucumberVersion"
    testImplementation "io.cucumber:cucumber-junit:$rootProject.ext.cucumberVersion"
    testImplementation 'junit:junit:4.12'
    testImplementation 'org.assertj:assertj-core:3.9.1'
    testImplementation 'org.slf4j:slf4j-simple:1.7.7'
}

gradle.startParameter.continueOnFailure = true