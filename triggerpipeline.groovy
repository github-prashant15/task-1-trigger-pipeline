pipeline {
    agent any

    stages {
        stage('Pull') {
            steps {
                echo 'Pull stage is running...'
            }
        }
        tage('Build') {
            steps {
                echo 'Build stage is running...'
            }
        }
        stage('Test') {
            steps {
                echo 'Test stage is running...'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploy stage is running...'
            }
        } 
    }
}
