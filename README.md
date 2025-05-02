Running `mvn clean install site site:stage` yields the website which is deployed at
https://seekm.github.io/maven-spotbugs-plugin-multi-module-reporting-test/index.html.

If ones compares the project reports of the [parent/aggregating project](https://seekm.github.io/maven-spotbugs-plugin-multi-module-reporting-test/project-reports.html), the [child1 project](https://seekm.github.io/maven-spotbugs-plugin-multi-module-reporting-test/child-1/project-reports.html) and
the [child2 project](https://seekm.github.io/maven-spotbugs-plugin-multi-module-reporting-test/child-2/project-reports.html), one can see that the parent/aggregating project contains the Checkstyle results of both
children projects (combined), but it doesn't contain any Spotbugs results of the children
projects.