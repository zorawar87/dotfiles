Vim�UnDo� ��F�d<�������z� ꍉmE_,wi�C�B�   @   9 * Usage: `java Detector {input-file1} {input-file2} ...`   
         6       6   6   6    [�$M    _�                            ����                                                                                                                                                                                                                                                                                                                                                             [�#K    �         ;      public class Detector {5�_�                           ����                                                                                                                                                                                                                                                                                                                                                             [�#Q     �         <          �         ;    5�_�                           ����                                                                                                                                                                                                                                                                                                                                                             [�#S     �                    private5�_�                           ����                                                                                                                                                                                                                                                                                                                                                             [�#S     �         <          �         ;    5�_�                           ����                                                                                                                                                                                                                                                                                                                                                             [�#Z    �         <              private static Digra5�_�                           ����                                                                                                                                                                                                                                                                                                                                                             [�#h    �         <      .        private static DNASequencer sequencer;5�_�                       	    ����                                                                                                                                                                                                                                                                                                                                                             [�#j     �         =      
        //�         <    5�_�      	                     ����                                                                                                                                                                                                                                                                                                                                                             [�#q     �         =              private static delta5�_�      
           	          ����                                                                                                                                                                                                                                                                                                                                                             [�#s    �         =               private static int delta5�_�   	              
          ����                                                                                                                                                                                                                                                                                                                                                             [�#y     �         =      !        private static int delta;5�_�   
                    $    ����                                                                                                                                                                                                                                                                                                                                                             [�#~     �         >          �         =    5�_�                           ����                                                                                                                                                                                                                                                                                                                                                             [�#�     �         >      
    /** */5�_�                           ����                                                                                                                                                                                                                                                                                                                                                             [�#�    �         >              /** */5�_�                           ����                                                                                                                                                                                                                                                                                                                                                             [�#�     �         >    �         >    5�_�                           ����                                                                                                                                                                                                                                                                                                                                                             [�#�     �         ?      &        private static int gapPenalty;5�_�                           ����                                                                                                                                                                                                                                                                                                                                                             [�#�     �         ?      *        private static int[][] gapPenalty;5�_�                           ����                                                                                                                                                                                                                                                                                                                                                             [�#�     �         ?      )        private static int[][] apPenalty;5�_�                           ����                                                                                                                                                                                                                                                                                                                                                             [�#�     �         ?      (        private static int[][] pPenalty;5�_�                           ����                                                                                                                                                                                                                                                                                                                                                             [�#�    �         ?      '        private static int[][] Penalty;5�_�                       %    ����                                                                                                                                                                                                                                                                                                                                                             [�#�    �         ?      .        private static int[][] mismathPenalty;5�_�                            ����                                                                                                                                                                                                                                                                                                                                                             [�#�     �         ?    �         ?    5�_�                           ����                                                                                                                                                                                                                                                                                                                                                             [�#�     �         @      !        /** the value of delta */5�_�                           ����                                                                                                                                                                                                                                                                                                                                                             [�#�     �         @      *        /** the value of the similarity */5�_�                           ����                                                                                                                                                                                                                                                                                                                                                             [�#�     �         @      $        /** the of the similarity */5�_�                           ����                                                                                                                                                                                                                                                                                                                                                             [�#�     �         @      !        /** the the similarity */5�_�                           ����                                                                                                                                                                                                                                                                                                                                                             [�#�     �         @      !        /** the value of delta */5�_�                           ����                                                                                                                                                                                                                                                                                                                                                             [�#�     �         @              /** the of delta */5�_�                           ����                                                                                                                                                                                                                                                                                                                                                             [�#�    �         @              /** the delta */5�_�                       '    ����                                                                                                                                                                                                                                                                                                                                                             [�#�     �         @      /        /** the penalty for gaps a.k.a delta */5�_�                       *    ����                                                                                                                                                                                                                                                                                                                                                             [�#�     �         @      2        /** the penalty for gaps a.k.a δ delta */5�_�                            ����                                                                                                                                                                                                                                                                                                                                                             [�#�     �         @      ,        /** the penalty for gaps a.k.a δ */5�_�      !                  %    ����                                                                                                                                                                                                                                                                                                                                                             [�#�   
 �         @      0        /** δ, the penalty for gaps a.k.a δ */5�_�       "           !          ����                                                                                                                                                                                                                                                                                                                                                             [�#�     �         @              /** the similarity */5�_�   !   #           "          ����                                                                                                                                                                                                                                                                                                                                                             [�#�     �         @      '        /** the similarity matrix rep*/5�_�   "   $           #          ����                                                                                                                                                                                                                                                                                                                                                             [�#�     �         @      /        private static int[][] mismatchPenalty;5�_�   #   %           $          ����                                                                                                                                                                                                                                                                                                                                                             [�#�    �         @      0        private static int[4][] mismatchPenalty;5�_�   $   &           %      )    ����                                                                                                                                                                                                                                                                                                                                                             [�#�     �         @      +        /** the 4x4 similarity matrix rep*/5�_�   %   '           &      3    ����                                                                                                                                                                                                                                                                                                                                                             [�#�    �         @      F        /** the 4x4 similarity matrix representing mismatch penalty */5�_�   &   (           '          ����                                                                                                                                                                                                                                                                                                                                                             [�#�     �         @      '        /** δ, the penalty for gaps */5�_�   '   )           (           ����                                                                                                                                                                                                                                                                                                                                                             [�$      �         @      +        /** δ, the gap penalty for gaps */5�_�   (   *           )           ����                                                                                                                                                                                                                                                                                                                                                             [�$     �         @      '        /** δ, the gap penalty gaps */5�_�   )   +           *   #   `    ����                                                                                                                                                                                                                                                                                                                                                             [�$     �   "   $   @      t                        throw new IllegalArgumentException ("Usage: java Detector <input-file1> <input-file2> ...");5�_�   *   ,           +   #   `    ����                                                                                                                                                                                                                                                                                                                                                             [�$     �   "   $   @      s                        throw new IllegalArgumentException ("Usage: java Detector <input-file1> input-file2> ...");5�_�   +   .           ,   #   `    ����                                                                                                                                                                                                                                                                                                                                                             [�$     �   "   $   @      n                        throw new IllegalArgumentException ("Usage: java Detector <input-file1> -file2> ...");5�_�   ,   /   -       .   #   `    ����                                                                                                                                                                                                                                                                                                                                                             [�$    �   "   $   @      m                        throw new IllegalArgumentException ("Usage: java Detector <input-file1> file2> ...");5�_�   .   0           /   #   _    ����                                                                                                                                                                                                                                                                                                                                                             [�$    �   "   $   @      c                        throw new IllegalArgumentException ("Usage: java Detector <input-file1> ");5�_�   /   1           0   #   I    ����                                                                                                                                                                                                                                                                                                                                                             [�$    �   "   $   @      b                        throw new IllegalArgumentException ("Usage: java Detector <input-file1>");5�_�   0   2           1   #   I    ����                                                                                                                                                                                                                                                                                                                                                             [�$8    �   "   $   @      k                        throw new IllegalArgumentException ("Usage: java SequenceAlignment <input-file1>");5�_�   1   3           2   #   I    ����                                                                                                                                                                                                                                                                                                                                                             [�$:    �   "   $   @      `                        throw new IllegalArgumentException ("Usage: java Driver <input-file1>");5�_�   2   5           3          ����                                                                                                                                                                                                                                                                                                                                                             [�$@    �         @      public class Driver {5�_�   3   6   4       5   
       ����                                                                                                                                                                                                                                                                                                                                                             [�$J     �   	      @      9 * Usage: `java Detector {input-file1} {input-file2} ...`5�_�   5               6   
       ����                                                                                                                                                                                                                                                                                                                                                             [�$L    �   	      @      6 * Usage: `java Seque {input-file1} {input-file2} ...`5�_�   3           5   4          ����                                                                                                                                                                                                                                                                                                                                                             [�$F     �         @      public class  {5�_�   ,           .   -   #   `    ����                                                                                                                                                                                                                                                                                                                                                             [�$     �   "   $   @      h                        throw new IllegalArgumentException ("Usage: java Detector <input-file1> > ...");5��