# Локальный запуск сервиса

* Включить в run configuration опцию 'Do not build before run', т.к. с ней почему-то проект не собирается (то JDK не видит, то аннотации Lombok не обрабатывает)
* Собрать через mvn clean build
* Запустить Docker desktop
* Запустить postgres через compose.yaml - 'docker compose up -d'
* Запустить Run configuration
* Swagger доступен по адресу http://localhost:8080/swagger-ui/index.html

# Запуск сервиса в Docker

* Собрать через mvn clean package - в результате в Docker desktop появится собранный образ 'postgresql-jsonb-index/postgresql-jsonb-index:0.0.1-SNAPSHOT'
  * в логах будет ошибка аутентификации при публикации в Docker, но образ все равно поченму-то опубликуется
* Запустить Docker desktop
* Запустить всё через compose-all.yaml 'docker compose -f compose-all.yaml up -d'
* Swagger доступен по адресу http://localhost:8080/swagger-ui/index.html