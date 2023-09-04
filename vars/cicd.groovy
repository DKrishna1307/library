def gitDownload(repo)
{
  git "https://github.com/DKrishna1307/${repo}.git"
}
def gitbuild()
{
  sh "mvn package"
}
def gitdeploy(pipelinejob,IP,appname)
{
  sh "scp /var/lib/jenkins/workspace/${pipelinejob}/webapp/target/webapp.war ubuntu@${IP}:/var/lib/tomcat9/webapps/${appname}.war"
}
def gittest(repo,pipelinejob)
{
  git "https://github.com/DKrishna1307/${repo}.git"
  sh "java -jar /var/lib/jenkins/workspace/${pipelinejob}/testing.jar"
}
def gitdelivery(pipelinejob,IP,appname)
{
  sh "scp /var/lib/jenkins/workspace/${pipelinejob}/webapp/target/webapp.war ubuntu@${IP}:/var/lib/tomcat9/webapps/${appname}.war"
}


  
