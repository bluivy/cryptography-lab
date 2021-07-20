
public class CeaserCipher {
	public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
	public static String Encrypt(String plain_text,int shift_key)
	{
		String local_text = plain_text.toLowerCase();
		String cipher_text = "";
		for (int i = 0; i < local_text.length(); i++)
		{
			int pos = ALPHABET.indexOf(local_text.charAt(i));
			int keyval = (shift_key + pos) % 26;
			char replace_val = ALPHABET.charAt(keyval);
			cipher_text += replace_val;
		}
		return cipher_text;
	}
	
	public static String Decrypt(String cipher_text,int shift_key)
	{
		String plain_text = "";
		for( int i = 0; i< cipher_text.length(); i++)
		{
			int pos = ALPHABET.indexOf(cipher_text.charAt(i));
			int key_val = (pos -  shift_key) % 26;
			if(key_val < 0)
			{
				key_val = ALPHABET.length() + key_val;
			}
			char replace_val = ALPHABET.charAt(key_val);
			plain_text += replace_val;
		}
		return plain_text;
	}
	public static void main(String args[])
	{
		String txt = Encrypt("tomorrowbytogether", 3);
		System.out.println(txt);
		String org_txt = Decrypt(txt,3);
		System.out.println(org_txt);
		
	}

}
