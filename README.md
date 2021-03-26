# Demo for Snyk Maven Plugin

This project is to demo the `snyk-maven-plugin`. For more information about the plugin, see the [GitHub repository](https://github.com/snyk/snyk-maven-plugin).

## Use

To invoke the Snyk Maven Plugin, you can run a Maven Lifecycle Phase.

For example, to execute `snyk test`:

```
./mvnw test
```

To execute `snyk test` and `snyk monitor`:
```
./mvnw install
```

If you want to run the regular tests in the project but skip the `snyk test`, you can use this:
```
./mvnw test -Dsnyk.skip
```
