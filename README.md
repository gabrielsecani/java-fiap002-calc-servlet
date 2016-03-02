rem ## Set http.sslcainfo to the absolute path of the curl-ca-bundle.crt file in your msysGit installs bin folder
rem git config --system http.sslcainfo \bin/curl-ca-bundle.crt
rem ## Disable ssl verification
rem git config --global http.sslverify "false"

rem ## fonte: https://aircrack.wordpress.com/2014/02/12/problem-solving-git-error-setting-certificate-verify-locations/

git config --system http.sslcainfo c:\\git\\mingw64\\ssl\\certs\\ca-bundle.crt

git config --system user.name Gabriel Lucas
git config --system user.email gabrielltr84@gmail.com

git config --system user.name Lucas Gomide
git config --system user.email lucaslg200@gmail.com

git config --system user.name Fernando Seguim
git config --system user.email fernando.seguim@gmail.com

# README #

This README would normally document whatever steps are necessary to get your application up and running.

### What is this repository for? ###

* Quick summary
* Version
* [Learn Markdown](https://bitbucket.org/tutorials/markdowndemo)

### How do I get set up? ###

* Summary of set up
* Configuration
* Dependencies
* Database configuration
* How to run tests
* Deployment instructions

### Contribution guidelines ###

* Writing tests
* Code review
* Other guidelines

### Who do I talk to? ###

* Repo owner or admin
* Other community or team contact