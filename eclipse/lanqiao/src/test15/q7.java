package test15;

import java.util.ArrayList;
import java.util.List;

public class q7 {
  private static int ans=0;
  static void dfs(int type, int sum) {
      if (sum > 13) return;
      if (type == 13) {
          if (sum == 13) ans++;
          return;
      }
      for (int i = 0; i < 5; i++) {
          dfs(type + 1, sum + i);
      }
  }

  public static void main(String[] args) {
      dfs(0, 0);
      System.out.println(ans);
  }
}
