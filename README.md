# Containerized-application

Marta's Movies App – opis rozwiązania

1. dockerfile dla frontendu - komentarze znajduja się w pliku dockerfile
2. stworzenie obrazu kontenera za pomoca polecenia docker build
3. uruchomienie kontenera za pomocą polecenia docker run z parametrami
		docker run --name frontend -it -p 3000:3000 -d --rm euvic-frontend
4. sprawdzenie docker ps czy kontener jest uruchomiony
5. używam polecenia docker exec -it frontend bash by sprawdzić czy mogę zalogować się do kontenera
6. wyłączam kontener frontendowy poleceniem docker stop frontend
7. tworzę dockerfile dla backendu - komentarze znajduja się w pliku dockerfile
8. stworzenie obrazu kontenera za pomoca polecenia docker build
9. uruchomienie kontenera za pomocą polecenia docker run z parametrami
		docker run --name frontend -it -p 8080:8080 -d --rm euvic-backend
10. sprawdzenie docker ps czy kontener jest uruchomiony
11. używam polecenia docker exec -it backend by sprawdzić czy mogę zalogować się do kontenera
12. wyłączam konterer backendowy przy poleceniu docker stop backend
13. Tworzę sieć dockerową za pomocą polecenia docker network create project-network
14. Tworzę plik docker-compose.yaml z wszystkimi parametrami wykorzystywanymi do uruchomienie obu kontenerów
15. Używam polecenia docker-compose up by sprawdzić czy struktura kontererów działa.
16. logowanie przez przeglądarkę na kontenery "http://localhost:3000" oraz  "http://localhost:8080"
 

Marta's Movies App – opis zadania
Aplikacja wyświetlanie listy filmów, wykorzystująca Framework JS React i  Java Spring Boot. Pozwala na wyświetlanie listy filmów wraz z ich opisem, datą produkcji oraz oceną.

Wymagania
Do uruchomienia aplikacji wymagany jest zainstalowany silnik Docker oraz  narzędzie docker-compose.

Uruchamianie
Aby uruchomić aplikację należy wykonać poniższe kroki:
1. Sklonuj to repozytorium na swój komputer.
2. Otwórz terminal i przejdź do katalogu, w którym znajduje się sklonowane repozytorium.
3. Uruchom aplikację poleceniem docker-compose up
4. Backend aplikacji został napisany w języku Java z wykorzystaniem frameworka Spring Boot. Aplikacja udostępnia API pozwalające na pobranie listy filmów wraz z ich opisem, datą produkcji oraz oceną.
5. Aby uruchomić frontend aplikacji, należy przejść do katalogu frontend w konsoli i uruchomić polecenie yarn install, aby zainstalować wymagane zależności.
6. Następnie, aby uruchomić serwer deweloperski i zobaczyć aplikację w czasie rzeczywistym, należy wykonać polecenie yarn dev:run
7. Aplikacja będzie dostępna pod adresem http://localhost:3000

Informacje na temat frontendu i docker-compose
W kodzie JavaScript jest stworzony komponent klasy App, który renderuje interfejs użytkownika w postaci tabeli, wykorzystując stan komponentu, który zawiera listę filmów i informację o tym, czy dane są ładowane z serwera. Komponent wykorzystuje metodę componentDidMount() do pobrania listy filmów z serwera za pomocą metody fetch() i zaktualizowania stanu komponentu, a następnie używa mapowania, aby wygenerować wiersze tabeli z danymi filmów.

Dodatkowo w pliku docker-compose.yaml zdefiniowane są dwa serwisy (backend i frontend) w ramach jednej sieci (project-network), dzięki czemu kontenery mogą ze sobą komunikować się bezpośrednio.

Uruchamianie backendu
Backend aplikacji uruchamiany jest w kontenerze Dockerowym. Aby uruchomić backend lokalnie, należy wykonać poniższe kroki:

Otwórz terminal i przejdź do katalogu backend.
Uruchom aplikację poleceniem ./mvnw spring-boot:run
Backend będzie dostępny pod adresem http://localhost:8080