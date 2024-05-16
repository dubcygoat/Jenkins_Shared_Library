def call() {
    sh 'trivy image dubcygoat/youtube:latest > trivyimage.txt'
}