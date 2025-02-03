- start.spring.io
- Made using JDK 21, Maven, Java, 3.4.2
- Dependacies:
  - Lombok (Constructor)
  - Spring Boot Dev Tools
  - Spring Data JPA
  - H2 database
  - Spring Web
- GET localhost:8080/api/products - List all products
- GET localhost:8080/api/product/<id> - Get a product
- POST localhost:8080/api/product/<id> - Add a product
- DELETE localhost:8080/api/product/<id> - delete a product
- UPDATE localhost:8080/api/product/<id> - update a product

- Model structure:
  - private int id;
    private String name;
    private String desc;
    private String brand;
    private BigDecimal price;
    private String category;

    private Date releaseDate;
    private boolean available;
    private int quantity;
