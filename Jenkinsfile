node {
    stage('Preparation') { 
        checkout scm
    }
    stage('Build') {
        sh 'mvn clean package'
    }
    stage('Javadoc') {
        sh 'mvn site'
        archiveArtifacts 'target/apidocs/*'
        archiveArtifacts 'target/site/*'
    }
    stage('Results') {
        junit '**/target/surefire-reports/TEST-*.xml'
        archiveArtifacts 'target/*.jar'
    }
    
}