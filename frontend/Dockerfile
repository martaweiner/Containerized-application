# ustawienie obrazu bazowego 
FROM node:14-alpine 

# pobieranie basha
RUN apk update && apk add bash

# ustawienie katalogu roboczego 
WORKDIR /app 

# skopiowanie pozostałych plików projektu do katalogu roboczego 
COPY . . 
 
# ustawienie portu 
EXPOSE 3000 

# uruchomienie aplikacji 
CMD ["/bin/bash"]