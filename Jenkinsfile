// Use the following Jenkinsfile just when local Jenkins is installed

node {
    def app
    def buildoutput
    def image

    stage('Clone repository') {
        sh 'rm -rf ./spring-boot-hello-world'
        sh 'git clone https://github.com/obryan5598/spring-boot-hello-world.git && git checkout remotes/origin/quay'

    }

    stage('Build image') {
        buildoutput = sh (script: 'podman build -t spring-boot-hello-world .',
            returnStdout: 'true').trim()
        image = buildoutput.substring(buildoutput.lastIndexOf("\n")).trim();

    }


    stage('Push image') {
        sh "echo Pushing image: $image via Podman"
        sh "podman push $image docker://quay.io/obryan5598/spring-boot-hello-world:1.0"
        
    }
}
