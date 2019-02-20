# micronaut-examples

_maven / windows_

```bash
./mvnw -f ./starter/pom.xml
java -jar ./starter/target/*-all.jar
```

_gradle / unix_

```bash
./gradlew -b ./starter/build.gradle.kts
mv -f ./starter/build/install/starter ./starter/build/
bash ./starter/build/starter/bin/starter
```
