FROM provisioning_java
MAINTAINER Tim Perry

COPY ./shared/* /opt
WORKDIR /opt
RUN apt-get update
RUN apt-get install -y ufw sudo unzip
RUN sed -i -e 's/DEFAULT_FORWARD_POLICY="DROP"/DEFAULT_FORWARD_POLICY="ACCEPT"/g' /etc/default/ufw
RUN ufw reload
RUN wget http://chromedriver.storage.googleapis.com/2.25/chromedriver_linux64.zip
RUN unzip chromedriver_linux64.zip
ENTRYPOINT java -Dwebdriver.chrome.driver=/opt/chromedriver -jar selenium-server-standalone-3.0.1.jar -role webdriver -hub  http://52.212.136.82:4444/grid/register -browser browserName=chrome,platform=LINUX -port 5555

EXPOSE 4444
EXPOSE 80
EXPOSE 5555
