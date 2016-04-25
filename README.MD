# 用maven快速新建一个java web工程

用maven新建一个java项目的命令是：

	mvn archetype:generate -DgroupId=com.demo -DartifactId=App

生成的目录结构为：
	
	└── App
    ├── pom.xml
    └── src
        ├── main
        │   └── java
        │       └── com
        │           └── demo
        │               └── App.java
        └── test
            └── java
                └── com
                    └── demo
                        └── AppTest.java

新建一个web项目

	mvn archetype:generate -DgroupId=com.demo -DartifactId=web-app -DarchetypeArtifactId=maven-archetype-webapp

生成目录结构为：

	└── web-app
    ├── pom.xml
    ├── src
    │   └── main
    │       ├── resources
    │       └── webapp
    │           ├── WEB-INF
    │           │   └── web.xml
    │           └── index.jsp
		
		

如果新建一个带java目录的项目就需要自己定制一个archetype，具体做法参考[这里](http://maven.apache.org/guides/mini/guide-creating-archetypes.html)

该项目给maven-archetype-webapp增加了java目录

使用方式：

	1. git clone git@github.com:mir1128/create_java_web_project_one_command.git
	2. cd create_java_web_project_one_command
	3. mvn install
	4. mvn archetype:generate -DarchetypeGroupId=com.loobo -DarchetypeArtifactId=AutoGenerateJavaWebProject -DarchetypeVersion=1.0 -DgroupId=your.group.id -DartifactId=your_artifactId -DinteractiveMode=false
	

新建一个spring 项目

	mvn archetype:generate -DarchetypeGroupId=com.loobo -DarchetypeArtifactId=AutoGenerateSpringWebProject  -DarchetypeVersion=1.0 -DgroupId=com.loobo -DartifactId=TestAutoGenerateSpringProject -DinteractiveMode=false
	
		

