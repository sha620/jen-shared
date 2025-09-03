def call(){
  sh "trivy fs . -o few.json"
}
