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
        stage('Email Notification') {
            steps {
                mail bcc: '', body: '''sent the mail, whenever pipeline is  failed, test, build...
                Thank You''', cc: '', from: '', replyTo: '', subject: 'trigger build', to: 'cloudengg625@gmail.com'
            }
        }

        stage('Prod') {
            steps {
                echo 'Prod stage is running...'
            }
        } 
    }
}
