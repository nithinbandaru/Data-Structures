package General2;
import java.util.ArrayList;


public class PartitionStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String HTMLtext = "<html><head></head><body><h1>This is a test page</h1> "+
				" 5256864183 9354722636 1269117513 6025357158 1463907502 "+
" 1649093712 7999439087 4486914362 3646435528 6718191942" +
" 5895341100 0353840318 1544325707 9219051662 6385740043" +
" 0405392267 1978062851 5900625993 8824986582 4649062835" +
" 8311715659 0135711070 7100691511 0445341171 0604937429" +
" 4192171568 3853466657 6805688015 7639571761 3343888290" +
" 9535590499 6007399051 0819469903 2397970338 8732688635" +
" 1965226200 9399443779 6941180924 4230755606 4844929446" +
" 8904580287 5555074978 9605500506 0136599221 1852991302" +
" 9902891285 9909060993 2775039490 7987317131 2066066777" + "</body></html>";
		
		int length = HTMLtext.length();
		System.out.println(length);
		ArrayList<String> strArray = new ArrayList<String>();
		int counter = 0;
		int beginIndex = 0;		
		for(int i=0 ; i < HTMLtext.length() ; i++)
		{
			char ch = HTMLtext.charAt(i);
			
			if( ch == ' ')
			{
				counter++;
			}
			
			if(counter == 10)
			{
				strArray.add(HTMLtext.substring(beginIndex,i));
				counter = 0;
				beginIndex = i;
			}			
			
		}
		
		for(String s :strArray )
		{
			System.out.println(s);
		}
	}

}
