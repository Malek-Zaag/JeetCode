commit:
	git add .
	git commit -m "$(msg)"
	git push -u origin main


branch:
	git branch -a 
	git checkout main

run:
	javac "$(file).java"
	java "$(file)"
 

