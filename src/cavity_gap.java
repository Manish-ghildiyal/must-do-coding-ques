import java.util.Arrays;

public class cavity_gap {
    public static void main(String[] args) {
        String[] str= {"1112","1912","1892","1234"};
        String[] str1=cavity(str);
        System.out.println(Arrays.toString(str1));
    }

    private static String[] cavity(String[] grid) {
        String[] strings= new String[grid.length];
        for (int i = 0; i <grid.length ; i++) {
            if (i==0 || i==grid.length-1)
                strings[i]=grid[i];
            else {
                strings[i]="";
                for (int j = 0; j < grid[i].length(); j++) {
                    if (j==0 || j==grid[i].length()-1)
                        strings[i]+=grid[i].charAt(j);
                    else {
                        int a = Character.getNumericValue(grid[i].charAt(j));
                        if (a> Character.getNumericValue(grid[i].charAt(j-1)) && a>Character.getNumericValue(grid[i].charAt(j+1)) && a>Character.getNumericValue(grid[i-1].charAt(j)) && a>Character.getNumericValue(grid[i+1].charAt(j)))
                            strings[i]+='X';
                        else strings[i]+=grid[i].charAt(j);
                    }
                }
            }
        }
        return strings;
    }
}
