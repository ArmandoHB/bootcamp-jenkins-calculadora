pipeline {
  agent any

  tools {
    maven "3.8.5"
  }

  stages {
    stage('Build') {
      steps {
        bat 'mvn -B -q package'
      }
    }
  }

}
