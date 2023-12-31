# JavaSE_Exercise8_solution_including_github_actions

## How to create a new Java(including Maven) application in VSCode
![image1_open_project_folder_in_vscode](https://github.com/luiscoco/JavaSE_Exercise8_solution_including_github_actions/assets/32194879/4bb3cfd1-c1f2-41e3-bc1b-6559d4cab097)


![image2_create__java_project](https://github.com/luiscoco/JavaSE_Exercise8_solution_including_github_actions/assets/32194879/ceb8ef9c-4a5f-4a08-9030-fb6848644961)


![image3_select__new_maven_project](https://github.com/luiscoco/JavaSE_Exercise8_solution_including_github_actions/assets/32194879/fb0c525d-2c07-40e3-882e-87e9d931e2b0)


![image4_select__maven_archetype-quickstart](https://github.com/luiscoco/JavaSE_Exercise8_solution_including_github_actions/assets/32194879/f6f470e7-2922-4af4-b0d6-a44e8c2198b1)


![image5_select__maven_version_archetype-quickstart](https://github.com/luiscoco/JavaSE_Exercise8_solution_including_github_actions/assets/32194879/218304a7-8aef-4e83-98c9-877865bbbd3a)


![image6_input_group_id_of_the_project](https://github.com/luiscoco/JavaSE_Exercise8_solution_including_github_actions/assets/32194879/7cb276a7-7d1e-4352-bd8a-5ac34d4f7ac4)


![image7_input_artifact_id](https://github.com/luiscoco/JavaSE_Exercise8_solution_including_github_actions/assets/32194879/e99d56c9-48f7-43a5-aedc-857d4de424f1)


![image8_select_project_folder](https://github.com/luiscoco/JavaSE_Exercise8_solution_including_github_actions/assets/32194879/e1a05b39-f979-4967-9168-7eee1b51b694)

## How running the debugging the Java application

![How to run and debug the Java application image 1](https://github.com/luiscoco/JavaSE_Exercise8_solution_including_github_actions/assets/32194879/12e2c767-4a25-4fa8-9915-feb19d156a4b)


![How to run and debug the Java application image 2](https://github.com/luiscoco/JavaSE_Exercise8_solution_including_github_actions/assets/32194879/862e098d-57c3-47a2-9e0d-35557d0214da)


![How to run and debug the Java application image 3](https://github.com/luiscoco/JavaSE_Exercise8_solution_including_github_actions/assets/32194879/1b57ae3e-120b-4dc6-8648-f37e943f7314)


![How to run and debug the Java application image 4](https://github.com/luiscoco/JavaSE_Exercise8_solution_including_github_actions/assets/32194879/635f349c-705c-43a5-982a-edd2aa04b7e1)


![How to run and debug the Java application image 5](https://github.com/luiscoco/JavaSE_Exercise8_solution_including_github_actions/assets/32194879/d7ba9110-53dc-4ba3-a8e6-01ef9aa3069c)


## How to run/debug the application with commands in VSCode

Run the command to install the dependencies:

```
PS C:\Java SE Luxoft training\Exercise8_solution_with_github_actions\exercise8_solution> mvn clean install exec:java 
```
After executing the above command the "target" folder is created. As we show in the next sections in this file, we also created
a .gitignore file to avoid pushing the "target" folder from the VSCode to github.

Run the command to start the application:

```
mvn exec:java
```

## This is the build.yml file for Github actions

```yml
name: Java CI

on:
  push:
    branches:
      - main
  pull_request:
    branches:
      - main

jobs:
  build:

    runs-on: ubuntu-latest

    steps:
    - uses: actions/checkout@v2

    - name: Set up JDK 11
      uses: actions/setup-java@v2
      with:
        java-version: 11
        distribution: 'adopt'
        server-id: github
        server-username: GITHUB_ACTOR
        server-password: GITHUB_TOKEN

    - name: Use Node.js 16.x
      uses: actions/setup-node@v2
      with:
        node-version: 16

    - name: Build with Maven
      run: mvn package

    - name: Generate JavaDocs
      run: mvn javadoc:javadoc

    - name: Run tests
      run: mvn test
```

## How to create a .gitignore file to remove the "target" folder from the pushed commits

In VSCode create  a new ".gitignore" file, in the project root.

![How to create a  gitignore file](https://github.com/luiscoco/JavaSE_Exercise8_solution_including_github_actions/assets/32194879/18a09839-d3d5-4ded-bcbc-b5e53cd974b5)


The "target" folder is created after running this command:
```
mvn clean install exec:java
```









































