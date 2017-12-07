[![Release](https://jitpack.io/v/Eddykasp/mathutil.svg)](https://jitpack.io/#Eddykasp/mathutil)
# mathutil

## Getting started

### Installing
You can use JitPack to add this project as a dependency to your project using Gradle, Maven, sbt or Leiningen.
#### Gradle
1. Add the JitPack repository to your build file 

    Add it in your root build.gradle at the end of repositories:
    ```
    allprojects {
      repositories {
        ...
        maven { url 'https://jitpack.io' }
      }
    }
    ```
2. Add dependency (Tag should be the desired release)

    ```
    dependencies {
      compile 'com.github.Eddykasp:mathutil:Tag'
    }
    ```
#### Maven
1. Add the JitPack repository to your build file 

    ```
    <repositories>
      <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
      </repository>
    </repositories>
    ```
2. Add dependency (Tag should be the desired release)

    ```
    <dependency>
      <groupId>com.github.Eddykasp</groupId>
      <artifactId>mathutil</artifactId>
      <version>Tag</version>
    </dependency>
    ```
#### sbt
1. Add the JitPack repository to your build file 

    Add it in your build.sbt at the end of resolvers:
    ```
    resolvers += "jitpack" at "https://jitpack.io"
    ```
2. Add dependency (Tag should be the desired release)

    ```
    libraryDependencies += "com.github.Eddykasp" % "mathutil" % "Tag"
    ```
#### Leiningen
1. Add the JitPack repository to your build file 

    Add it in your project.clj at the end of repositories:
    ```
    :repositories [["jitpack" "https://jitpack.io"]]
    ```
2. Add dependency (Tag should be the desired release)
   
   ```
   :dependencies [[com.github.Eddykasp/mathutil "Tag"]]
   ```
