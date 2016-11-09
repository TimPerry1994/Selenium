FROM provisioning_java
MAINTAINER Tim Perry

COPY ./shared/* /opt
WORKDIR /opt
ENTRYPOINT java -jar selenium-server-standalone-3.0.1.jar -role node -hub  http://52.212.136.82:4444/grid/register -browser browserName=firefox,platform=LINUX -port 5555

EXPOSE 4444
EXPOSE 80
EXPOSE 5555
