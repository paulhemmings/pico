package razor.lib.models.helpers;

public class EncryptionHelper {

	   public String encryptString(String key, String str)
	   {
	      StringBuffer sb = new StringBuffer (str);

	      int lenStr = str.length();
	      int lenKey = key.length();
		   
	      //
	      // For each character in our string, encrypt it...
	      for ( int i = 0, j = 0; i < lenStr; i++, j++ ) 
	      {
	         if ( j >= lenKey ) j = 0;  // Wrap 'round to beginning of key string.

	         //
	         // XOR the chars together. Must cast back to char to avoid compile error. 
	         //
	         sb.setCharAt(i, (char)(str.charAt(i) ^ key.charAt(j))); 
	      }

	      return sb.toString();
	   }
	   
	   public String decryptString(String key, String str)
	   {
	      //
	      // To 'decrypt' the string, simply apply the same technique.
	      return this.encryptString(key, str);
	   }
	   
}
