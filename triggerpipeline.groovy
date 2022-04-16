pipeline {
    agent any

    stages {
        stage('Pull') {
            steps {
                git 'https://github.com/github-prashant15/task-1-trigger-pipeline.git'
            }
        }
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
        stage('Deploy') {
            steps {
                echo 'Deploy stage is running...'
            }
        } 
        stage('Prod') {
            steps {
                echo 'Prod stage is running...'
            }
        } 
    }
}
