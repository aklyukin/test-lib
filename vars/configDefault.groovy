#!/usr/bin/env groovy

def call() {
    def config = [
        buildsKeepDays: '20', 
        buildsKeepCount: '5',
        repoKey: 'baf65ed0-2141-4dab-95b1-416e8164550e', 
        ddAPIKey: 'DEFECTDOJO'
    ]
    return config
}
