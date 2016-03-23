To build **pdfInvoice**, [Maven][1] must be installed.

Running install without a profile will generate the **pdfInvoice Community** jars:
```bash
$ mvn clean install \
    -Dmaven.test.skip=true \
    -Dmaven.javadoc.failOnError=false \
    > >(tee mvn.log) 2> >(tee mvn-error.log >&2)
```

To run the tests, [Ghostscript][2] and [Imagemagick][3] must be installed.
```bash
$ mvn clean install \
    -Dmaven.test.failure.ignore=false \
    -DgsExec=$(which gs) \
    -DcompareExec=$(which compare) \
    -Dmaven.javadoc.failOnError=false \
    > >(tee mvn.log) 2> >(tee mvn-error.log >&2)
```

[1]: http://maven.apache.org/
[2]: http://www.ghostscript.com/
[3]: http://www.imagemagick.org/