# Service Info
Сервис-шлюз с Reverse-proxy и Eureka для проекта Shops. 
Запускаются последовательно сервисы: 
- eureka (port: 8761);
- gateway-proxy (port: 8080);
- security (port: 8081).
После запуска проверяем, что все сервисы зарегистрированы в Eureka, страница доступна по адресу: http://localhost:8761.
Затем можно запускать клиентов Purchase, лучше стартовать их последовательно на следующих после Security портах.
Для запуска клиентов Eureka в Intellij Idea на разных портах заходим в Run -> Edit Configurations -> VM options и 
прописываем -Dserver.port=value, value - номер порта.
Обращение через прокси по адресу: http://localhost:8080/security-service/purchase/any