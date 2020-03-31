#!/usr/bin/env groovy

def call() {
    return [
        buildsKeepDays: '10', 
        buildsKeepCount: '2',
    ]
}
