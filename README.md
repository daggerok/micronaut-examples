# micronaut-examples


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
