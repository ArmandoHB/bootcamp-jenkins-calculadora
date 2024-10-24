pipeline {
  agent any

  tools {
    maven "3.9.0"
  }

  stages {
    stage('Build') {
      steps {
        bat 'mvn -B -q package'
      }
    }
  }

}
