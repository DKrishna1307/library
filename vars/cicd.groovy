def gitDownload(repo)
{
  git "https://github.com/DKrishna1307/${repo}.git"
}
def gitbuild()
{
  sh 'mvn package'
}



  
