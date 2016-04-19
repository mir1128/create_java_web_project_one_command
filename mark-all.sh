CURRENT_DIR=`pwd`
  d=`date +"%y-%m-%d-%H-%M"`
  git tag -a $d head -m "$d"
cd $CURRENT_DIR
