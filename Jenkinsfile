pipeline {
  agent  { label 'jdk21' }

  tools {
    maven "3.8.5"
  }
  
  parameters {
    password(name: 'CONTRASENIA', defaultValue: 'esta_es_mi_contra', description: 'Ingresar contrasenia')
  }
  
  stages {
    stage ('ejemplo') {
      steps {
        echo params.CONTRASENIA
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