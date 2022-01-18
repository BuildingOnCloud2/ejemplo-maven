pipeline {
    agent any
    
    stages {
        stage('Donwload-Nexus') {
            steps {
                script {
						bat "curl -X GET -u admin:patito_24 http://localhost:8082/repository/test-repo/com/devopsusach2020/DevOpsUsach2020/0.0.1/DevOpsUsach2020-0.0.1.jar -O"
                    }
                }
            }
        }
		
		stage('Run Code') {
            steps {
                script {
					bat "start /min mvn spring-boot:run &"
                }
            }
        }
		
        stage('Test Code') {
            steps {
                script {
					bat "mvn clean test -e"
                }
            }
        }
			
        stage('UploadNexus') {
            steps {
                script {
                    nexusPublisher nexusInstanceId: 'nexus-server', nexusRepositoryId: 'test-repo', packages: [[$class: 'MavenPackage', mavenAssetList: [[classifier: '', extension: '', filePath: 'C:/Users/psantacruz/Documents/diplomado-devops/ejemplo-sonar-jesus2/ejemplo-maven/build/DevOpsUsach2020-1.0.0.jar']], mavenCoordinate: [artifactId: 'DevOpsUsach2020', groupId: 'com.devopsusach2020', packaging: 'jar', version: '1.0.0']]]
                }
            }
        }
    }
}
