#If not running interactively, don't do anything
[ -z "$PS1" ] && return
if [ -f /etc/bashrc ]; then
  source /etc/bashrc
fi

export EDITOR=$(which vim)

## Enable shell options:
# ignore minor spelling errors
shopt -s cdspell 
shopt -s checkwinsize
# save multiline commands as a single entry
shopt -s cmdhist
# check files beginning with . in results of filename expansion
shopt -s dotglob
shopt -s histappend histreedit histverify
# don't expand empty commands
shopt -s no_empty_cmd_completion
# case insensitive file matching
shopt -s nocaseglob
# autocd when the command is a path
shopt -s autocd

## Colours
#export PS1='\[\e[1;36m\]\u\[\e[1;37m\]@\[\e[1;36m\]\h\[\e[00m\]$: '
export PS1='\[\e[1;32m\] \u$>\[\e[00m\] '
##Colours for less
#export LESS_TERMCAP_mb=$'\E[01;31m'
#export LESS_TERMCAP_md=$'\E[01;31m'
#export LESS_TERMCAP_me=$'\E[0m'
#export LESS_TERMCAP_se=$'\E[0m'
#export LESS_TERMCAP_so=$'\E[01;44;33m'
#export LESS_TERMCAP_ue=$'\E[0m'
#export LESS_TERMCAP_us=$'\E[01;32m'
##Colours for ls
#export LS_COLORS=$LS_COLORS:'di=0;35:'

if [ -f ~/.aliases ]; then
  . ~/.aliases
fi

if [ -f ~/.functions ]; then
  . ~/.functions
fi

#./.splash.py
#fortune | cowsay

export PATH=$PATH:$HOME/go/bin:$HOME/.local/bin
