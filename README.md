# micronaut-examples [![Build Status](https://travis-ci.org/daggerok/micronaut-examples.svg?branch=master)](https://travis-ci.org/daggerok/micronaut-examples)
Nothing interesting here...

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
