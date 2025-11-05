public class Shortestpath {
    // In this we find the shortest path using direction

    public static double path(String str){
        
        int x=0, y=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='s'){     //south
                y--;
            }else if(str.charAt(i)=='n'){     //north
                y++;
            }else if(str.charAt(i)=='e'){     //east
                x++;
            }else{                          //west
                x--;
            }
        }int X=x*x;
        int Y=y*y;
        return Math.sqrt(X+Y);
    }
    public static void main(String[] args) {
        String str="wneenesennn";
        System.out.println(path(str));
    }
    
}
