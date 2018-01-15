#!/bin/bash

cp -r .aliases .bash_profile .bashrc .functions .gitconfig .inputrc .vim/ .vimrc ~
mkdir ~/.vim/undodir/
source ~/.bash_profile
