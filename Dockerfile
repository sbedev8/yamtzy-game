FROM openjdk:11.0.16-jdk
WORKDIR /yatzy-app
ADD target/yatzy-game-1.0.1.jar yatzy-game-1.0.1.jar
ENTRYPOINT java -jar yatzy-game-1.0.1.jar