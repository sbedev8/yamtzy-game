#### Yatzy Game Refactoring
- Ce projet est une implémentation du jeu de dés Yatzy, qui a été refactorisé pour améliorer la lisibilité, la maintenabilité et la performance du code.

#### prérquis
- Java 11 ou version supérieure.
- Maven pour la construction du projet.

#### Installation
- Clonez le dépôt Git sur votre machine locale git clone https://github.com/sbedev8/yatzy-game.git
- Ouvrez une console dans le répertoire racine du projet et Exécutez la commande mvn pour construire le projet
    - $ cd <PROJECT_ROOT_PATH>
    - $ mvn clean install
- Exécutez fichier jar pour lancer le jeu.
    - $ java -jar target/yatzy-game-1.0.1.jar

#### lancer le jeu avec docker pour une utilisation immédiate.
- une image a été deployer sur docker hub https://hub.docker.com/r/sbedevhub/yatzy-game
  - $ docker push sbedevhub/yatzy-game:latest
  - $ docker run -it sbedevhub/yatzy-game
