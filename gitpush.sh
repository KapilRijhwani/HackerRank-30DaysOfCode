git add .
echo 'Enter Commit Message : '
read commitMessage

git commit -m "$commitMessage"

git push origin master

read
