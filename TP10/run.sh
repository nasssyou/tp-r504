if [ $# -eq 0 ]; then
    echo "Erreur : Aucun argument fourni. Utilisation : $0 <serveur>"
    exit 1
fi
java -classpath ".:/home/user/lib/" Client1 $1