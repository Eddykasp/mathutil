# Installing

1. [Install dependency using JitPack](https://github.com/Eddykasp/mathutil/blob/master/docs/INSTALLING.md#JitPack)
2. [Build from source](https://github.com/Eddykasp/mathutil/blob/master/docs/INSTALLING.md#Source)

## JitPack
You can use JitPack to add this project as a dependency to your project using Gradle, Maven, sbt or Leiningen. View this project on [JitPack](https://jitpack.io/#Eddykasp/mathutil) or follow the instructions below.
### Gradle
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
### Maven
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
### sbt
1. Add the JitPack repository to your build file 

    Add it in your build.sbt at the end of resolvers:
    ```
    resolvers += "jitpack" at "https://jitpack.io"
    ```
2. Add dependency (Tag should be the desired release)

    ```
    libraryDependencies += "com.github.Eddykasp" % "mathutil" % "Tag"
    ```
### Leiningen
1. Add the JitPack repository to your build file 

    Add it in your project.clj at the end of repositories:
    ```
    :repositories [["jitpack" "https://jitpack.io"]]
    ```
2. Add dependency (Tag should be the desired release)
   
   ```
   :dependencies [[com.github.Eddykasp/mathutil "Tag"]]
   ```

## Source
You can also build the project yourself from source using Maven. Clone the repository or download the desired [release](https://github.com/Eddykasp/mathutil/releases). Use ```mvn install``` to build the project.
   
