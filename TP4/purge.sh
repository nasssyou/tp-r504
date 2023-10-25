docker stop $(docker ps -q)
docker rm $(docker ps -aq)
docker system prune
docker volume prune
