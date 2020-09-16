// Practice 4
// Your name here

public class GraphPractice
{
    private static int inf = 99999;
    
    public static void main(String[] args)
    {
        
        int[][] G = {
            {0, 15, inf, inf, 10, inf, inf},
            {inf, 0, 6, inf, inf, inf, inf},
            {inf, inf, 0, inf, inf, inf, 17},
            {inf, inf, inf, 0, inf, inf, inf},
            {inf, inf, 25, inf, 0, inf, inf},
            {inf, inf, inf, inf, inf, 0, inf},
            {inf, inf, inf, inf, inf, inf, 0}
        };
        
//         String v = "{";
//         String isolated = "{";
//         String e = "{";
//         
//         for(int i = 0; i < G.length; i++)
//         {
//             for(int j = 0; j < G[0].length; j++)
//             {
//                if(G[i][j] == 0;
//                {
//                   i = i + G[i][j];
//                }
//             }
//         }

//        int[][] G = {
//            {0, inf, inf, inf, 10, inf, 15, inf},
//            {inf, 0, inf, inf, inf, inf, inf, inf},
//            {inf, inf, 0, inf, inf, inf, 19, inf},
//            {inf, inf, inf, 0, inf, inf, 30, inf},
//            {inf, inf, inf, inf, 0, inf, 25, inf},
//            {inf, inf, inf, inf, inf, 0, inf, inf},
//            {23, inf, 21, inf, inf, inf, 0, 6},
//            {inf, inf, inf, inf, inf, inf, inf, 0}
//        };
        
        int n = 7;
        p4(G);
    }
    public static void p4(int[][] G)
    {
        String v = "{";
        String isolated = "{";
        String e = "{";
        
        for(int i = 0; i < G.length; i++)
        {
            for(int j = 0; j < G[0].length; j++)
            {
               if(G[i][j] == 0)
               {
                  isolated = isolated + G[i][j];
               }
               else if(G[i][j] == inf)
               {
                  e = e + "(" + i + ", " + j + "),";
               }
               else
               {
                  v = v + G[i][j] + ", ";
               }
            }
        }
        System.out.println(v + "}");
        System.out.println(isolated + "}");
        System.out.println(e + "}");
    }
}
