./purge
if [ $? != 0 ]
then
	echo "erreur à l'étape 1"
	exit
fi
./create_network.sh
if [ $? != 0 ]
then
	echo "erreur à l'étape 2"
	exit
fi
./run_mysql.sh
if [ $? != 0 ]
then
	echo "erreur à l'étape 3"
	exit
fi
./filldb.sh
if [ $? != 0 ]
then
	echo "erreur à l'étape 4"
	exit
fi

