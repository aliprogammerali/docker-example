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

I used this https://github.com/bezkoder/docker-compose-spring-boot-mysql in this repository.
