node('linux')
{
  stage('Build') {
    build job: 'Port-Pipeline', parameters: [string(name: 'PORT_GITHUB_REPO', value: 'https://github.com/ZOSOpenTools/bashport.git'), string(name: 'PORT_DESCRIPTION', value: 'Bash is the GNU Project's shell—the Bourne Again SHell' )]
  }
}
