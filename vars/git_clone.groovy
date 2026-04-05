def call(Map config = [:]) {

    def repoUrl = config.url
    def branch = config.branch ?: 'main'
    def credentialsId = config.credId ?: 'git-cred'
    def retries = config.retries ?: 3

    if (!repoUrl) {
        error "Git URL is required"
    }
   
        git(
            url: repoUrl,
            branch: branch,
            credentialsId: credentialsId
        )

    echo "✅ Git checkout successful"
}
