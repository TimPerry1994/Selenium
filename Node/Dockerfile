FROM provisioning_java
MAINTAINER Tim Perry

COPY ./shared/* /opt
WORKDIR /opt
RUN apt-get update
RUN apt-get install -y ufw sudo
RUN sed -i -e 's/DEFAULT_FORWARD_POLICY="DROP"/DEFAULT_FORWARD_POLICY="ACCEPT"/g' /etc/default/ufw
RUN ufw reload
RUN wget http://chromedriver.storage.googleapis.com/2.25/chromedriver_linux64.zip
RUN gunzip chromedriver_linux64.zip
#ENTRYPOINT java -jar selenium-server-standalone-3.0.1.jar -role node -hub http://52.212.157.63:4444/grid/register -browser browserName=chrome -port 5555

EXPOSE 4444
EXPOSE 80
EXPOSE 5555
