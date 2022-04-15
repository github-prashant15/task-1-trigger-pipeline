pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Build stage is running...'
            }
        }
        stage('Test') {
            steps {
                echo 'Test stage is running...'
            }
        }
    }
}
