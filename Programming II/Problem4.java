i m p o r t   j a v a . u t i l . S c a n n e r ; 
 i m p o r t   j a v a . t e x t . N u m b e r F o r m a t ; 
 i m p o r t   j a v a . m a t h . * ;   / / i m p o r t s   e n u m e r a t i o n s   a n d   j a v a . m a t h   c l a s s e s 
 i m p o r t   j a v a . u t i l . S c a n n e r ; 
 i m p o r t   j a v a . i o . F i l e ; 
 i m p o r t   j a v a . i o . I O E x c e p t i o n ; 
 
 p u b l i c   c l a s s   P r o b l e m 4 
 { 
       p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g   [ ]   a r g s ) 
       { 
         / / v a r i a b l e   d e c l a r a t i o n s 
             S t r i n g   f N a m e   =   " c o u r s e _ e x a m _ s c o r e s _ s i m p l e . t x t " ; 
             i n t   c o u n t 4   =   0 ; 
             i n t   c o u n t 5   =   0 ; 
             B i g D e c i m a l   b d S u m   =   n e w   B i g D e c i m a l ( " 0 " ) ; 
             B i g D e c i m a l   b d A v e r a g e   =   n e w   B i g D e c i m a l ( " 0 " ) ; 
             B i g D e c i m a l   b d T e m p ; 
             B i g D e c i m a l   z e r o   =   n e w   B i g D e c i m a l ( " 0 " ) ; 
             S t r i n g   [ ]   s ; 
             S t r i n g   s t r ; 
             
             t r y 
             { 
         	       / / c r e a t e   a   s c a n n e r   o b j e c t   t h a t   r e a d s   d a t a   f r o m   a   t e x t   f i l e 
         	       S c a n n e r   f S c a n n e r   =   n e w   S c a n n e r ( n e w   F i l e ( f N a m e ) ) ; 
         	     
 	             w h i l e ( f S c a n n e r . h a s N e x t L i n e ( ) ) 
 	             { 
 	                   s t r   =   f S c a n n e r . n e x t L i n e ( ) ; 
                         s   =   s t r . s p l i t ( "   " ) ; 
                         
                         b d T e m p   =   n e w   B i g D e c i m a l ( s [ 0 ] ) ; 
                         
                         f o r ( i n t   i   =   0 ;   i   <   s . l e n g t h ;   i + + ) 
                         { 
                               b d T e m p   =   n e w   B i g D e c i m a l ( s [ i ] ) ; 
                               S y s t e m . o u t . p r i n t l n ( " b d T e m p   =   "   +   b d T e m p ) ; 
                               b d S u m   =   b d S u m . a d d ( b d T e m p ) ; 
                         }   
                               
                         S y s t e m . o u t . p r i n t l n ( " b d S u m   =   "   +   b d S u m ) ; 
                         b d S u m   =   z e r o ;     
 	             } 
             } 
             c a t c h ( E x c e p t i o n   e ) 
             { 
         	     S y s t e m . o u t . p r i n t l n ( " I n   c a t c h ,   e x c e p t i o n   m e s s a g e   =   "   +   e ) ; 
             }     
       } 
 } 