pluginManagement {
    repositories {
//        maven { url = uri("https://maven.aliyun.com/repository/google")}
//        maven { url = uri("https://maven.aliyun.com/repository/central")}
//        maven { url = uri("https://maven.aliyun.com/repository/public")}
//        maven { url = uri("https://maven.aliyun.com/nexus/content/repositories/google")}
//        maven { url = uri("https://maven.aliyun.com/nexus/content/groups/public")}
        gradlePluginPortal()
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
//        mavenLocal()
//        maven { url 'https://repo.nju.edu.cn/repository/maven-public/' }
//        maven { url = uri("https://maven.aliyun.com/repository/google")}
//        maven { url = uri("https://maven.aliyun.com/repository/central")}
//        maven { url = uri("https://maven.aliyun.com/repository/public")}
//        maven { url = uri("https://maven.aliyun.com/nexus/content/repositories/google")}
//        maven { url = uri("https://maven.aliyun.com/nexus/content/groups/public")}
////        maven { url 'https://maven.aliyun.com/nexus/content/repositories/jcenter'}
        mavenCentral()
        google()
    }
}

rootProject.name = "DokkaSample"
include(":app")
include(":lib")
include(":lib1")
include(":lib:lib2")
include(":lib:b")
