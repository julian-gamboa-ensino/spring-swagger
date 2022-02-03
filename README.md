# Documentação Swagger

Uma forma de agilizar o desenvolvimento de projetos com Spring pode ser integrando Swagger desde a fase inicial de desenvolvimento. Com este fim é preciso usar dita depedência (**[muito popular para os usuários MAVEN](https://mvnrepository.com/artifact/io.springfox/springfox-swagger-ui)**) que permite:
- Criar , de forma **muito assistida**, a documentação relativa sobre os @RESTController e @Controller de um projeto SrpingBoot
- Limitar o uso de clientes como POSTMAN no momento de aplicação do **método do TDD manual**
- 

A documentação oficial indica que forma de inserir dita dependecia no POM.XML é:

```xml
  <!-- https://mvnrepository.com/artifact/io.springfox/springfox-swagger-ui -->
  <dependency>
      <groupId>io.springfox</groupId>
      <artifactId>springfox-swagger-ui</artifactId>
      <version>pom</version>
  </dependency>
```
E no caso deste repositório recomendo que seja usada da combinação (outras similares foram de dificil compilação):

```xml
<parent>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-parent</artifactId>
	<version>2.0.3.RELEASE</version>
	<relativePath/> <!-- lookup parent from repository -->
</parent>



<dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-swagger2</artifactId>
    <version>2.7.0</version>
</dependency>
<dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-swagger-ui</artifactId>
    <version>2.7.0</version>
</dependency>
```

