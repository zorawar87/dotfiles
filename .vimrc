execute pathogen#infect() 
"execute pathogen#helptags() 
filetype plugin indent on
syntax on

"colorscheme darkblue
"colorscheme wwdc16
set t_Co=256
"colorscheme PaperColor
set background=dark "enable dark theme 
set cursorline

set hlsearch
set incsearch

set autoindent
set tabstop=4
set shiftwidth=4
set expandtab

set autoread
set wildmenu
set number
set wildignore=*.class,*.~,.*~
"set nowrap
set wrap

command WQ wq
command Wq wq
command W w
command Q q
command WA wa
command Wa wa

set undofile  "undo after file is closed!
set undodir=~/.vim/undodir "make sure to create this dir!
