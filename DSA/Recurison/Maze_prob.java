package Recurison;

import java.util.ArrayList;

public class Maze_prob {
    public static void main(String[] args) {
        // System.out.println(count(3, 3));
        // path("", 3, 3);
        // System.out.println(pathRet("", 3, 3));
        // System.out.println(pathRetDig("", 3, 3));
        boolean[][] maze= {
            {true,true,true},
            {true,false,true},
            {true, true, true}
        };
        pathRestrictions("", maze, 0, 0);

    }

    // no of ways to count to reach a a perticular answer
    static int count(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }
        int right = count(r, c - 1);
        int left = count(r - 1, c);
        return right + left;
    }

    // printing the path to reach a target
    static void path(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }
        if (r > 1) {
            path(p + 'D', r - 1, c);
        }
        if (c > 1) {
            path(p + 'R', r, c - 1);
        }
    }
    // Rtruning the ans to the array list

    static ArrayList<String> pathRet(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (r > 1) {
            list.addAll(pathRet(p + 'D', r - 1, c));
        }
        if (c > 1) {
            list.addAll(pathRet(p + 'R', r, c - 1));
        }

        return list;
    }

    static ArrayList<String> pathRetDig(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(r>1&&c>1){
            list.addAll(pathRetDig(p+'v',r-1,c-1));   // v= digonal
        }
        if (r > 1) {
            list.addAll(pathRetDig(p + 'D', r - 1, c));
        }
        if (c > 1) {
            list.addAll(pathRetDig(p + 'R', r, c - 1));
        }

        return list;
        


    }

    // Path with restrictions

    static void pathRestrictions(String p,boolean[][] maze, int r, int c) {
        if (r == maze.length-1 && c == maze[0].length-1) {
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        if (r < maze.length-1) {
            pathRestrictions(p + 'D',maze, r +1, c);
        }
        if (c < maze[0].length-1) {
            pathRestrictions(p + 'R',maze, r, c +1);
        }
    }

}
