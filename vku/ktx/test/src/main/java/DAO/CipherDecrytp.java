package DAO;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PublicKey;
import java.security.Signature;

import javax.crypto.Cipher;

public class CipherDecrytp {
	public String CipherEncrytp(String pass) {
		String passdeCrypt="";
		try {
		Signature sign = Signature.getInstance("SHA256withRSA");
	    KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("RSA");
	    keyPairGen.initialize(2048);
	    KeyPair pair = keyPairGen.generateKeyPair();   
	    PublicKey publicKey = pair.getPublic();  
	    Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
	     cipher.init(Cipher.ENCRYPT_MODE, publicKey);
	    byte[] input = pass.getBytes();	  
	    cipher.update(input);
	    byte[] cipherText = cipher.doFinal();	 
	    passdeCrypt=new String(cipherText, "UTF8");
//	      System.out.println( new String(cipherText, "UTF8"));
	      cipher.init(Cipher.DECRYPT_MODE, pair.getPrivate());
		} catch (Exception e) {
			e.printStackTrace();
		}

		return passdeCrypt;
	}
	public String CipherDecrypt(String pass) {
		String passdecrypt="";
		try {
		Signature sign = Signature.getInstance("SHA256withRSA");
	    KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("RSA");
	    keyPairGen.initialize(2048);
	    KeyPair pair = keyPairGen.generateKeyPair();   
	    PublicKey publicKey = pair.getPublic();  
	    Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
	     cipher.init(Cipher.ENCRYPT_MODE, publicKey);
	    byte[] input = pass.getBytes();	  
	    cipher.update(input);
	    byte[] cipherText = cipher.doFinal();	 
	      cipher.init(Cipher.DECRYPT_MODE, pair.getPrivate());
	      byte[] decipheredText = cipher.doFinal(cipherText);
	      passdecrypt = new String(decipheredText);
	      }catch (Exception e) {
			e.printStackTrace();
		}
	      return passdecrypt;
		
	}
   public static void main(String args[]) throws Exception{
CipherDecrytp c= new CipherDecrytp();
String passEncrypt = c.CipherEncrytp("admin");
String pass = c.CipherDecrypt("admin");
System.out.println(passEncrypt);
    System.out.println(pass);
   }
}