import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class CEX3 {
	public static void main(String[] args) throws IOException {
		long start=System.currentTimeMillis();
		int counter=0;
		int i=0;
		int NumOfFiles = 0;
		int []arr = new int [1000];
		File out = new File("answer.txt"); 
		BufferedWriter bw = new BufferedWriter(new FileWriter(out));
		String temp="";
		File Folder = new File("data");
		BufferedReader br =null;
		for(File f:Folder.listFiles())
		{	
			NumOfFiles++;
			br = new BufferedReader(new FileReader(f.getAbsolutePath()));
			temp = br.readLine();
			temp = temp.substring(0, temp.indexOf(" "));
			arr[i]=Integer.valueOf(temp);
			i++;
		}
		br.close();
		br = new BufferedReader(new FileReader("msg.txt"));
		char source = br.readLine().charAt(0);
		int x;
		for (int j = 0; j < 999999999&&counter<NumOfFiles; j++) {
			x=Basic_Enc.enc(source, j);
			for(i =0;i<1000&&counter<NumOfFiles;i++)
			{
				if(arr[i]==x)
				{
					counter++;
					System.out.println("num"+i+"pass: "+j);
					bw.write("enc_"+i+"_msg.txt key ="+ j);
					bw.newLine();	
				}
			}
		}
		bw.close();
		System.out.println("number of keys:"+counter);
		long end=System.currentTimeMillis();
		System.out.println((end-start)/1000);
	}
}
