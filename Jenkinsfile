pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                checkout scmGit(branches: [[name: '*/Multimodule']], extensions: [], userRemoteConfigs: [[credentialsId: 'c8a5380f-3b32-4369-b953-865791ec8542', url: 'https://github.com/BharadwajaC/DemoAPiTest.git']])
            }
        }
        
        // stage('Build Overall') {
        //     steps {
        //         script {
        //             sh 'mvn -v'
        //             sh 'mvn clean install'
        //         }
        //     }
        // }
        stage('Build and Test') {
            steps {
                script {
                    // Loop through submodules and run Maven clean test
                    def submodules = ['BookStore', 'ms-payment']
                    
                    for (def submodule in submodules) {
                        dir(submodule) {
                            sh 'mvn clean install'
                        }
                    }
                }
            }
        }
    }
}
