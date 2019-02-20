# micronaut-examples [![Build Status](https://travis-ci.org/daggerok/micronaut-examples.svg?branch=master)](https://travis-ci.org/daggerok/micronaut-examples)

## installation

_install micronout CLI by using [sdkman](https://sdkman.io/install)_

```bash
sdk install micronaut
```

[read more](https://docs.micronaut.io/snapshot/guide/index.html#buildCLI)

_generate new app by using mn CLI_

```bash
mn create-app com.github.daggerok.micronaut-example --features=kotlin
```

[read more](https://guides.micronaut.io/creating-your-first-micronaut-app-kotlin/guide/index.html)

Finally, you have to check if IDEA has annotation processing option enabled

## build and test generated project

```bash
cd micronaut-example/
./gradlew installDist
bash ./build/install/micronaut-example/bin/micronaut-example
http :8080
```

or open http://127.0.0.1:8080/

TODO: Add custom project installation and configuration

_maven_

```xml
<!-- TODO.. -->
```

_gradle_

```kotlin
// TODO...
```

## build run and test

_maven / windows_

```cmd
mvnw
set project=starter
java -jar .\%project%\target\*-all.jar
```

_gradle / unix_

```bash
./gradlew
export project=starter
mv -f ./${project}/build/install/${project} ./${project}/build/
bash ./${project}/build/${project}/bin/${project}
```
