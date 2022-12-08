# kotlin-todo

[![Website](https://img.shields.io/website-up-down-green-red/http/shields.io.svg?label=elky-essay)](https://elky84.github.io)
![Made with](https://img.shields.io/badge/made%20with-Kotlin-brightgreen.svg)
![Made with](https://img.shields.io/badge/made%20with-SpringBoot3-blue.svg)
![Made with](https://img.shields.io/badge/made%20with-MySQL-red.svg)

![GitHub forks](https://img.shields.io/github/forks/elky84/kotlin-todo.svg?style=social&label=Fork)
![GitHub stars](https://img.shields.io/github/stars/elky84/kotlin-todo.svg?style=social&label=Stars)
![GitHub watchers](https://img.shields.io/github/watchers/elky84/kotlin-todo.svg?style=social&label=Watch)
![GitHub followers](https://img.shields.io/github/followers/elky84.svg?style=social&label=Follow)

![GitHub](https://img.shields.io/github/license/mashape/apistatus.svg)
![GitHub repo size in bytes](https://img.shields.io/github/repo-size/elky84/kotlin-todo.svg)
![GitHub code size in bytes](https://img.shields.io/github/languages/code-size/elky84/kotlin-todo.svg)

# kotlin-todo

## 소개
* Kotlin + Spring Boot + JPA 예제입니다.
* DB는 MySQL을 사용했습니다.
* 간단한 기능 예제입니다.

## 설정
* application.properties 혹은 가동하실 환경에 맞는 application-{환경}.properties 파일을 구성하시고, DB 설정을 하시면 됩니다.
* 실행인자로 datasource 부분을 넘기셔도 무방합니다
    * "-Dspring.datasource.url=jdbc:mysql://{ip}:{port}/{db} -Dspring.datasource.username={username} Dspring.datasource.password={password}"