// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Stack;

public class candyCrush {
   public candyCrush() {
   }

   public String Reduced_String(int var1, String var2) {
      if (var1 == 1) {
         return "";
      } else {
         Stack var3 = new Stack();

         class Pair {
            char ch;
            int cnt;

            Pair(char var2, int var3) {
               this.ch = var2;
               this.cnt = var3;
            }
         }

         for(char var7 : var2.toCharArray()) {
            if (!var3.isEmpty() && ((Pair)var3.peek()).ch == var7) {
               ++((Pair)var3.peek()).cnt;
               if (((Pair)var3.peek()).cnt == var1) {
                  var3.pop();
               }
            } else {
               var3.push(new Pair(var7, 1));
            }
         }

         StringBuilder var8 = new StringBuilder();

         for(Pair var10 : var3) {
            for(int var11 = 0; var11 < var10.cnt; ++var11) {
               var8.append(var10.ch);
            }
         }

         return var8.toString();
      }
   }

   public static void main(String[] var0) {
      candyCrush var1 = new candyCrush();
      String var2 = "deeedbbcccbdaa";
      byte var3 = 3;
      System.out.println(var1.Reduced_String(var3, var2));
   }
}