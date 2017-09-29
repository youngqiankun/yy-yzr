#!/usr/bin/env bash
echo '******git pull start******'
git pull
echo '******git pull end********'
sh /home/yangzhengren/jetty/bin/jetty.sh stop

mvn clean package -Dmaven.test.skip=true

rm /home/yangzhengren/jetty/webapps/root.war

cp target/root.war /home/yangzhengren/jetty/webapps

sh /home/yangzhengren/jetty/bin/jetty.sh start
