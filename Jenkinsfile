pipeline {
    agent any
    
    stages {
        stage('Compile Code') {
            steps {
                script {
                    dir ('/Users/jaruizf/repos/ejemplo-maven'){
                        sh 'mvn clean compile -e'
                    }
                }
            }
        }
        stage('Test Code') {
            steps {
                script {
                    dir ('/Users/jaruizf/repos/ejemplo-maven'){
                        sh 'mvn clean test -e'
                    }
                }
            }
        }
        stage('Jar Code') {
            steps {
                script {
                    dir ('/Users/jaruizf/repos/ejemplo-maven'){
                        sh 'mvn clean package -e'
                    }
                }
            }
        }
        stage('Run Jar') {
            steps {
                script {
                    dir ('/Users/jaruizf/repos/ejemplo-maven'){
                        sh 'nohup bash mvn spring-boot:run &'
                        sleep 20
                    }
                }
            }
        }
        stage('Testing App') {
            steps {
                script {
                    dir ('/Users/jaruizf/repos/ejemplo-maven'){
                        sh "curl -X GET 'http://localhost:8081/rest/mscovid/test?msg=testing'"
                    }
                }
            }
        }
    }
}
