# maven-plugin-version-issue
Just a sample repo for a bug

## Run 
```
./gradlew :sub:generateMavenPluginDescriptor
```

## Inspect
Note blank or missing version in all cases

- `./sub/build/maven-plugin/maven/plugin.xml`
    
    Expected:
    ```xml
    <dependency>
      <groupId>com.google.guava</groupId>
      <artifactId>guava</artifactId>
      <type>jar</type>
      <version></version>
    </dependency>
    ```
    
    Actual:
    ```xml
    <dependency>
      <groupId>com.google.guava</groupId>
      <artifactId>guava</artifactId>
      <type>jar</type>
      <version>27.0.1-jre</version>
    </dependency>
    ```
