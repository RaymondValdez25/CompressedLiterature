//Raymond Valdez

import java.util.*;

public class countFreq {

	//my mods
	//char Character[] = new char[256];
	//int Freq[] = new int[Character.length];
	
	char Character[] = {' ','e','a','n','o','h','i','t','s','d','l','r','\n','_','f','g','c','m','w','u','y','.','p','v','b','"',',','k','\'','-','P','T','I','A','?','B','M','N','S','R','j','q','z','x','H','!','D','E','F','G','C','O','K','W','V','Y','X',';','(',')',':','L','*','1','J','2','0','8','U','3','6','5','/','7','4','9','Q','Z','ê','@',']','[','ä','á','é','#','$','%','=','~','{', '}',};
	int Freq[] = new int[Character.length];
	
	
	public countFreq(String message){
		
		//for(int i =0; i<message.length(); i++){
		//Freq[message.charAt(i)]++;
		//}
		
		
		for(int i =0; i<message.length(); i++){
		if(message.charAt(i) == ' ')
			Freq[0]++;
		else if(message.charAt(i) == 'e')
			Freq[1]++;
		else if(message.charAt(i) =='a')
			Freq[2]++;
		else if(message.charAt(i)=='n')
			Freq[3]++;
		else if(message.charAt(i)=='o')
			Freq[4]++;
		else if(message.charAt(i)=='h')
			Freq[5]++;
		else if(message.charAt(i)=='i')
			Freq[6]++;
		else if(message.charAt(i)=='t')
			Freq[7]++;
		else if(message.charAt(i)=='s')
			Freq[8]++;
		else if(message.charAt(i)=='d')
			Freq[9]++;
		else if(message.charAt(i)=='l')
			Freq[10]++;
		else if(message.charAt(i)=='r')
			Freq[11]++;
		else if(message.charAt(i)=='\n')
			Freq[12]++;
		else if(message.charAt(i)=='_')
			Freq[13]++;
		else if(message.charAt(i)=='f')
			Freq[14]++;
		else if(message.charAt(i)=='g')
			Freq[15]++;
		else if(message.charAt(i)=='c')
			Freq[16]++;
		else if(message.charAt(i)=='m')
			Freq[17]++;
		else if(message.charAt(i)=='w')
			Freq[18]++;
		else if(message.charAt(i)=='u')
			Freq[19]++;
		else if(message.charAt(i)=='y')
			Freq[20]++;
		else if(message.charAt(i)=='.')
			Freq[21]++;
		else if(message.charAt(i)=='p')
			Freq[22]++;
		else if(message.charAt(i)=='v')
			Freq[23]++;
		else if(message.charAt(i)=='b')
			Freq[24]++;
		else if(message.charAt(i)=='"')
			Freq[25]++;
		else if(message.charAt(i)==',')
			Freq[26]++;
		else if(message.charAt(i)=='k')
			Freq[27]++;
		else if(message.charAt(i)=='\'')
			Freq[28]++;
		else if(message.charAt(i)=='-')
			Freq[29]++;
		else if(message.charAt(i)=='P')
			Freq[30]++;
		else if(message.charAt(i)=='T')
			Freq[31]++;
		else if(message.charAt(i)=='I')
			Freq[32]++;
		else if(message.charAt(i)=='A')
			Freq[33]++;
		else if(message.charAt(i)=='?')
			Freq[34]++;
		else if(message.charAt(i)=='B')
			Freq[35]++;
		else if(message.charAt(i)=='M')
			Freq[36]++;
		else if(message.charAt(i)=='N')
			Freq[37]++;
		else if(message.charAt(i)=='S')
			Freq[38]++;
		else if(message.charAt(i)=='R')
			Freq[39]++;
		else if(message.charAt(i)=='j')
			Freq[40]++;
		else if(message.charAt(i)=='q')
			Freq[41]++;
		else if(message.charAt(i)=='z')
			Freq[42]++;
		else if(message.charAt(i)=='x')
			Freq[43]++;
		else if(message.charAt(i)=='H')
			Freq[44]++;
		else if(message.charAt(i)=='!')
			Freq[45]++;
		else if(message.charAt(i)=='D')
			Freq[46]++;
		else if(message.charAt(i)=='E')
			Freq[47]++;
		else if(message.charAt(i)=='F')
			Freq[48]++;
		else if(message.charAt(i)=='G')
			Freq[49]++;
		else if(message.charAt(i)=='C')
			Freq[50]++;
		else if(message.charAt(i)=='O')
			Freq[51]++;
		else if(message.charAt(i)=='K')
			Freq[52]++;
		else if(message.charAt(i)=='W')
			Freq[53]++;
		else if(message.charAt(i)=='V')
			Freq[54]++;
		else if(message.charAt(i)=='Y')
			Freq[55]++;
		else if(message.charAt(i)=='X')
			Freq[56]++;	
		else if(message.charAt(i)==';')
			Freq[57]++;
		else if(message.charAt(i)=='(')
			Freq[58]++;
		else if(message.charAt(i)==')')
			Freq[59]++;
		else if(message.charAt(i)==':')
			Freq[60]++;
		else if(message.charAt(i)=='L')
			Freq[61]++;
		else if(message.charAt(i)=='*')
			Freq[62]++;	
		else if(message.charAt(i)=='1')
			Freq[63]++;
		else if(message.charAt(i)=='J')
			Freq[64]++;
		else if(message.charAt(i)=='2')
			Freq[65]++;
		else if(message.charAt(i)=='0')
			Freq[66]++;
		else if(message.charAt(i)=='8')
			Freq[67]++;
		else if(message.charAt(i)=='U')
			Freq[68]++;	
		else if(message.charAt(i)=='3')
			Freq[69]++;
		else if(message.charAt(i)=='6')
			Freq[70]++;
		else if(message.charAt(i)=='5')
			Freq[71]++;
		else if(message.charAt(i)=='/')
			Freq[72]++;
		else if(message.charAt(i)=='7')
			Freq[73]++;
		else if(message.charAt(i)=='4')
			Freq[74]++;	
		else if(message.charAt(i)=='9')
			Freq[75]++;
		else if(message.charAt(i)=='Q')
			Freq[76]++;
		else if(message.charAt(i)=='Z')
			Freq[77]++;
		else if(message.charAt(i)=='ê')
			Freq[78]++;
		else if(message.charAt(i)=='@')
			Freq[79]++;
		else if(message.charAt(i)==']')
			Freq[80]++;	
		else if(message.charAt(i)=='[')
			Freq[81]++;	
		else if(message.charAt(i)=='ä')
			Freq[82]++;	
		else if(message.charAt(i)=='á')
			Freq[83]++;	
		else if(message.charAt(i)=='é')
			Freq[84]++;	
		else if(message.charAt(i)=='#')
			Freq[85]++;	
		else if(message.charAt(i)=='$')
			Freq[86]++;	
		else if(message.charAt(i)=='%')
			Freq[87]++;	
		else if(message.charAt(i)=='=')
			Freq[88]++;			
		else if(message.charAt(i)=='~')
			Freq[89]++;
		else if(message.charAt(i)=='{')
			Freq[90]++;
		else if(message.charAt(i)=='}')
			Freq[91]++;
		
		}		
}
	
	public void FreqString(){
		
		for(int i = 0; i<Character.length; i++){
			System.out.println("Char: " + Character[i] + " Frequency: " + Freq[i]);
		}
		
	}
	
	public int getFreq(int i){
		return Freq[i];
	}
	
	public char getChar(int i){
		
		return Character[i];
	}
	
	
}
