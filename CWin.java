class CWin {
	 private static int cnt;
	 static String color;
	 static int width;
	 static int height;
	 public static void count()
	 {
	  cnt=cnt+1; 
	  System.out.println(cnt+" objects");
	 }
	 public static void Cwin(String str,int w,int h)           //(b)
	 {
	     color = str;
	  width=w;
	  height=h;
	 }
	 public static void CWin()             //(c)
	 {
	  color="blue";
	  width=2;
	  height=2;
	 }
	 public static void setZore()          //(d)
	 {
	  cnt=0;
	  System.out.println(cnt+" objects");
	 }
	 public static void setValue(int n)         //(e)
	 { 
	  cnt=n;
	 }
	}

