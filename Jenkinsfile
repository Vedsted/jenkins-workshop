node {
    stage('Preparation') { 
        git branch: 'master', credentialsId: 'vedsted', url: 'git@github.com:Vedsted/jenkins-workshop.git'
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