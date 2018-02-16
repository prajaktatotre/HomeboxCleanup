#!/bin/bash
source /home/jedi/homebox_cleanup.conf

current_date=$(date)
current_date_string=$(date -d "$current_date")
current_date_YMD=$(date -d "$current_date_string" "+%Y-%m-%d")
first_date=$(date -d "$current_date_YMD" "+%s")

for i in $(find /opt/ -name '*.log');
do
   inode=$(stat --format=%i $i)
   crtime_of_file=$(sudo debugfs -R 'stat <'"${inode}"'>' /dev/mapper/ubuntuserver--vg-root | grep -oP 'crtime.*--\s*\K.*')
   crtime_date=$(date -d "$crtime_of_file")
   crtime_date_YMD=$(date -d "$crtime_date" "+%Y-%m-%d")
   second_date=$(date -d "$crtime_date_YMD" "+%s")
   datediff=$(( ($first_date - $second_date)/(86400) ))
   printf "%s\t %s\t %s\n" "$i" "$crtime_date_YMD" "$datediff"
   if [ $datediff -ge $LogsDaysOlder ]; then
           rm -f  $i
   fi
done
sudo supervisorctl restart all
mkdir /home/jedi/demoDir

