cls
call set-env.cmd
mvn clean verify -Dcucumber.filter.tags="@RegressionTest" -Dcucumber.execution.dry-run=true