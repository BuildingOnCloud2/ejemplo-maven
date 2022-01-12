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
        stage('Sonar Checks') {
            steps {
                script {
                    dir ('/Users/jaruizf/repos/ejemplo-maven'){
                    mvn clean verify sonar:sonar -Dsonar.projectKey=ejemplo-maven-developer -Dsonar.host.url=http://localhost:9000 -Dsonar.login=2b279675b49f672d1c8f636d32b525d37512408c
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
