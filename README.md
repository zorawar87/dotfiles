# zorawar's dotfiles<sup>1</sup> #
Just so that I don't lose my curated configurations for when I accidentally 
overwrite my OS again. 

If you make that mistake, I'd highly recommend Fedora. After experimenting 
with a few distros, I really, really like it best. It's not perfect, but it's
great. Give it a shot. [Get fedora](https://getfedora.org/).

## Setup ##
Relocate these file at `home` and then run `setup.sh`. This script just creates an
empty undodir for vim to undo even after the file is closed. good stuff.

Hopefully, at some point in my life, setup will involve more than one `mkdir`.
It's good for now though. Welcome `~`.

## Overview of Files ##
  * `.bash_profile` - standard fedora definitions
  * `.bashrc` - general configurations
  * `.aliases` - custom shortkeys
  * `.functions` - custom function definitions
  * `.gitconifg` - git customisations
  * `.inputrc` - customises the `Readline` library. 
  * `.vim/` - out-of-box support --- just `git pull` the plugins.
  * `.vimrc` - run-configure vim

--------
### Footnotes ###

<sup>1</sup>Compiled from explorations on the internet; inspired by Paul Irish's namesake repo.

<sup>2</sup>For more see [GNU Readline](https://www.gnu.org/software/bash/manual/html_node/Readline-Init-File.html#Readline-Init-File)

