#! /usr/bin/env groovy

pipeline {

      agent any

  stages {
    stage('Build') {
      steps {
        echo 'Building..'
        sh 'mvn clean package'
      }
    }
    /* stage('Create Container Image') {
      steps {
        echo 'Create Container Image..'
        
        script {

          openshift.withCluster() { 
            openshift.withProject("backend") {
  
              def buildConfigExists = openshift.selector("bc", "backend-1").exists() 
    
                if(!buildConfigExists){ 
                  openshift.newBuild("--name=backend-1", "--docker-image=quay.io/obryan5598/springboot-timestamp-pv", "--binary") 
                } 
    
              openshift.selector("bc", "backend-1").startBuild("--from-file=target/spring-boot-hello-world-0.0.1-SNAPSHOT.jar", "--follow") } }

        }
      }
    }
    stage('Deploy') {
      steps {
        echo 'Deploying....'
        script {

          openshift.withCluster() { 
              openshift.withProject("backend") { 
                def deployment = openshift.selector("deployment", "backend-1") 

                if(!deployment.exists()){ 
                  openshift.newApp('backend-1').narrow('svc').expose() 
                } 

                timeout(5) { 
                  openshift.selector("deployment", "backend-1").related('pods').untilEach(1) { 
                    return (it.object().status.phase == "Running") 
                  } 
                } 
              } 
          }

        }
      }
    } */
  }
}
