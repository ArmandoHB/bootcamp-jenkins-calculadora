pipeline {
  agent  { label 'jdk21' }

  tools {
    maven "3.8.5"
  }
  
  parameters {
    string(name: 'ENTRADA', defaultValue: 'Hola', description: 'Un parametro requerido')
  }
  
  stages {
    stage ('ejemplo') {
      steps {
        echo params.ENTRADA
      }
    }
    
    stage('Build') {
      steps {
        bat 'mvn -B -q package'
      }
      post {
        always {
          junit 'target/surefire-reports/*.xml'
        }
      }
    }
  }

}