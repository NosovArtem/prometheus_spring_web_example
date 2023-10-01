### Установите докер.

Создайте докер контейнер с помощью команды, точка не лишняя.

```
docker build -t spring-web-app:latest .
```

### Docker commands:

1. Список запущенных контейнеров:

```
docker compose up -d
```
```
docker compose down
```

```
docker ps
```

2. Список всех контейнеров (включая остановленные)

```
docker ps -a
```

3. Больше информации о контейнере

```
docker inspect <container-id>
```

4. Удалить один или несколько контейнеров.

```
docker rm <container-id-1> <container-id-2>
```

5. Удалить все остановленные контейнеры

```
docker container prune
```

6. Остановить контейнер

```
docker stop <container-id>
```

7. Логи

```
docker logs <container-id>
docker logs -f my-container # Следить за логами в режиме "живого" вывода
docker logs --since 2022-01-01T00:00:00Z my-container # Вывести логи, начиная с определенного времени
docker logs --tail 100 my-container # Вывести последние 100 строк логов
```

8. Подключиться к linux контейнеру

```
docker exec -it <my-container> sh
```
