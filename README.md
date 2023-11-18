# With docker

- Set profile to docker in appliation.properties
```
spring.profiles.active=docker
```

- Just run
```
docker-compose up
```


# Without docker

- Set profile to dev in appliation.properties
```
spring.profiles.active=dev
```

- Just run
```
mvn spring-boot:run
```


