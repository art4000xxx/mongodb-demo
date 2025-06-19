# MongoDB Demo

Простое приложение на Spring Boot для выполнения CRUD-операций с базой данных MongoDB через Spring Data MongoDB. Управляет сущностью `User` с полями: `id`, `name`, `email`, `age`.

## Требования
- Java 17
- Maven
- MongoDB (локально или в облаке)
- IntelliJ IDEA Community

## Установка
1. Склонируйте репозиторий:
   ```bash
   git clone https://github.com/your-username/mongodb-demo
   Убедитесь, что MongoDB работает на localhost:27017, или обновите настройки в application.properties.
Откройте проект в IntelliJ IDEA и запустите MongodbDemoApplication.java.
Эндпоинты API
GET /api/users — Получить всех пользователей
GET /api/users/{id} — Получить пользователя по ID
GET /api/users/search?name={name} — Поиск по имени
GET /api/users/search?age={age} — Поиск по возрасту
POST /api/users — Создать пользователя
PUT /api/users/{id} — Обновить пользователя
DELETE /api/users/{id} — Удалить пользователя
Пример POST-запроса
{
    "name": "Иван Иванов",
    "email": "ivan@example.com",
    "age": 25
}
Тестирование
Тестируйте API через Postman или cURL. Валидация данных реализована с помощью аннотаций JSR-380.
## Автор

**art4000xxx**  
[GitHub профиль](https://github.com/art4000xxx)
