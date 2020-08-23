::batch files to demonstrate leveraging local copy of maven within the project
mvn -Dmaven.repo.local=$HOME/.my/other/repository clean install
