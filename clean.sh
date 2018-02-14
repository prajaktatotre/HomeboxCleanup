#!/bin/bash
source /home/jedi/clean.conf

currentDate=$(date)
currentDT=$(date -d "$currentDate")
currentYMD=$(date -d "$currentDT" "+%Y-%m-%d")
first_date=$(date -d "$currentYMD" "+%s")

for i in $(find . -name '*.log');do
         inode=$(stat --format=%i $i)
         crtime_of_file=$(sudo debugfs -R 'stat <'"${inode}"'>' /dev/mapper/ubuntuserver--vg-root | grep -oP 'crtime.*--\s*\K.*')
         crtimeDT=$(date -d "$crtime_of_file")
         crtimeYMD=$(date -d "$crtimeDT" "+%Y-%m-%d")

         second_date=$(date -d "$crtimeYMD" "+%s")
         datediff=$(( ($first_date - $second_date)/(86400) ))
         printf "%s\t %s\t %s" "$i" "$crtimeYMD" "$datediff"
         if [ $datediff -ge $LogsDaysOlder ]; then
                echo "more than"
         fi
done
