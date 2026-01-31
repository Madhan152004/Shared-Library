def call(String url, String branch, String credId){
     git url:"${url}", branch:"${branch}", credentialsId:"${credId}"
}
