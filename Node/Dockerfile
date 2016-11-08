FROM provisioning_java
MAINTAINER Tim Perry

COPY /root/Docker/Selenium/Hub/shared/* /opt
WORKDIR /opt
ENTRYPOINT java -jar selenium-server-standalone-3.0.1.jar -role node -hub http://52.212.157.63/grid/register 
