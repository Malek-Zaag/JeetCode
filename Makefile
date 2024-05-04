commit:
	git add .
	git commit -m "$(msg)"
	git push -u origin java


branch:
	git branch -a 
	git checkout java
