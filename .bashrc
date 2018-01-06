#If not running interactively, don't do anything
[ -z "$PS1" ] && return
if [ -f /etc/bashrc ]; then
  source /etc/bashrc
fi

# to get fedora to make GUIs work
export DISPLAY=:0

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

export PS1='\[\e[1;36m\]\u\[\e[1;37m\]@\[\e[1;36m\]\h\[\e[00m\]$: '

if [ -f ~/.aliases ]; then
  . ~/.aliases
fi

if [ -f ~/.functions ]; then
  . ~/.functions
fi

#./.splash.py
#fortune | cowsay

export JAVA_HOME=/usr/java/jdk1.8.0_151
PATH=$PATH:$JAVA_HOME/bin:/usr/local/go/bin
#PATH=~/.bin:~/.bin/jdk1.8.0_121/bin:$PATH:~/.astyle/build/gcc/bin/:$GOROOT/bin
#PATH=~/.bin:$PATH:~/.apps/astyle/build/gcc/bin/:$GOROOT/bin:~/.apps/apache-maven-3.5.2/bin
#PATH=~/.apps/jdk1.8.0_151/bin:$PATH
