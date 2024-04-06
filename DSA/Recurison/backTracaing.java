package Recurison;

import java.util.Arrays;

public class backTracaing {
    public static void main(String[] args) {
        boolean[][] maze = {
                { true, true, true },
                { true, true, true },
                { true, true, true }
        };
        int[][] path = new int [maze.length][maze[0].length];
        pathRestrictions("", maze, 0, 0);
        pathRestrictionsPath("", maze, 0, 0, path, 1);

    }

    static void pathRestrictions(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (!maze[r][c]) {
            return;
        }
        // I am comsderin this block in my path
        maze[r][c] = false;

        if (r < maze.length - 1) {
            pathRestrictions(p + 'D', maze, r + 1, c);
        }
        if (c < maze[0].length - 1) {
            pathRestrictions(p + 'R', maze, r, c + 1);
        }
        if (r > 0) {
            pathRestrictions(p + 'U', maze, r - 1, c); // U = up
        }
        if(c>0){
            pathRestrictions(p+'L', maze, r, c-1);    //L= left
        }
        // this the line where the function get over
        // It will return from here
        // remove the changes that were made by the function.
        maze[r][c] = true;
    }

    // path in the matrinx formet - how to print the path
    static void pathRestrictionsPath(String p, boolean[][] maze, int r, int c,int[][] path, int step) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c]= step;
            for(int[] arr : path){
                System.out.println(Arrays.toString(arr));   // here It will print all the values of path in the matrix
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if (!maze[r][c]) {
            return;
        }
        // I am comsderin this block in my path
        maze[r][c] = false;  // here we are making the change.
        path[r][c]=step;    // Here the where step will be added to the path.

        if (r < maze.length - 1) {
            pathRestrictionsPath(p + 'D', maze, r + 1, c,path,step+1);   // step+1 = For every function call the number will be added.
        }
        if (c < maze[0].length - 1) {
            pathRestrictionsPath(p + 'R', maze, r, c + 1,path,step+1);   // Paht is given for the storing the values of the step in the matrix formt
        }
        if (r > 0) {
            pathRestrictionsPath(p + 'U', maze, r - 1, c,path, step+1); // U = up
        }
        if(c>0){
            pathRestrictionsPath(p+'L', maze, r, c-1,path, step+1);    //L= left
        }
        // this the line where the function get over
        // It will return from here
        // remove the changes that were made by the function.
        maze[r][c] = true;   
        path[r][c]=0;               // These two are given while the function call over onece 
        

    }

}