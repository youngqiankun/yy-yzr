#!/usr/bin/env bash
mvn clean package -Dmaven.test.skip=true
scp target/root.war yzr@116.62.56.67:/home/yzr/jetty/webapps

