def call(String url, String branch, String credId){
  script{
     git url:"${url}", branch:"${branch}", credentialsId:"${credId}"
  }
 
}
