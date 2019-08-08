pipeline{
        agent any
        stages{
                stage('---build---'){
                        steps{
                               sh "docker build -t ayshamarty/account-consumer ."
                        }
                }
                stage('---push---'){
                        steps{
                                sh "docker push ayshamarty/account-consumer"
                        }
                }

                stage('---redeploy stack---') {
                    steps {
                            build job: "Account-API-Deploy", wait: true

                        }
                }
        }
}
