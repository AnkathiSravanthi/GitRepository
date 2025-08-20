package JAVAPrograms;

public class specialcharremove {

	public static void main(String[] args) {

           String s="@!#@# est Selen $$$ ium";
/* regular expression=(A-Za-z0-9) */
     
         s= s.replaceAll("^[a-zA-Z0-9]", "");
            System.out.println(s);
       
      
	}

}
