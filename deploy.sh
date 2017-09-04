#!/usr/bin/env bash
echo '******package start******'
mvn clean package -Dmaven.test.skip=true
echo '******package end******'

echo '******rm root.war start******'
rm /home/dogmell/jetty/webapps/root.war
echo '******rm root.war end******'

echo '******cp root.war start******'
cp target/root.war /home/dogmell/jetty/webapps
echo '******cp root.war end******'

echo '******jetty restart******'
sh /home/yangzhengren/jetty/bin/jetty.sh restart