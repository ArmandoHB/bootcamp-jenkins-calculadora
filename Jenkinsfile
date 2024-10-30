pipeline {
  agent  { label 'jdk21' }

  tools {
    maven "3.8.5"
  }
  
  parameters {
    string(name: 'CONTRASENIA', defaultValue: 'esta_es_mi_contra', description: 'Ingresar contrasenia')
  }
  
  stages {
    stage ('ejemplo') {
      steps {
        echo params.CONTRASENIA
      }
    }
    stage ('Example') {
      steps {
        echo "Hello World"
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
  
  post {
    always {
      mail to: 'eli.liza.moon@gmail.com, josepp0117@gmail.com, pietromineralle@gmail.com, kiregon@gmail.com, ing.armandohb@gmail.com, lreyeso1001@gmail.com',
        subject: env.JOB_NAME,
        body: currentBuild.currentResult + ': ' + env.BUILD_URL
    }
  }
  

}