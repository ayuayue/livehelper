
.PHONY: package
package:
	mvn  -DarchetypeCatalog=internal clean package

.PHONY: clean
clean:
	mvn clean

.PHONY: run
run:
	mvn spring-boot:run


.PHONY: compile
compile:
	 mvn compile

## run a jar file on different environment
.PHONY: dev
dev:
	make package
	java -Dspring.profiles.active=dev -jar target/livehelper-0.0.1-SNAPSHOT.jar

.PHONY: pro
pro:
	make package
	java -Dspring.devtools.restart.enabled=false -Dspring.profiles.active=pro -jar target/livehelper-0.0.1-SNAPSHOT.jar

.PHONY: test
test:
	make package
	java -Dspring.profiles.active=test -jar target/livehelper-0.0.1-SNAPSHOT.jar