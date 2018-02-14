#!/bin/bash
source /home/prajakta/Desktop/Homebox_cleanup/clean.conf
#days=$LogsDaysOlder

x=$(date)
a=$(date -d "$x")
b=$(date -d "$a" "+%Y-%m-%d")
echo "$b"

filetime=$(ls -l /home/prajakta/dilgilux.txt | cut -d ' ' -f '6-8')
l=$(date -d "$filetime")
m=$(date -d "$l" "+%Y-%m-%d")
echo "$m"

echo $(($(($(date -d "$b" "+%s") - $(date -d "$m" "+%s"))) / 86400))


first_date=$(date -d "$b" "+%s")
second_date=$(date -d "$m" "+%s")
datediff=$(( ($first_date - $second_date)/(86400) ))
echo "$datediff"
if [ $datediff -ge $LogsDaysOlder ]; then
	echo "greater than"
fi
