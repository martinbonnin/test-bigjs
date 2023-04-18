To reproduce:

```
rm -rf build
# run test a first time
./gradlew jsNodeTest -i
# re-run tests, they will be executed despite no input changing
./gradlew jsNodeTest -i
```

The second test run is executed with the following logs:

```
> Task :jsNodeTest
Caching disabled for task ':jsNodeTest' because:
  Build cache is disabled
Task ':jsNodeTest' is not up-to-date because:
  Input property 'runtimeClasspath' file /Users/mbonnin/git/test-bigjs/build/js/node_modules/big.js/big.js has been removed.
```

