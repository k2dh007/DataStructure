package RBtree;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class RBtree {
	 public static void main(String args[]) {

		    if (args.length == 0) {                   
		      System.err.println("Input Filename...");
		      System.exit(1);                         
		    }
		    
		    try {
		    	RBtree1 st = new RBtree1();
		      BufferedReader in = new BufferedReader(new FileReader(args[0]));
		      String s;
		      while ((s = in.readLine()) != null) {
		    	  int s_int = Integer.parseInt(s.trim());
		    	  if(s_int>0)
		    	  st.insert(s_int);
		    	  else if(s_int<0){
		    		  String s_str = Integer.toString(-s_int);
		    		  st.remove(-s_int);
		    	  }
		    	  else break;
		      }
		      in.close();
		      System.out.println("total = " + st.size());
		      System.out.println("nb = " + st.nb());
		      System.out.println("bh = " + st.bh());
		      st.inorder();

		    } catch (IOException e) {
		        System.err.println(e); 
		        System.exit(1);
		    }
		    
		  }
}
