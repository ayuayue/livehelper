
.PHONY: package
package:
	mvn   clean package -DarchetypeCatalog=internal

.PHONY: clean
clean:
	mvn clean

.PHONY: install
install:
	mvn clean install

# 以 debug 模式运行
.PHONY: debug
debug:
	mvn spring-boot:run -Dspring-boot.run.jvmArguments="-Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=y,address=5005"
.PHONY: run
run:
	mvn spring-boot:run

.PHONY: compile
compile:
	 mvn clean compile

## run a jar file on different environment
.PHONY: dev
dev:
	make clean package
	java -Dspring.profiles.active=dev -jar target/livehelper-0.0.1-SNAPSHOT.jar

.PHONY: pro
pro:
	make clean package
	java -Dspring.devtools.restart.enabled=false -Dspring.profiles.active=pro -jar target/livehelper-0.0.1-SNAPSHOT.jar

.PHONY: test
test:
	make clean package
	java -Dspring.profiles.active=test -jar target/livehelper-0.0.1-SNAPSHOT.jar