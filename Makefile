
.PHONY:  clean package install run debug  compile pro  dev test
package:
	mvn   clean package -DarchetypeCatalog=internal

clean:
	mvn clean

install:
	mvn clean install

# 以 debug 模式运行
debug:
	mvn clean spring-boot:run -Dspring-boot.run.jvmArguments="-Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=y,address=5005"
run:
	mvn clean spring-boot:run

compile:
	 mvn clean compile

## run a jar file on different environment
dev:
	make clean package
	java -Dspring.profiles.active=dev -jar target/livehelper-0.0.1-SNAPSHOT.jar

pro:
	make clean package
	java -Dspring.devtools.restart.enabled=false -Dspring.profiles.active=pro -jar target/livehelper-0.0.1-SNAPSHOT.jar

test:
	make clean package
	java -Dspring.profiles.active=test -jar target/livehelper-0.0.1-SNAPSHOT.jar