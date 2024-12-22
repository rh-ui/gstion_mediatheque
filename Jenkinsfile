pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Cloner le code depuis GitHub
                git branch: 'main', url: 'https://github.com/username/mon-projet.git'
            }
        }

        stage('Build') {
            steps {
                script {
                    // Compiler avec Ant (assurez-vous que 'Ant' est installé dans Jenkins)
                    sh 'ant build'
                }
            }
        }

        stage('Test') {
            steps {
                script {
                    // Ici vous pouvez ajouter des tests (par exemple, via JUnit)
                    echo 'Tests effectués !'
                }
            }
        }

        stage('Deploy') {
            steps {
                // Ajoutez vos étapes de déploiement ici (par exemple, copier le .jar sur un serveur)
                echo 'Déploiement en cours...'
            }
        }
    }

    post {
        always {
            echo 'Le pipeline est terminé.'
        }
    }
}
