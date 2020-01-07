# Quality Assurance Rules for Java
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)
![](https://img.shields.io/badge/package-JAR-blue) 
![](https://img.shields.io/badge/Java-8%2B-d6a827)
![](https://github.com/wigforss/qa-rules/workflows/Test%20and%20Deploy/badge.svg) 

QA Rules for Java Projects.

This package contains common QA rule sets for:

* CheckStyle
* PMD

As well as a code style template for Idea Intelij.

For Java 8 (or less) there are coverage ignore annotations, which can be configured with Cobertura.
```
@org.kasource.qa.annotation.CoverageIgnore
@org.kasource.qa.annotation.Generated
```
