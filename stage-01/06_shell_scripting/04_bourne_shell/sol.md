# 04. Bourne Shell

### 1. Pattern printing

```bash
#!/bin/bash
for i in 1 2 3 4 5
do
    for j in $(seq 1 $i)
    do
        echo -n "$i"
    done
    echo
done
```

### 2. Shell scripting

```bash
#!/bin/bash

grep "Male$" names.txt >> male_nominee.txt
grep "Female$" names.txt >> female_nominee.txt

```

### 3. Script to Count

```bash
#!/bin/bash

FILE=$1

echo "Number of characters in $FILE is $(wc -c < $FILE)"
echo
echo "Number of words in $FILE is $(wc -w < $FILE)"
echo
echo "Number of lines in $FILE is $(wc -l < $FILE)"
```
