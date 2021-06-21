/*
 * Copyright 2019 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

enableFeaturePreview("VERSION_CATALOGS")
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    repositories {
        mavenCentral()
        google()

        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        google()

        jcenter {
            content {
                includeGroup("org.jetbrains.trove4j")
                includeGroup("org.jetbrains.kotlinx")
            }
        }
    }
}

includeBuild("resources-generator")
include(":resources")

include(":sample:android-app")
include(":sample:android-mpp-app")
include(":sample:mpp-library")
include(":sample:mpp-library:nested-module")
include(":sample:mpp-conditional")
include(":sample:mpp-hierarhical")
include(":sample:mpp-mixed")
